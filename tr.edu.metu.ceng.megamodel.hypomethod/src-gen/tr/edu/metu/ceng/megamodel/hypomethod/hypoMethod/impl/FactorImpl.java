/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Factor;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Values;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.VariableType;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.FactorImpl#getFactorName <em>Factor Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.FactorImpl#getFactorType <em>Factor Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.FactorImpl#getFactorType1 <em>Factor Type1</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.FactorImpl#getFactorValue <em>Factor Value</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.FactorImpl#getFactorProperties <em>Factor Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorImpl extends MinimalEObjectImpl.Container implements Factor
{
  /**
   * The default value of the '{@link #getFactorName() <em>Factor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorName()
   * @generated
   * @ordered
   */
  protected static final String FACTOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactorName() <em>Factor Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorName()
   * @generated
   * @ordered
   */
  protected String factorName = FACTOR_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFactorType() <em>Factor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorType()
   * @generated
   * @ordered
   */
  protected static final VariableType FACTOR_TYPE_EDEFAULT = VariableType.QUALITATIVE;

  /**
   * The cached value of the '{@link #getFactorType() <em>Factor Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorType()
   * @generated
   * @ordered
   */
  protected VariableType factorType = FACTOR_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFactorType1() <em>Factor Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorType1()
   * @generated
   * @ordered
   */
  protected static final String FACTOR_TYPE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFactorType1() <em>Factor Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorType1()
   * @generated
   * @ordered
   */
  protected String factorType1 = FACTOR_TYPE1_EDEFAULT;

  /**
   * The cached value of the '{@link #getFactorValue() <em>Factor Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorValue()
   * @generated
   * @ordered
   */
  protected Values factorValue;

  /**
   * The cached value of the '{@link #getFactorProperties() <em>Factor Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorProperties()
   * @generated
   * @ordered
   */
  protected EList<properties> factorProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactorImpl()
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
    return HypoMethodPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactorName()
  {
    return factorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactorName(String newFactorName)
  {
    String oldFactorName = factorName;
    factorName = newFactorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.FACTOR__FACTOR_NAME, oldFactorName, factorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getFactorType()
  {
    return factorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactorType(VariableType newFactorType)
  {
    VariableType oldFactorType = factorType;
    factorType = newFactorType == null ? FACTOR_TYPE_EDEFAULT : newFactorType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.FACTOR__FACTOR_TYPE, oldFactorType, factorType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFactorType1()
  {
    return factorType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactorType1(String newFactorType1)
  {
    String oldFactorType1 = factorType1;
    factorType1 = newFactorType1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.FACTOR__FACTOR_TYPE1, oldFactorType1, factorType1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values getFactorValue()
  {
    return factorValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactorValue(Values newFactorValue, NotificationChain msgs)
  {
    Values oldFactorValue = factorValue;
    factorValue = newFactorValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HypoMethodPackage.FACTOR__FACTOR_VALUE, oldFactorValue, newFactorValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactorValue(Values newFactorValue)
  {
    if (newFactorValue != factorValue)
    {
      NotificationChain msgs = null;
      if (factorValue != null)
        msgs = ((InternalEObject)factorValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HypoMethodPackage.FACTOR__FACTOR_VALUE, null, msgs);
      if (newFactorValue != null)
        msgs = ((InternalEObject)newFactorValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HypoMethodPackage.FACTOR__FACTOR_VALUE, null, msgs);
      msgs = basicSetFactorValue(newFactorValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.FACTOR__FACTOR_VALUE, newFactorValue, newFactorValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<properties> getFactorProperties()
  {
    if (factorProperties == null)
    {
      factorProperties = new EObjectContainmentEList<properties>(properties.class, this, HypoMethodPackage.FACTOR__FACTOR_PROPERTIES);
    }
    return factorProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HypoMethodPackage.FACTOR__FACTOR_VALUE:
        return basicSetFactorValue(null, msgs);
      case HypoMethodPackage.FACTOR__FACTOR_PROPERTIES:
        return ((InternalEList<?>)getFactorProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case HypoMethodPackage.FACTOR__FACTOR_NAME:
        return getFactorName();
      case HypoMethodPackage.FACTOR__FACTOR_TYPE:
        return getFactorType();
      case HypoMethodPackage.FACTOR__FACTOR_TYPE1:
        return getFactorType1();
      case HypoMethodPackage.FACTOR__FACTOR_VALUE:
        return getFactorValue();
      case HypoMethodPackage.FACTOR__FACTOR_PROPERTIES:
        return getFactorProperties();
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
      case HypoMethodPackage.FACTOR__FACTOR_NAME:
        setFactorName((String)newValue);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_TYPE:
        setFactorType((VariableType)newValue);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_TYPE1:
        setFactorType1((String)newValue);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_VALUE:
        setFactorValue((Values)newValue);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_PROPERTIES:
        getFactorProperties().clear();
        getFactorProperties().addAll((Collection<? extends properties>)newValue);
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
      case HypoMethodPackage.FACTOR__FACTOR_NAME:
        setFactorName(FACTOR_NAME_EDEFAULT);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_TYPE:
        setFactorType(FACTOR_TYPE_EDEFAULT);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_TYPE1:
        setFactorType1(FACTOR_TYPE1_EDEFAULT);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_VALUE:
        setFactorValue((Values)null);
        return;
      case HypoMethodPackage.FACTOR__FACTOR_PROPERTIES:
        getFactorProperties().clear();
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
      case HypoMethodPackage.FACTOR__FACTOR_NAME:
        return FACTOR_NAME_EDEFAULT == null ? factorName != null : !FACTOR_NAME_EDEFAULT.equals(factorName);
      case HypoMethodPackage.FACTOR__FACTOR_TYPE:
        return factorType != FACTOR_TYPE_EDEFAULT;
      case HypoMethodPackage.FACTOR__FACTOR_TYPE1:
        return FACTOR_TYPE1_EDEFAULT == null ? factorType1 != null : !FACTOR_TYPE1_EDEFAULT.equals(factorType1);
      case HypoMethodPackage.FACTOR__FACTOR_VALUE:
        return factorValue != null;
      case HypoMethodPackage.FACTOR__FACTOR_PROPERTIES:
        return factorProperties != null && !factorProperties.isEmpty();
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
    result.append(" (factorName: ");
    result.append(factorName);
    result.append(", factorType: ");
    result.append(factorType);
    result.append(", factorType1: ");
    result.append(factorType1);
    result.append(')');
    return result.toString();
  }

} //FactorImpl
