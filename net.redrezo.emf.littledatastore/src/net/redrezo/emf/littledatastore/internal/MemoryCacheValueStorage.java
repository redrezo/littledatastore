package net.redrezo.emf.littledatastore.internal;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

import net.redrezo.emf.littledatastore.LDSId;

public class MemoryCacheValueStorage extends AValueStorage {

	private Map<LDSId, WeakReference<ValueHolder>> cache = new HashMap<LDSId, WeakReference<ValueHolder>>();
	
	public MemoryCacheValueStorage(AValueStorage parent) {
		super(parent, Mode.CACHE);
	}

	@Override
	protected ValueHolder doGetValue(LDSId id) {
		WeakReference<ValueHolder> ref = cache.get(id);
		return ref!=null?ref.get():null;
	}

	@Override
	protected ValueHolder doSetValue(LDSId id, ValueHolder value) {
		WeakReference<ValueHolder> oldRef = cache.put(id, new WeakReference<ValueHolder>(value));
		return oldRef!=null?oldRef.get():null;
	}

	@Override
	protected boolean doIsValueSet(LDSId id) {
		return cache.containsKey(id);
	}

}
