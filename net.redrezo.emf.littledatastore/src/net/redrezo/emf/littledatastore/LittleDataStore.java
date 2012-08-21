package net.redrezo.emf.littledatastore;

import org.eclipse.emf.ecore.InternalEObject.EStore;

@SuppressWarnings("serial")
public interface LittleDataStore extends EStore {

	public static class LDSException extends RuntimeException {

		public LDSException(String string) {
			super(string);
		}
	}
	
	public TransactionService getTransactionService();
}
