/**
 */
package net.redrezo.littledatastore.model;

import net.redrezo.emf.littledatastore.LDSObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.redrezo.littledatastore.model.SomeDomainObject#getName <em>Name</em>}</li>
 *   <li>{@link net.redrezo.littledatastore.model.SomeDomainObject#getNumber <em>Number</em>}</li>
 *   <li>{@link net.redrezo.littledatastore.model.SomeDomainObject#getSomeref <em>Someref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject()
 * @model kind="class"
 * @generated
 */
public class SomeDomainObject extends LDSObject implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeDomainObject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.SOME_DOMAIN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__NAME, true);
	}

	/**
	 * Sets the value of the '{@link net.redrezo.littledatastore.model.SomeDomainObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__NAME, newName);
	}

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject_Number()
	 * @model
	 * @generated
	 */
	public int getNumber() {
		return (Integer)eGet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__NUMBER, true);
	}

	/**
	 * Sets the value of the '{@link net.redrezo.littledatastore.model.SomeDomainObject#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	public void setNumber(int newNumber) {
		eSet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__NUMBER, newNumber);
	}

	/**
	 * Returns the value of the '<em><b>Someref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Someref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Someref</em>' reference.
	 * @see #setSomeref(SomeOtherDomainObject)
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeDomainObject_Someref()
	 * @model
	 * @generated
	 */
	public SomeOtherDomainObject getSomeref() {
		return (SomeOtherDomainObject)eGet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__SOMEREF, true);
	}

	/**
	 * Sets the value of the '{@link net.redrezo.littledatastore.model.SomeDomainObject#getSomeref <em>Someref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Someref</em>' reference.
	 * @see #getSomeref()
	 * @generated
	 */
	public void setSomeref(SomeOtherDomainObject newSomeref) {
		eSet(SamplePackage.Literals.SOME_DOMAIN_OBJECT__SOMEREF, newSomeref);
	}

} // SomeDomainObject
