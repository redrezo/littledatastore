package net.redrezo.emf.littledatastore;


@SuppressWarnings("serial")
public interface TransactionService {
	Transaction openTransaction();
	/**
	 * returns the current transaction, if there is one.
	 * @return current transaction or null
	 */
	Transaction getTransaction();

	public static class TransactionException extends RuntimeException {
		public TransactionException(String string) {
			super(string);
		}
	}
}
