package net.redrezo.emf.littledatastore.internal;

import java.util.HashMap;
import java.util.Map;

import net.redrezo.emf.littledatastore.LDSId;

public class Transaction extends AValueStorage {

	private Map<LDSId, ValueHolder> transactionStorage = new HashMap<LDSId, ValueHolder>();
	
	public Transaction(AValueStorage parent) {
		super(parent, Mode.DEFAULT);
		System.err.println("NEW TRANSACTION");
	}

	@Override
	protected ValueHolder doGetValue(LDSId id) {
		return transactionStorage.get(id);
	}

	@Override
	protected ValueHolder doSetValue(LDSId id, ValueHolder value) {
		return transactionStorage.put(id, value);
	}

	@Override
	protected boolean doIsValueSet(LDSId id) {
		return transactionStorage.containsKey(id);
	}
	
	public void commit() {
		// push changes to parent storage
	}
}
