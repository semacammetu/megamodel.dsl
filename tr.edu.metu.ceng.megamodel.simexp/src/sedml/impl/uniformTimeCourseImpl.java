/**
 */
package sedml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sedml.SedmlPackage;
import sedml.algorithm;
import sedml.uniformTimeCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uniform Time Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getId <em>Id</em>}</li>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getOutputStartTime <em>Output Start Time</em>}</li>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getOutputEndTime <em>Output End Time</em>}</li>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getNumberOfPoints <em>Number Of Points</em>}</li>
 *   <li>{@link sedml.impl.uniformTimeCourseImpl#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uniformTimeCourseImpl extends MinimalEObjectImpl.Container implements uniformTimeCourse {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTime()
	 * @generated
	 * @ordered
	 */
	protected int initialTime = INITIAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputStartTime() <em>Output Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_START_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputStartTime() <em>Output Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStartTime()
	 * @generated
	 * @ordered
	 */
	protected int outputStartTime = OUTPUT_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputEndTime() <em>Output End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_END_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputEndTime() <em>Output End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEndTime()
	 * @generated
	 * @ordered
	 */
	protected int outputEndTime = OUTPUT_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected int numberOfPoints = NUMBER_OF_POINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected algorithm algorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uniformTimeCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.UNIFORM_TIME_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialTime() {
		return initialTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTime(int newInitialTime) {
		int oldInitialTime = initialTime;
		initialTime = newInitialTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__INITIAL_TIME, oldInitialTime, initialTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputStartTime() {
		return outputStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputStartTime(int newOutputStartTime) {
		int oldOutputStartTime = outputStartTime;
		outputStartTime = newOutputStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_START_TIME, oldOutputStartTime, outputStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputEndTime() {
		return outputEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEndTime(int newOutputEndTime) {
		int oldOutputEndTime = outputEndTime;
		outputEndTime = newOutputEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_END_TIME, oldOutputEndTime, outputEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfPoints() {
		return numberOfPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfPoints(int newNumberOfPoints) {
		int oldNumberOfPoints = numberOfPoints;
		numberOfPoints = newNumberOfPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS, oldNumberOfPoints, numberOfPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public algorithm getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithm(algorithm newAlgorithm, NotificationChain msgs) {
		algorithm oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM, oldAlgorithm, newAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(algorithm newAlgorithm) {
		if (newAlgorithm != algorithm) {
			NotificationChain msgs = null;
			if (algorithm != null)
				msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM, null, msgs);
			if (newAlgorithm != null)
				msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM, null, msgs);
			msgs = basicSetAlgorithm(newAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM, newAlgorithm, newAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM:
				return basicSetAlgorithm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SedmlPackage.UNIFORM_TIME_COURSE__ID:
				return getId();
			case SedmlPackage.UNIFORM_TIME_COURSE__INITIAL_TIME:
				return getInitialTime();
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_START_TIME:
				return getOutputStartTime();
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_END_TIME:
				return getOutputEndTime();
			case SedmlPackage.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS:
				return getNumberOfPoints();
			case SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM:
				return getAlgorithm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SedmlPackage.UNIFORM_TIME_COURSE__ID:
				setId((String)newValue);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__INITIAL_TIME:
				setInitialTime((Integer)newValue);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_START_TIME:
				setOutputStartTime((Integer)newValue);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_END_TIME:
				setOutputEndTime((Integer)newValue);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS:
				setNumberOfPoints((Integer)newValue);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM:
				setAlgorithm((algorithm)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SedmlPackage.UNIFORM_TIME_COURSE__ID:
				setId(ID_EDEFAULT);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__INITIAL_TIME:
				setInitialTime(INITIAL_TIME_EDEFAULT);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_START_TIME:
				setOutputStartTime(OUTPUT_START_TIME_EDEFAULT);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_END_TIME:
				setOutputEndTime(OUTPUT_END_TIME_EDEFAULT);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS:
				setNumberOfPoints(NUMBER_OF_POINTS_EDEFAULT);
				return;
			case SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM:
				setAlgorithm((algorithm)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SedmlPackage.UNIFORM_TIME_COURSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SedmlPackage.UNIFORM_TIME_COURSE__INITIAL_TIME:
				return initialTime != INITIAL_TIME_EDEFAULT;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_START_TIME:
				return outputStartTime != OUTPUT_START_TIME_EDEFAULT;
			case SedmlPackage.UNIFORM_TIME_COURSE__OUTPUT_END_TIME:
				return outputEndTime != OUTPUT_END_TIME_EDEFAULT;
			case SedmlPackage.UNIFORM_TIME_COURSE__NUMBER_OF_POINTS:
				return numberOfPoints != NUMBER_OF_POINTS_EDEFAULT;
			case SedmlPackage.UNIFORM_TIME_COURSE__ALGORITHM:
				return algorithm != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", initialTime: ");
		result.append(initialTime);
		result.append(", outputStartTime: ");
		result.append(outputStartTime);
		result.append(", outputEndTime: ");
		result.append(outputEndTime);
		result.append(", numberOfPoints: ");
		result.append(numberOfPoints);
		result.append(')');
		return result.toString();
	}

} //uniformTimeCourseImpl
