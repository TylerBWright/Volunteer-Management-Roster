package volunteerManagementRoster;

public class Contacts {

	private String[] contactsPersonId = new String[100];
	private String[] contactsFirstName = new String[100];
	private String[] contactsMiddleName = new String[100];
	private String[] contactsLastName = new String[100];
	private String[] contactsPhoneNumber = new String[100];
	private String[] contactsAddress = new String[100];
	private String[] contactsCity = new String[100];
	private String[] contactsState = new String[100];
	private String[] contactsZipCode = new String[100];
	private String[] contactsSkills = new String[100];

	public Contacts(String[] contactsPersonId, String[] contactsFirstName, String[] contactsMiddleName,
			String[] contactsLastName, String[] contactsPhoneNumber, String[] contactsAddress, String[] contactsCity,
			String[] contactsState, String[] contactsZipCode, String[] contactsSkills) {
		super();
		this.contactsPersonId = contactsPersonId;
		this.contactsFirstName = contactsFirstName;
		this.contactsMiddleName = contactsMiddleName;
		this.contactsLastName = contactsLastName;
		this.contactsPhoneNumber = contactsPhoneNumber;
		this.contactsAddress = contactsAddress;
		this.contactsCity = contactsCity;
		this.contactsState = contactsState;
		this.contactsZipCode = contactsZipCode;
		this.contactsSkills = contactsSkills;
	}

	public Contacts() {

		super();

	}

	public Contacts(String[] contactsPersonId, String[] contactsFirstName, String[] contactsMiddleName,
			String[] contactsLastName, String[] contactsPhoneNumber, String[] contactsAddress, String[] contactsCity,
			String[] contactsState, String[] contactsZipCode) {
		super();
		this.setContactsPersonId(contactsPersonId);
		this.setContactsFirstName(contactsFirstName);
		this.setContactsMiddleName(contactsMiddleName);
		this.setContactsLastName(contactsLastName);
		this.setContactsPhoneNumber(contactsPhoneNumber);
		this.setContactsAddress(contactsAddress);
		this.setContactsCity(contactsCity);
		this.setContactsState(contactsState);
		this.setContactsZipCode(contactsZipCode);
	}

	public String[] getContactsPersonId() {
		return contactsPersonId;
	}

	public void setContactsPersonId(String[] contactsPersonId) {
		this.contactsPersonId = contactsPersonId;
	}

	public String[] getContactsFirstName() {
		return contactsFirstName;
	}

	public void setContactsFirstName(String[] contactsFirstName) {
		this.contactsFirstName = contactsFirstName;
	}

	public String[] getContactsMiddleName() {
		return contactsMiddleName;
	}

	public void setContactsMiddleName(String[] contactsMiddleName) {
		this.contactsMiddleName = contactsMiddleName;
	}

	public String[] getContactsLastName() {
		return contactsLastName;
	}

	public void setContactsLastName(String[] contactsLastName) {
		this.contactsLastName = contactsLastName;
	}

	public String[] getContactsPhoneNumber() {
		return contactsPhoneNumber;
	}

	public void setContactsPhoneNumber(String[] contactsPhoneNumber) {
		this.contactsPhoneNumber = contactsPhoneNumber;
	}

	public String[] getContactsAddress() {
		return contactsAddress;
	}

	public void setContactsAddress(String[] contactsAddress) {
		this.contactsAddress = contactsAddress;
	}

	public String[] getContactsCity() {
		return contactsCity;
	}

	public void setContactsCity(String[] contactsCity) {
		this.contactsCity = contactsCity;
	}

	public String[] getContactsState() {
		return contactsState;
	}

	public void setContactsState(String[] contactsState) {
		this.contactsState = contactsState;
	}

	public String[] getContactsZipCode() {
		return contactsZipCode;
	}

	public void setContactsZipCode(String[] contactsZipCode) {
		this.contactsZipCode = contactsZipCode;
	}

	public String[] getContactsSkills() {
		return contactsSkills;
	}

	public void setContactsSkills(String[] contactsSkills) {
		this.contactsSkills = contactsSkills;
	}
}