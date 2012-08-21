package net.redrezo.littledatastore.sample.model.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import net.redrezo.emf.littledatastore.Transaction;
import net.redrezo.emf.littledatastore.TransactionService.TransactionException;
import net.redrezo.littledatastore.model.SampleFactory;
import net.redrezo.littledatastore.model.SomeDomainObject;

import org.junit.Test;

public class TransactionServiceTest extends LDSTest {

	@Test
	public void testNoTransaction() {
		assertNull(store.getTransactionService().getTransaction());
	}
	
	@Test
	public void testTransaction() {
		Transaction t = store.getTransactionService().openTransaction();
		assertNotNull(t);
		assertFalse(t.isDirty());
		try {
			t.rollback();
		} catch (UnsupportedOperationException e) {
			// TODO remove when implemented
		}
	}

	@Test
	public void testDuplicateTransaction1() {
		try {
			store.getTransactionService().openTransaction();
			store.getTransactionService().openTransaction();
			fail();
		} catch (TransactionException e) {
			// ok :)
		} finally {
			try {
				store.getTransactionService().getTransaction().rollback();
			} catch (UnsupportedOperationException e) {
				// TODO remove when implemented
			}
		}
	}

	@Test
	public void testDuplicateTransaction2() {
		try {
			// this should open a transaction
			SomeDomainObject o = SampleFactory.eINSTANCE.createSomeDomainObject();
			o.setName("bla");
			// so we can't open another one
			store.getTransactionService().openTransaction();
			fail();
		} catch (TransactionException e) {
			// ok :)
		} finally {
			try {
				store.getTransactionService().getTransaction().rollback();
			} catch (UnsupportedOperationException e) {
				// TODO remove when implemented
			}
		}
	}

	@Test
	public void testDirty() {
		SomeDomainObject o = SampleFactory.eINSTANCE.createSomeDomainObject();
		o.setName("bla");
		Transaction t = store.getTransactionService().getTransaction();
		assertTrue(t.isDirty());
		try {
			t.rollback();
		} catch (UnsupportedOperationException e) {
			// TODO remove when implemented
		}
	}
}
