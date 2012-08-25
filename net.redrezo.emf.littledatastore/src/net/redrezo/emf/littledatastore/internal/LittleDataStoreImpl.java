package net.redrezo.emf.littledatastore.internal;

import net.redrezo.emf.littledatastore.LDSId;
import net.redrezo.emf.littledatastore.LDSObject;
import net.redrezo.emf.littledatastore.LittleDataStore;
import net.redrezo.emf.littledatastore.Transaction;
import net.redrezo.emf.littledatastore.TransactionService;
import net.redrezo.emf.littledatastore.internal.ValueHolder.ValueType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class LittleDataStoreImpl implements LittleDataStore {
	private TransactionServiceImpl transactionService;

	public LittleDataStoreImpl() {
		transactionService = new TransactionServiceImpl(this);
	}

	/*
	 * checks if there is a current transaction and returns it. if there is no
	 * current transaction, throws a Runtime exception
	 * 
	 * @return
	 */
	private TransactionImpl checkTransaction() {
		TransactionImpl t = (TransactionImpl) getTransaction();
		if (t == null) {
			throw new TransactionService.TransactionException(
					"no active transaction");
		}
		return t;
	}

	/**
	 * returns the current transaction, if there is one.
	 * 
	 * @return current transaction or a new one
	 */
	public TransactionImpl getOrOpenTransaction() {
		TransactionImpl currentTransaction = (TransactionImpl) getTransaction();
		if (currentTransaction == null) {
			currentTransaction = (TransactionImpl) transactionService
					.openTransaction();
		}
		return currentTransaction;
	}

	private AValueStorage dataStore = new SimpleMemoryValueStorage();

	private AValueStorage memCache = new MemoryCacheValueStorage(dataStore);

	private <T> T unwrapHolder(Storage currentStorage, ValueHolder holder) {
		if (holder == null)
			return null;
		if (holder.type == ValueType.ATTRIBUTE)
			return (T) holder.value;
		if (holder.type == ValueType.REFERENCE)
			return unwrapHolder(currentStorage,
					currentStorage.getValue((LDSId) holder.value));
		throw new LDSException("could not unwrap holder!?");
	}

	private <T> T getValue(InternalEObject object, EStructuralFeature feature,
			int index) {
		TransactionImpl t = (TransactionImpl) getTransaction();
		Storage s = t != null ? t : memCache;

		LDSId id;
		if (index == NO_INDEX) {
			id = LDSId.getObjectValueId(object, feature);
		} else {
			id = LDSId.getObjectListValueId(object, feature, index);
		}
		ValueHolder holder = s.getValue(id);
		return unwrapHolder(s, holder);
	}

	// private <T> T getValueWithTransaction(InternalEObject object,
	// EStructuralFeature feature) {
	// TransactionImpl t = checkTransaction();
	// ValueHolder holder = t.getValue(LDSId.getObjectValueId(object, feature));
	// return unwrapHolder(t, holder);
	// }
	//
	private <T> T setValueWithTransaction(InternalEObject object,
			EStructuralFeature feature, int index, Object value) {
		TransactionImpl t = checkTransaction();

		LDSId id;
		if (index == NO_INDEX) {
			id = LDSId.getObjectValueId(object, feature);
		} else {
			id = LDSId.getObjectListValueId(object, feature, index);
		}

		ValueHolder newVal;
		if (feature instanceof EReference) {
			newVal = ValueHolder.createReferenceHolder(value);
		} else { // instanceof EAttribute (hopefully)
			newVal = ValueHolder.createAttributeHolder(value);
		}

		ValueHolder oldHolder = t.setValue(id, newVal);

		return unwrapHolder(t, oldHolder);
	}

	@Override
	public Object get(InternalEObject object, EStructuralFeature feature,
			int index) {
		return getValue(object, feature, index);
	}

	@Override
	public Object set(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		return setValueWithTransaction(object, feature, index, value);
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		// fix this
		TransactionImpl t = getOrOpenTransaction();
		if (t != null) {
			return t.isValueSet(LDSId.getObjectValueId(object, feature));
		} else {
			return memCache.isValueSet(LDSId.getObjectValueId(object, feature));
		}
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		Transaction t = checkTransaction();
		// t.unset()
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature,
			Object value) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public void add(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature,
			int index) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public Object move(InternalEObject object, EStructuralFeature feature,
			int targetIndex, int sourceIndex) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature,
			T[] array) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public EObject create(EClass eClass) {
		TransactionImpl t = checkTransaction();
		EObject newInstance = EcoreUtil.create(eClass);

		((LDSObject) newInstance).setLDSId(LDSId.createObjectId());

		((InternalEObject) newInstance).eSetStore(this);

		t.setValue(((LDSObject) newInstance).getLDSId(),
				ValueHolder.createAttributeHolder(newInstance));

		return newInstance;
	}

	@Override
	public TransactionService getTransactionService() {
		return transactionService;
	}

	@Override
	public Transaction openTransaction() {
		return transactionService.openTransaction();
	}

	@Override
	public Transaction getTransaction() {
		return transactionService.getTransaction();
	}

	void disposeTransaction() {
		transactionService.disposeTransaction();	
	}
}
