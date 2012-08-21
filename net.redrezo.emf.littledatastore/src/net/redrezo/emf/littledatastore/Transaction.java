package net.redrezo.emf.littledatastore;

public interface Transaction {
	void commit();
	void rollback();
	boolean isDirty();
}
