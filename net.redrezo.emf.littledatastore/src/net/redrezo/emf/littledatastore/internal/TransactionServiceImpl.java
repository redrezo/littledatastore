package net.redrezo.emf.littledatastore.internal;

import net.redrezo.emf.littledatastore.Transaction;
import net.redrezo.emf.littledatastore.TransactionService;

public class TransactionServiceImpl implements TransactionService {
	private final LittleDataStoreImpl store;
	
	public TransactionServiceImpl(LittleDataStoreImpl store) {
		this.store = store;
	}

	private ThreadLocal<Transaction> transaction = new ThreadLocal<Transaction>();
	
	@Override
	public Transaction openTransaction() {
		if (transaction.get() != null) {
			throw new TransactionException("you already have an active transaction");
		}
		Transaction t = new TransactionImpl(store);
		transaction.set(t); 
		return t;
	}

	@Override
	public Transaction getTransaction() {
		return transaction.get();
	}
	
	void disposeTransaction() {
		Transaction t = getTransaction(); 
		if (t == null) {
			throw new TransactionException("no active transaction");
		}
		if (t.isDirty()) {
			throw new TransactionException("transaction is dirty");
		}
		transaction.set(null); 
	}
}
