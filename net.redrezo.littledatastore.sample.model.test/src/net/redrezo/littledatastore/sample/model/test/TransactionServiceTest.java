package net.redrezo.littledatastore.sample.model.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import net.redrezo.emf.littledatastore.Transaction;
import net.redrezo.emf.littledatastore.TransactionService.TransactionException;
import net.redrezo.littledatastore.model.SampleFactory;
import net.redrezo.littledatastore.model.SamplePackage;
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
			store.getTransactionService().openTransaction();
			// this should open a transaction
			SomeDomainObject o = SampleFactory.eINSTANCE
					.createSomeDomainObject();
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
	public void testWithoutTransactionFactory() {
		try {
			assertNull(store.getTransaction());
			SampleFactory.eINSTANCE.createSomeDomainObject();
			fail();
		} catch (TransactionException e) {
			// ok :)
		}
	}

	@Test
	public void testWithoutTransactionStore() {
		try {
			assertNull(store.getTransaction());
			store.create(SamplePackage.eINSTANCE.getSomeDomainObject());
			fail();
		} catch (TransactionException e) {
			// ok :)
		}
	}

	@Test
	public void testOpenTranaction() {
		try {
			Transaction t = store.openTransaction();
			assertSame(t, store.getTransaction());
		} finally {
			try {
				store.getTransaction().rollback();
			} catch (UnsupportedOperationException e) {
				// TODO remove when implemented
			}
		}
	}

	@Test
	public void testDirty() {
		Transaction t = store.openTransaction();
		SomeDomainObject o = SampleFactory.eINSTANCE.createSomeDomainObject();
		o.setName("bla");
		assertTrue(t.isDirty());
		try {
			t.rollback();
		} catch (UnsupportedOperationException e) {
			// TODO remove when implemented
		}
	}
}
