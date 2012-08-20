package net.redrezo.littledatastore.sample.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;
import net.redrezo.emf.littledatastore.LittleDataStore;
import net.redrezo.littledatastore.model.SampleFactory;
import net.redrezo.littledatastore.model.SamplePackage;
import net.redrezo.littledatastore.model.SomeDomainObject;
import net.redrezo.littledatastore.model.SomeOtherDomainObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LDSTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimple() {
		final String NAME = "my first object";
		final float SIZE = 21.0f;
		final int NUMBER = 1;
		LittleDataStore s = new LittleDataStore();

		SomeDomainObject obj = (SomeDomainObject) s
				.create(SamplePackage.eINSTANCE.getSomeDomainObject());
		SomeOtherDomainObject otherObj = (SomeOtherDomainObject) s
				.create(SamplePackage.eINSTANCE.getSomeOtherDomainObject());
		
		obj.setName(NAME);
		obj.setNumber(NUMBER);
		otherObj.setSize(SIZE);

		assertNull(obj.getSomeref());
		obj.setSomeref(otherObj);
		
		assertSame(otherObj, obj.getSomeref());
		assertEquals(SIZE, obj.getSomeref().getSize(), 0f);
		assertEquals(NAME, obj.getName());
		assertEquals(NUMBER, obj.getNumber());
		
		assertTrue(otherObj.eStore() instanceof LittleDataStore);
		assertTrue(otherObj.eStore() == obj.eStore());
	}

	@Test
	public void testWithFactory() {
		final String NAME = "my first object";
		final float SIZE = 21.0f;
		final int NUMBER = 1;
		LittleDataStore s = new LittleDataStore();

		SomeDomainObject obj = (SomeDomainObject) s
				.create(SamplePackage.eINSTANCE.getSomeDomainObject());
//		SomeOtherDomainObject otherObj = (SomeOtherDomainObject) s
//				.create(SamplePackage.eINSTANCE.getSomeOtherDomainObject());
		SomeOtherDomainObject otherObj = SampleFactory.eINSTANCE.createSomeOtherDomainObject();
		
		obj.setName(NAME);
		obj.setNumber(NUMBER);
		otherObj.setSize(SIZE);

		assertNull(obj.getSomeref());
		obj.setSomeref(otherObj);
		
		assertSame(otherObj, obj.getSomeref());
		assertEquals(SIZE, obj.getSomeref().getSize(), 0f);
		assertEquals(NAME, obj.getName());
		assertEquals(NUMBER, obj.getNumber());
		
		assertTrue(otherObj.eStore() instanceof LittleDataStore);
		assertTrue(otherObj.eStore() == obj.eStore());
	}
}
