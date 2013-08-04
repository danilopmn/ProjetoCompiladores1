/**
 */
package org.com.compiladores.danfe.impl;

import org.com.compiladores.danfe.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DanfeFactoryImpl extends EFactoryImpl implements DanfeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DanfeFactory init()
  {
    try
    {
      DanfeFactory theDanfeFactory = (DanfeFactory)EPackage.Registry.INSTANCE.getEFactory(DanfePackage.eNS_URI);
      if (theDanfeFactory != null)
      {
        return theDanfeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DanfeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DanfeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DanfePackage.DOMAIN_MODEL: return createDomainModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DanfePackage getDanfePackage()
  {
    return (DanfePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DanfePackage getPackage()
  {
    return DanfePackage.eINSTANCE;
  }

} //DanfeFactoryImpl
