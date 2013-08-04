/**
 */
package org.com.compiladores.danfe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.com.compiladores.danfe.DomainModel#getGeetings <em>Geetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.com.compiladores.danfe.DanfePackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Geetings</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geetings</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geetings</em>' attribute list.
   * @see org.com.compiladores.danfe.DanfePackage#getDomainModel_Geetings()
   * @model unique="false"
   * @generated
   */
  EList<String> getGeetings();

} // DomainModel
