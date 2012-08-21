package net.redrezo.emf.littledatastore.internal;

import net.redrezo.emf.littledatastore.LDSId;

public interface Storage {
	ValueHolder getValue(LDSId id);
	ValueHolder setValue(LDSId id, ValueHolder holder);
	boolean isValueSet(LDSId id);
}
