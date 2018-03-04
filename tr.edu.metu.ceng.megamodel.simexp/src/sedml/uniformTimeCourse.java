/**
 */
package sedml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uniform Time Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sedml.uniformTimeCourse#getId <em>Id</em>}</li>
 *   <li>{@link sedml.uniformTimeCourse#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link sedml.uniformTimeCourse#getOutputStartTime <em>Output Start Time</em>}</li>
 *   <li>{@link sedml.uniformTimeCourse#getOutputEndTime <em>Output End Time</em>}</li>
 *   <li>{@link sedml.uniformTimeCourse#getNumberOfPoints <em>Number Of Points</em>}</li>
 *   <li>{@link sedml.uniformTimeCourse#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see sedml.SedmlPackage#getuniformTimeCourse()
 * @model
 * @generated
 */
public interface uniformTimeCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Initial Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Time</em>' attribute.
	 * @see #setInitialTime(int)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_InitialTime()
	 * @model
	 * @generated
	 */
	int getInitialTime();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getInitialTime <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Time</em>' attribute.
	 * @see #getInitialTime()
	 * @generated
	 */
	void setInitialTime(int value);

	/**
	 * Returns the value of the '<em><b>Output Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Start Time</em>' attribute.
	 * @see #setOutputStartTime(int)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_OutputStartTime()
	 * @model
	 * @generated
	 */
	int getOutputStartTime();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getOutputStartTime <em>Output Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Start Time</em>' attribute.
	 * @see #getOutputStartTime()
	 * @generated
	 */
	void setOutputStartTime(int value);

	/**
	 * Returns the value of the '<em><b>Output End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output End Time</em>' attribute.
	 * @see #setOutputEndTime(int)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_OutputEndTime()
	 * @model
	 * @generated
	 */
	int getOutputEndTime();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getOutputEndTime <em>Output End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output End Time</em>' attribute.
	 * @see #getOutputEndTime()
	 * @generated
	 */
	void setOutputEndTime(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points</em>' attribute.
	 * @see #setNumberOfPoints(int)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_NumberOfPoints()
	 * @model
	 * @generated
	 */
	int getNumberOfPoints();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getNumberOfPoints <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Points</em>' attribute.
	 * @see #getNumberOfPoints()
	 * @generated
	 */
	void setNumberOfPoints(int value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' containment reference.
	 * @see #setAlgorithm(algorithm)
	 * @see sedml.SedmlPackage#getuniformTimeCourse_Algorithm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link sedml.uniformTimeCourse#getAlgorithm <em>Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' containment reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(algorithm value);

} // uniformTimeCourse
