package net.redrezo.emf.littledatastore;

import net.redrezo.emf.littledatastore.internal.LittleDataStoreImpl;
import net.redrezo.emf.littledatastore.internal.TransactionImpl;
import net.redrezo.emf.littledatastore.internal.ValueHolder;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class LDSObject extends EStoreEObjectImpl {

	private LDSId ldsId;

	public void setLDSId(LDSId id) {
		this.ldsId = id;
	}

	public LDSId getLDSId() {
		return this.ldsId;
	}

	@Override
	protected boolean eIsCaching() {
		return false;
	}

	@Override
	public EStore eStore() {
		if (eStore == null) {
			BundleContext ctx = FrameworkUtil.getBundle(getClass())
					.getBundleContext();
			ServiceReference<LittleDataStore> serviceReference = ctx
					.getServiceReference(LittleDataStore.class);
			final LittleDataStoreImpl store = (LittleDataStoreImpl) ctx.getService(serviceReference);

			TransactionImpl t = store.getOrOpenTransaction();
			eSetStore(store);
			setLDSId(LDSId.createObjectId());
			t.setValue(getLDSId(), ValueHolder.createAttributeHolder(this));
		}
		return eStore;
	}
}
