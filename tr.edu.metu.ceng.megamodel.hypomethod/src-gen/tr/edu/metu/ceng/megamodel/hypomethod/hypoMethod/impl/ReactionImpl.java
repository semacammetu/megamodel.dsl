/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Reaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ReactionImpl#getAgent1 <em>Agent1</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.impl.ReactionImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionImpl extends MinimalEObjectImpl.Container implements Reaction
{
  /**
   * The default value of the '{@link #getAgent1() <em>Agent1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent1()
   * @generated
   * @ordered
   */
  protected static final String AGENT1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAgent1() <em>Agent1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent1()
   * @generated
   * @ordered
   */
  protected String agent1 = AGENT1_EDEFAULT;

  /**
   * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected static final String AGENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected String agent = AGENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactionImpl()
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
    return HypoMethodPackage.Literals.REACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAgent1()
  {
    return agent1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgent1(String newAgent1)
  {
    String oldAgent1 = agent1;
    agent1 = newAgent1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.REACTION__AGENT1, oldAgent1, agent1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAgent()
  {
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgent(String newAgent)
  {
    String oldAgent = agent;
    agent = newAgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HypoMethodPackage.REACTION__AGENT, oldAgent, agent));
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
      case HypoMethodPackage.REACTION__AGENT1:
        return getAgent1();
      case HypoMethodPackage.REACTION__AGENT:
        return getAgent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HypoMethodPackage.REACTION__AGENT1:
        setAgent1((String)newValue);
        return;
      case HypoMethodPackage.REACTION__AGENT:
        setAgent((String)newValue);
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
      case HypoMethodPackage.REACTION__AGENT1:
        setAgent1(AGENT1_EDEFAULT);
        return;
      case HypoMethodPackage.REACTION__AGENT:
        setAgent(AGENT_EDEFAULT);
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
      case HypoMethodPackage.REACTION__AGENT1:
        return AGENT1_EDEFAULT == null ? agent1 != null : !AGENT1_EDEFAULT.equals(agent1);
      case HypoMethodPackage.REACTION__AGENT:
        return AGENT_EDEFAULT == null ? agent != null : !AGENT_EDEFAULT.equals(agent);
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
    result.append(" (agent1: ");
    result.append(agent1);
    result.append(", agent: ");
    result.append(agent);
    result.append(')');
    return result.toString();
  }

} //ReactionImpl
