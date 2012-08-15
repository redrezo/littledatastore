package net.redrezo.emf.littledatastore.internal;

import java.util.HashMap;
import java.util.Map;

import net.redrezo.emf.littledatastore.LDSId;

public class SimpleMemoryValueStorage extends AValueStorage {
	
	private Map<LDSId, ValueHolder> storage = new HashMap<LDSId, ValueHolder>();

	public SimpleMemoryValueStorage() {
		super(null, Mode.DEFAULT);
	}
	
	@Override
	protected ValueHolder doGetValue(LDSId id) {
		return storage.get(id);
	}

	@Override
	protected ValueHolder doSetValue(LDSId id, ValueHolder value) {
		return storage.put(id, value);
	}

	@Override
	protected boolean doIsValueSet(LDSId id) {
		return storage.containsKey(id);
	}
}
