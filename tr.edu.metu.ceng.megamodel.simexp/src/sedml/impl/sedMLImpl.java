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
import sedml.listOfDataGenerators;
import sedml.listOfModels;
import sedml.listOfOutputs;
import sedml.listOfSimulations;
import sedml.listOfTasks;
import sedml.sedML;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sed ML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sedml.impl.sedMLImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getListOfSimulations <em>List Of Simulations</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getListOfModels <em>List Of Models</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getListOfTasks <em>List Of Tasks</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getListOfDataGenerators <em>List Of Data Generators</em>}</li>
 *   <li>{@link sedml.impl.sedMLImpl#getListOfOutputs <em>List Of Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sedMLImpl extends MinimalEObjectImpl.Container implements sedML {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListOfSimulations() <em>List Of Simulations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfSimulations()
	 * @generated
	 * @ordered
	 */
	protected listOfSimulations listOfSimulations;

	/**
	 * The cached value of the '{@link #getListOfModels() <em>List Of Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfModels()
	 * @generated
	 * @ordered
	 */
	protected listOfModels listOfModels;

	/**
	 * The cached value of the '{@link #getListOfTasks() <em>List Of Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfTasks()
	 * @generated
	 * @ordered
	 */
	protected listOfTasks listOfTasks;

	/**
	 * The cached value of the '{@link #getListOfDataGenerators() <em>List Of Data Generators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfDataGenerators()
	 * @generated
	 * @ordered
	 */
	protected listOfDataGenerators listOfDataGenerators;

	/**
	 * The cached value of the '{@link #getListOfOutputs() <em>List Of Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfOutputs()
	 * @generated
	 * @ordered
	 */
	protected listOfOutputs listOfOutputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sedMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SedmlPackage.Literals.SED_ML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfSimulations getListOfSimulations() {
		return listOfSimulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfSimulations(listOfSimulations newListOfSimulations, NotificationChain msgs) {
		listOfSimulations oldListOfSimulations = listOfSimulations;
		listOfSimulations = newListOfSimulations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_SIMULATIONS, oldListOfSimulations, newListOfSimulations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfSimulations(listOfSimulations newListOfSimulations) {
		if (newListOfSimulations != listOfSimulations) {
			NotificationChain msgs = null;
			if (listOfSimulations != null)
				msgs = ((InternalEObject)listOfSimulations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_SIMULATIONS, null, msgs);
			if (newListOfSimulations != null)
				msgs = ((InternalEObject)newListOfSimulations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_SIMULATIONS, null, msgs);
			msgs = basicSetListOfSimulations(newListOfSimulations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_SIMULATIONS, newListOfSimulations, newListOfSimulations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfModels getListOfModels() {
		return listOfModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfModels(listOfModels newListOfModels, NotificationChain msgs) {
		listOfModels oldListOfModels = listOfModels;
		listOfModels = newListOfModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_MODELS, oldListOfModels, newListOfModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfModels(listOfModels newListOfModels) {
		if (newListOfModels != listOfModels) {
			NotificationChain msgs = null;
			if (listOfModels != null)
				msgs = ((InternalEObject)listOfModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_MODELS, null, msgs);
			if (newListOfModels != null)
				msgs = ((InternalEObject)newListOfModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_MODELS, null, msgs);
			msgs = basicSetListOfModels(newListOfModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_MODELS, newListOfModels, newListOfModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfTasks getListOfTasks() {
		return listOfTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfTasks(listOfTasks newListOfTasks, NotificationChain msgs) {
		listOfTasks oldListOfTasks = listOfTasks;
		listOfTasks = newListOfTasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_TASKS, oldListOfTasks, newListOfTasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfTasks(listOfTasks newListOfTasks) {
		if (newListOfTasks != listOfTasks) {
			NotificationChain msgs = null;
			if (listOfTasks != null)
				msgs = ((InternalEObject)listOfTasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_TASKS, null, msgs);
			if (newListOfTasks != null)
				msgs = ((InternalEObject)newListOfTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_TASKS, null, msgs);
			msgs = basicSetListOfTasks(newListOfTasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_TASKS, newListOfTasks, newListOfTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfDataGenerators getListOfDataGenerators() {
		return listOfDataGenerators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDataGenerators(listOfDataGenerators newListOfDataGenerators, NotificationChain msgs) {
		listOfDataGenerators oldListOfDataGenerators = listOfDataGenerators;
		listOfDataGenerators = newListOfDataGenerators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS, oldListOfDataGenerators, newListOfDataGenerators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDataGenerators(listOfDataGenerators newListOfDataGenerators) {
		if (newListOfDataGenerators != listOfDataGenerators) {
			NotificationChain msgs = null;
			if (listOfDataGenerators != null)
				msgs = ((InternalEObject)listOfDataGenerators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS, null, msgs);
			if (newListOfDataGenerators != null)
				msgs = ((InternalEObject)newListOfDataGenerators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS, null, msgs);
			msgs = basicSetListOfDataGenerators(newListOfDataGenerators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS, newListOfDataGenerators, newListOfDataGenerators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listOfOutputs getListOfOutputs() {
		return listOfOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfOutputs(listOfOutputs newListOfOutputs, NotificationChain msgs) {
		listOfOutputs oldListOfOutputs = listOfOutputs;
		listOfOutputs = newListOfOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_OUTPUTS, oldListOfOutputs, newListOfOutputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfOutputs(listOfOutputs newListOfOutputs) {
		if (newListOfOutputs != listOfOutputs) {
			NotificationChain msgs = null;
			if (listOfOutputs != null)
				msgs = ((InternalEObject)listOfOutputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_OUTPUTS, null, msgs);
			if (newListOfOutputs != null)
				msgs = ((InternalEObject)newListOfOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SedmlPackage.SED_ML__LIST_OF_OUTPUTS, null, msgs);
			msgs = basicSetListOfOutputs(newListOfOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SedmlPackage.SED_ML__LIST_OF_OUTPUTS, newListOfOutputs, newListOfOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SedmlPackage.SED_ML__LIST_OF_SIMULATIONS:
				return basicSetListOfSimulations(null, msgs);
			case SedmlPackage.SED_ML__LIST_OF_MODELS:
				return basicSetListOfModels(null, msgs);
			case SedmlPackage.SED_ML__LIST_OF_TASKS:
				return basicSetListOfTasks(null, msgs);
			case SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS:
				return basicSetListOfDataGenerators(null, msgs);
			case SedmlPackage.SED_ML__LIST_OF_OUTPUTS:
				return basicSetListOfOutputs(null, msgs);
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
			case SedmlPackage.SED_ML__VERSION:
				return getVersion();
			case SedmlPackage.SED_ML__LEVEL:
				return getLevel();
			case SedmlPackage.SED_ML__LIST_OF_SIMULATIONS:
				return getListOfSimulations();
			case SedmlPackage.SED_ML__LIST_OF_MODELS:
				return getListOfModels();
			case SedmlPackage.SED_ML__LIST_OF_TASKS:
				return getListOfTasks();
			case SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS:
				return getListOfDataGenerators();
			case SedmlPackage.SED_ML__LIST_OF_OUTPUTS:
				return getListOfOutputs();
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
			case SedmlPackage.SED_ML__VERSION:
				setVersion((Integer)newValue);
				return;
			case SedmlPackage.SED_ML__LEVEL:
				setLevel((Integer)newValue);
				return;
			case SedmlPackage.SED_ML__LIST_OF_SIMULATIONS:
				setListOfSimulations((listOfSimulations)newValue);
				return;
			case SedmlPackage.SED_ML__LIST_OF_MODELS:
				setListOfModels((listOfModels)newValue);
				return;
			case SedmlPackage.SED_ML__LIST_OF_TASKS:
				setListOfTasks((listOfTasks)newValue);
				return;
			case SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS:
				setListOfDataGenerators((listOfDataGenerators)newValue);
				return;
			case SedmlPackage.SED_ML__LIST_OF_OUTPUTS:
				setListOfOutputs((listOfOutputs)newValue);
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
			case SedmlPackage.SED_ML__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SedmlPackage.SED_ML__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case SedmlPackage.SED_ML__LIST_OF_SIMULATIONS:
				setListOfSimulations((listOfSimulations)null);
				return;
			case SedmlPackage.SED_ML__LIST_OF_MODELS:
				setListOfModels((listOfModels)null);
				return;
			case SedmlPackage.SED_ML__LIST_OF_TASKS:
				setListOfTasks((listOfTasks)null);
				return;
			case SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS:
				setListOfDataGenerators((listOfDataGenerators)null);
				return;
			case SedmlPackage.SED_ML__LIST_OF_OUTPUTS:
				setListOfOutputs((listOfOutputs)null);
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
			case SedmlPackage.SED_ML__VERSION:
				return version != VERSION_EDEFAULT;
			case SedmlPackage.SED_ML__LEVEL:
				return level != LEVEL_EDEFAULT;
			case SedmlPackage.SED_ML__LIST_OF_SIMULATIONS:
				return listOfSimulations != null;
			case SedmlPackage.SED_ML__LIST_OF_MODELS:
				return listOfModels != null;
			case SedmlPackage.SED_ML__LIST_OF_TASKS:
				return listOfTasks != null;
			case SedmlPackage.SED_ML__LIST_OF_DATA_GENERATORS:
				return listOfDataGenerators != null;
			case SedmlPackage.SED_ML__LIST_OF_OUTPUTS:
				return listOfOutputs != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //sedMLImpl
