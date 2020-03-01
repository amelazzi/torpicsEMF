/**
 */
package entities.impl;

import entities.BddType;
import entities.Capteur;
import entities.CapteurType;
import entities.Cloud;
import entities.CloudType;
import entities.ComProtocol;
import entities.DataBase;
import entities.Device;
import entities.EntitiesFactory;
import entities.EntitiesPackage;
import entities.GateWay;
import entities.Link;
import entities.ReadWrite;
import entities.StorageDevice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntitiesPackageImpl extends EPackageImpl implements EntitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capteurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateWayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capteurTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bddTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum readWriteEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see entities.EntitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EntitiesPackageImpl() {
		super(eNS_URI, EntitiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EntitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EntitiesPackage init() {
		if (isInited) return (EntitiesPackage)EPackage.Registry.INSTANCE.getEPackage(EntitiesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEntitiesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EntitiesPackageImpl theEntitiesPackage = registeredEntitiesPackage instanceof EntitiesPackageImpl ? (EntitiesPackageImpl)registeredEntitiesPackage : new EntitiesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEntitiesPackage.createPackageContents();

		// Initialize created meta-data
		theEntitiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEntitiesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EntitiesPackage.eNS_URI, theEntitiesPackage);
		return theEntitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapteur() {
		return capteurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapteur_Type() {
		return (EAttribute)capteurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCapteur_SendTime() {
		return (EAttribute)capteurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataBase_Type() {
		return (EAttribute)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataBase_Protocol() {
		return (EAttribute)dataBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Source() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Destination() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloud() {
		return cloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloud_Type() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloud_Method() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloud_APIKey() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloud_ChannelID() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloud_Protocol() {
		return (EAttribute)cloudEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Id() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorageDevice() {
		return storageDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageDevice_Url() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageDevice_UserName() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageDevice_Pwd() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageDevice_Port() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateWay() {
		return gateWayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCapteurType() {
		return capteurTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBddType() {
		return bddTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComProtocol() {
		return comProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCloudType() {
		return cloudTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReadWrite() {
		return readWriteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitiesFactory getEntitiesFactory() {
		return (EntitiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		capteurEClass = createEClass(CAPTEUR);
		createEAttribute(capteurEClass, CAPTEUR__TYPE);
		createEAttribute(capteurEClass, CAPTEUR__SEND_TIME);

		dataBaseEClass = createEClass(DATA_BASE);
		createEAttribute(dataBaseEClass, DATA_BASE__TYPE);
		createEAttribute(dataBaseEClass, DATA_BASE__PROTOCOL);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__SOURCE);
		createEAttribute(linkEClass, LINK__DESTINATION);

		cloudEClass = createEClass(CLOUD);
		createEAttribute(cloudEClass, CLOUD__TYPE);
		createEAttribute(cloudEClass, CLOUD__METHOD);
		createEAttribute(cloudEClass, CLOUD__API_KEY);
		createEAttribute(cloudEClass, CLOUD__CHANNEL_ID);
		createEAttribute(cloudEClass, CLOUD__PROTOCOL);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEAttribute(deviceEClass, DEVICE__NAME);

		storageDeviceEClass = createEClass(STORAGE_DEVICE);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__URL);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__USER_NAME);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__PWD);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__PORT);

		gateWayEClass = createEClass(GATE_WAY);

		// Create enums
		capteurTypeEEnum = createEEnum(CAPTEUR_TYPE);
		bddTypeEEnum = createEEnum(BDD_TYPE);
		comProtocolEEnum = createEEnum(COM_PROTOCOL);
		cloudTypeEEnum = createEEnum(CLOUD_TYPE);
		readWriteEEnum = createEEnum(READ_WRITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capteurEClass.getESuperTypes().add(this.getDevice());
		dataBaseEClass.getESuperTypes().add(this.getStorageDevice());
		cloudEClass.getESuperTypes().add(this.getStorageDevice());
		storageDeviceEClass.getESuperTypes().add(this.getDevice());
		gateWayEClass.getESuperTypes().add(this.getDevice());

		// Initialize classes, features, and operations; add parameters
		initEClass(capteurEClass, Capteur.class, "Capteur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapteur_Type(), this.getCapteurType(), "type", null, 0, 1, Capteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapteur_SendTime(), ecorePackage.getEInt(), "sendTime", null, 0, 1, Capteur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBase_Type(), this.getBddType(), "type", null, 0, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataBase_Protocol(), this.getComProtocol(), "protocol", null, 0, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Source(), ecorePackage.getEString(), "source", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudEClass, Cloud.class, "Cloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloud_Type(), this.getCloudType(), "type", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_Method(), this.getReadWrite(), "method", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_APIKey(), ecorePackage.getEString(), "APIKey", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_ChannelID(), ecorePackage.getEInt(), "channelID", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloud_Protocol(), this.getComProtocol(), "protocol", null, 0, 1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageDeviceEClass, StorageDevice.class, "StorageDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageDevice_Url(), ecorePackage.getEString(), "url", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDevice_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDevice_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDevice_Port(), ecorePackage.getEInt(), "port", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gateWayEClass, GateWay.class, "GateWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(capteurTypeEEnum, CapteurType.class, "CapteurType");
		addEEnumLiteral(capteurTypeEEnum, CapteurType.HUMIDITY);
		addEEnumLiteral(capteurTypeEEnum, CapteurType.POLLUSTION);
		addEEnumLiteral(capteurTypeEEnum, CapteurType.TEMPERATURE);

		initEEnum(bddTypeEEnum, BddType.class, "BddType");
		addEEnumLiteral(bddTypeEEnum, BddType.MY_SQL);
		addEEnumLiteral(bddTypeEEnum, BddType.POSTGRE_SQL);
		addEEnumLiteral(bddTypeEEnum, BddType.ORACLE);

		initEEnum(comProtocolEEnum, ComProtocol.class, "ComProtocol");
		addEEnumLiteral(comProtocolEEnum, ComProtocol.SQL);
		addEEnumLiteral(comProtocolEEnum, ComProtocol.MQTT);

		initEEnum(cloudTypeEEnum, CloudType.class, "CloudType");
		addEEnumLiteral(cloudTypeEEnum, CloudType.THING_SPEAK);
		addEEnumLiteral(cloudTypeEEnum, CloudType.GOOGLE_CLOUD);

		initEEnum(readWriteEEnum, ReadWrite.class, "ReadWrite");
		addEEnumLiteral(readWriteEEnum, ReadWrite.READ);
		addEEnumLiteral(readWriteEEnum, ReadWrite.WRITE);

		// Create resource
		createResource(eNS_URI);
	}

} //EntitiesPackageImpl
