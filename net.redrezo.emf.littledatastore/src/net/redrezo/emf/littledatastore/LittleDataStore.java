package net.redrezo.emf.littledatastore;

import org.eclipse.emf.ecore.InternalEObject.EStore;

@SuppressWarnings("serial")
public interface LittleDataStore extends EStore {

	public static class LDSException extends RuntimeException {

		public LDSException(String string) {
			super(string);
		}
	}
	
	TransactionService getTransactionService();

	Transaction openTransaction();
	/**
	 * returns the current transaction, if there is one.
	 * @return current transaction or null
	 */
	Transaction getTransaction();
}
