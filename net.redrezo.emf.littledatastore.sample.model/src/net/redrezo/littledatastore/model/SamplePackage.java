/**
 */
package net.redrezo.littledatastore.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.redrezo.littledatastore.model.SampleFactory
 * @model kind="package"
 * @generated
 */
public class SamplePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://redrezo.net/littledatastore/sample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "littledatastoresample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SamplePackage eINSTANCE = net.redrezo.littledatastore.model.SamplePackage.init();

	/**
	 * The meta object id for the '{@link net.redrezo.littledatastore.model.SomeDomainObject <em>Some Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.redrezo.littledatastore.model.SomeDomainObject
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject()
	 * @generated
	 */
	public static final int SOME_DOMAIN_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_DOMAIN_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_DOMAIN_OBJECT__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Someref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_DOMAIN_OBJECT__SOMEREF = 2;

	/**
	 * The number of structural features of the '<em>Some Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_DOMAIN_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.redrezo.littledatastore.model.SomeOtherDomainObject <em>Some Other Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.redrezo.littledatastore.model.SomeOtherDomainObject
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeOtherDomainObject()
	 * @generated
	 */
	public static final int SOME_OTHER_DOMAIN_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_OTHER_DOMAIN_OBJECT__SIZE = 0;

	/**
	 * The number of structural features of the '<em>Some Other Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SOME_OTHER_DOMAIN_OBJECT_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someDomainObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someOtherDomainObjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.redrezo.littledatastore.model.SamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SamplePackage() {
		super(eNS_URI, SampleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SamplePackage init() {
		if (isInited) return (SamplePackage)EPackage.Registry.INSTANCE.getEPackage(SamplePackage.eNS_URI);

		// Obtain or create and register package
		SamplePackage theSamplePackage = (SamplePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SamplePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SamplePackage());

		isInited = true;

		// Create package meta-data objects
		theSamplePackage.createPackageContents();

		// Initialize created meta-data
		theSamplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSamplePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SamplePackage.eNS_URI, theSamplePackage);
		return theSamplePackage;
	}


	/**
	 * Returns the meta object for class '{@link net.redrezo.littledatastore.model.SomeDomainObject <em>Some Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Domain Object</em>'.
	 * @see net.redrezo.littledatastore.model.SomeDomainObject
	 * @generated
	 */
	public EClass getSomeDomainObject() {
		return someDomainObjectEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link net.redrezo.littledatastore.model.SomeDomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.redrezo.littledatastore.model.SomeDomainObject#getName()
	 * @see #getSomeDomainObject()
	 * @generated
	 */
	public EAttribute getSomeDomainObject_Name() {
		return (EAttribute)someDomainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link net.redrezo.littledatastore.model.SomeDomainObject#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.redrezo.littledatastore.model.SomeDomainObject#getNumber()
	 * @see #getSomeDomainObject()
	 * @generated
	 */
	public EAttribute getSomeDomainObject_Number() {
		return (EAttribute)someDomainObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link net.redrezo.littledatastore.model.SomeDomainObject#getSomeref <em>Someref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Someref</em>'.
	 * @see net.redrezo.littledatastore.model.SomeDomainObject#getSomeref()
	 * @see #getSomeDomainObject()
	 * @generated
	 */
	public EReference getSomeDomainObject_Someref() {
		return (EReference)someDomainObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link net.redrezo.littledatastore.model.SomeOtherDomainObject <em>Some Other Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Other Domain Object</em>'.
	 * @see net.redrezo.littledatastore.model.SomeOtherDomainObject
	 * @generated
	 */
	public EClass getSomeOtherDomainObject() {
		return someOtherDomainObjectEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link net.redrezo.littledatastore.model.SomeOtherDomainObject#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.redrezo.littledatastore.model.SomeOtherDomainObject#getSize()
	 * @see #getSomeOtherDomainObject()
	 * @generated
	 */
	public EAttribute getSomeOtherDomainObject_Size() {
		return (EAttribute)someOtherDomainObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SampleFactory getSampleFactory() {
		return (SampleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		someDomainObjectEClass = createEClass(SOME_DOMAIN_OBJECT);
		createEAttribute(someDomainObjectEClass, SOME_DOMAIN_OBJECT__NAME);
		createEAttribute(someDomainObjectEClass, SOME_DOMAIN_OBJECT__NUMBER);
		createEReference(someDomainObjectEClass, SOME_DOMAIN_OBJECT__SOMEREF);

		someOtherDomainObjectEClass = createEClass(SOME_OTHER_DOMAIN_OBJECT);
		createEAttribute(someOtherDomainObjectEClass, SOME_OTHER_DOMAIN_OBJECT__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(someDomainObjectEClass, SomeDomainObject.class, "SomeDomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSomeDomainObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, SomeDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSomeDomainObject_Number(), ecorePackage.getEInt(), "number", null, 0, 1, SomeDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSomeDomainObject_Someref(), this.getSomeOtherDomainObject(), null, "someref", null, 0, 1, SomeDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(someOtherDomainObjectEClass, SomeOtherDomainObject.class, "SomeOtherDomainObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSomeOtherDomainObject_Size(), ecorePackage.getEFloat(), "size", null, 0, 1, SomeOtherDomainObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link net.redrezo.littledatastore.model.SomeDomainObject <em>Some Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.redrezo.littledatastore.model.SomeDomainObject
		 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject()
		 * @generated
		 */
		public static final EClass SOME_DOMAIN_OBJECT = eINSTANCE.getSomeDomainObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SOME_DOMAIN_OBJECT__NAME = eINSTANCE.getSomeDomainObject_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SOME_DOMAIN_OBJECT__NUMBER = eINSTANCE.getSomeDomainObject_Number();

		/**
		 * The meta object literal for the '<em><b>Someref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SOME_DOMAIN_OBJECT__SOMEREF = eINSTANCE.getSomeDomainObject_Someref();

		/**
		 * The meta object literal for the '{@link net.redrezo.littledatastore.model.SomeOtherDomainObject <em>Some Other Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.redrezo.littledatastore.model.SomeOtherDomainObject
		 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeOtherDomainObject()
		 * @generated
		 */
		public static final EClass SOME_OTHER_DOMAIN_OBJECT = eINSTANCE.getSomeOtherDomainObject();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SOME_OTHER_DOMAIN_OBJECT__SIZE = eINSTANCE.getSomeOtherDomainObject_Size();

	}

} //SamplePackage
