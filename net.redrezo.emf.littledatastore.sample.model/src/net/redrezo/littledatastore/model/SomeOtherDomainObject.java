/**
 */
package net.redrezo.littledatastore.model;

import net.redrezo.emf.littledatastore.LDSObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Other Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.redrezo.littledatastore.model.SomeOtherDomainObject#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeOtherDomainObject()
 * @model kind="class"
 * @generated
 */
public class SomeOtherDomainObject extends LDSObject implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SomeOtherDomainObject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.SOME_OTHER_DOMAIN_OBJECT;
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see net.redrezo.littledatastore.model.SamplePackage#getSomeOtherDomainObject_Size()
	 * @model
	 * @generated
	 */
	public float getSize() {
		return (Float)eGet(SamplePackage.Literals.SOME_OTHER_DOMAIN_OBJECT__SIZE, true);
	}

	/**
	 * Sets the value of the '{@link net.redrezo.littledatastore.model.SomeOtherDomainObject#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	public void setSize(float newSize) {
		eSet(SamplePackage.Literals.SOME_OTHER_DOMAIN_OBJECT__SIZE, newSize);
	}

} // SomeOtherDomainObject
