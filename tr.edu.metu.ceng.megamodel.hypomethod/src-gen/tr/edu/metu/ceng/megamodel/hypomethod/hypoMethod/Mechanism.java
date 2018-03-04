/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getMechanismName <em>Mechanism Name</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getLHS <em>LHS</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getCondition <em>Condition</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getRHS <em>RHS</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getMechanism()
 * @model
 * @generated
 */
public interface Mechanism extends EObject
{
  /**
   * Returns the value of the '<em><b>Mechanism Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mechanism Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mechanism Name</em>' attribute.
   * @see #setMechanismName(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getMechanism_MechanismName()
   * @model
   * @generated
   */
  String getMechanismName();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getMechanismName <em>Mechanism Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mechanism Name</em>' attribute.
   * @see #getMechanismName()
   * @generated
   */
  void setMechanismName(String value);

  /**
   * Returns the value of the '<em><b>LHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LHS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LHS</em>' containment reference.
   * @see #setLHS(Reaction)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getMechanism_LHS()
   * @model containment="true"
   * @generated
   */
  Reaction getLHS();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getLHS <em>LHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LHS</em>' containment reference.
   * @see #getLHS()
   * @generated
   */
  void setLHS(Reaction value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(GuardCondition)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getMechanism_Condition()
   * @model containment="true"
   * @generated
   */
  GuardCondition getCondition();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(GuardCondition value);

  /**
   * Returns the value of the '<em><b>RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RHS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RHS</em>' containment reference.
   * @see #setRHS(Reaction)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getMechanism_RHS()
   * @model containment="true"
   * @generated
   */
  Reaction getRHS();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Mechanism#getRHS <em>RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RHS</em>' containment reference.
   * @see #getRHS()
   * @generated
   */
  void setRHS(Reaction value);

} // Mechanism
