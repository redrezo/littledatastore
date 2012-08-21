package net.redrezo.littledatastore.sample.model.test;

import net.redrezo.emf.littledatastore.LittleDataStore;

import org.junit.Before;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class LDSTest {
	protected LittleDataStore store;

	@Before
	public void setUp() throws Exception {
		BundleContext ctx = FrameworkUtil.getBundle(getClass())
				.getBundleContext();
		ServiceReference<LittleDataStore> serviceReference = ctx
				.getServiceReference(LittleDataStore.class);
		store = ctx.getService(serviceReference);
	}
}
