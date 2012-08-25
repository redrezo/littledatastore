package net.redrezo.emf.littledatastore.internal;

import java.util.HashMap;
import java.util.Map;

import net.redrezo.emf.littledatastore.LDSId;
import net.redrezo.emf.littledatastore.Transaction;

public class TransactionImpl implements Transaction, Storage {

	private Map<LDSId, ValueHolder> transactionStorage = new HashMap<LDSId, ValueHolder>();
	private final LittleDataStoreImpl store;
	
	public TransactionImpl(LittleDataStoreImpl store) {
		this.store = store;
	}

	@Override
	public ValueHolder getValue(LDSId id) {
		return transactionStorage.get(id);
	}

	@Override
	public ValueHolder setValue(LDSId id, ValueHolder value) {
		return transactionStorage.put(id, value);
	}

	@Override
	public boolean isValueSet(LDSId id) {
		return transactionStorage.containsKey(id);
	}
	
	@Override
	public void commit() {
		clearAndDispose();
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public void rollback() {
		clearAndDispose();
		throw new UnsupportedOperationException("implement me!");
	}

	@Override
	public boolean isDirty() {
		return transactionStorage.size() > 0;
	}

	private void clearAndDispose() {
		transactionStorage.clear();
		store.disposeTransaction();
	}
}
