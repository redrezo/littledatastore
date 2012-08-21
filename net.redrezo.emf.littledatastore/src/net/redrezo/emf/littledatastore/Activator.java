package net.redrezo.emf.littledatastore;

import net.redrezo.emf.littledatastore.internal.LittleDataStoreImpl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static final String PLUGIN_ID = "net.redrezo.emf.littledatastore";
	
	private static Activator plugin;
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		plugin = this;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		plugin = null;
	}

	public static Activator getDefault() {
		return plugin;
	}
}
