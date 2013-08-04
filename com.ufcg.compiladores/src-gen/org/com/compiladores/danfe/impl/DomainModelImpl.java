/**
 */
package org.com.compiladores.danfe.impl;

import java.util.Collection;

import org.com.compiladores.danfe.DanfePackage;
import org.com.compiladores.danfe.DomainModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.com.compiladores.danfe.impl.DomainModelImpl#getGeetings <em>Geetings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel
{
  /**
   * The cached value of the '{@link #getGeetings() <em>Geetings</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeetings()
   * @generated
   * @ordered
   */
  protected EList<String> geetings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DanfePackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGeetings()
  {
    if (geetings == null)
    {
      geetings = new EDataTypeEList<String>(String.class, this, DanfePackage.DOMAIN_MODEL__GEETINGS);
    }
    return geetings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DanfePackage.DOMAIN_MODEL__GEETINGS:
        return getGeetings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DanfePackage.DOMAIN_MODEL__GEETINGS:
        getGeetings().clear();
        getGeetings().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DanfePackage.DOMAIN_MODEL__GEETINGS:
        getGeetings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DanfePackage.DOMAIN_MODEL__GEETINGS:
        return geetings != null && !geetings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (geetings: ");
    result.append(geetings);
    result.append(')');
    return result.toString();
  }

} //DomainModelImpl
