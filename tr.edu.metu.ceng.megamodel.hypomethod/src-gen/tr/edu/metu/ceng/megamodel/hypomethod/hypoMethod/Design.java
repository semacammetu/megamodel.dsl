/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getDesignType <em>Design Type</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getIteration <em>Iteration</em>}</li>
 *   <li>{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesign()
 * @model
 * @generated
 */
public interface Design extends EObject
{
  /**
   * Returns the value of the '<em><b>Design Type</b></em>' attribute.
   * The literals are from the enumeration {@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.DesignType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Design Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Design Type</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.DesignType
   * @see #setDesignType(DesignType)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesign_DesignType()
   * @model
   * @generated
   */
  DesignType getDesignType();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getDesignType <em>Design Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Design Type</em>' attribute.
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.DesignType
   * @see #getDesignType()
   * @generated
   */
  void setDesignType(DesignType value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesign_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Iteration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iteration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iteration</em>' containment reference.
   * @see #setIteration(Iteration)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesign_Iteration()
   * @model containment="true"
   * @generated
   */
  Iteration getIteration();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getIteration <em>Iteration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iteration</em>' containment reference.
   * @see #getIteration()
   * @generated
   */
  void setIteration(Iteration value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(Variables)
   * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesign_Variables()
   * @model containment="true"
   * @generated
   */
  Variables getVariables();

  /**
   * Sets the value of the '{@link tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.Design#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(Variables value);

} // Design
