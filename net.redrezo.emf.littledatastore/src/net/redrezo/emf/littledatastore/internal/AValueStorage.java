package net.redrezo.emf.littledatastore.internal;

import net.redrezo.emf.littledatastore.LDSId;

public abstract class AValueStorage implements Storage {
	
	enum Mode {
		DEFAULT,
		CACHE;
	}
	
	protected final AValueStorage parent;
	protected final Mode mode;
	
	public AValueStorage(AValueStorage parent, Mode mode) {
		this.parent = parent;
		this.mode = mode;
	}
	
	@Override
	public ValueHolder getValue(LDSId id) {
		
		ValueHolder holder = doGetValue(id);
		if (holder == null && parent != null) {
			holder = parent.getValue(id);
			if (mode == Mode.CACHE) { // in cache mode we store the parent's object
				doSetValue(id, holder);
			}
		}
		
		return holder;
	}
	
	@Override
	public ValueHolder setValue(LDSId id, ValueHolder holder) {
		
		ValueHolder oldHolder = doSetValue(id, holder);
		if (oldHolder == null && parent != null) {
			oldHolder = parent.getValue(id);
		}
		
		return oldHolder;
	}
	
	@Override
	public boolean isValueSet(LDSId id) {
		boolean result = doIsValueSet(id);
		if (!result) {
			result = parent.isValueSet(id);
		}
		return result;
	}
	
	
	protected abstract ValueHolder doGetValue(LDSId id);
	protected abstract ValueHolder doSetValue(LDSId id, ValueHolder value);
	protected abstract boolean doIsValueSet(LDSId id);
}
