/**
 */
package entities;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link entities.Link#getSource <em>Source</em>}</li>
 *   <li>{@link entities.Link#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see entities.EntitiesPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(Device)
	 * @see entities.EntitiesPackage#getLink_Source()
	 * @model
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link entities.Link#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device source);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(Device)
	 * @see entities.EntitiesPackage#getLink_Destination()
	 * @model
	 * @generated
	 */
	Device getDestination();

	/**
	 * Sets the value of the '{@link entities.Link#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Device destination);

} // Link
