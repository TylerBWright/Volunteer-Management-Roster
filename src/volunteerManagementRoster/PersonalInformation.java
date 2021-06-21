package volunteerManagementRoster;

public class PersonalInformation {

	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private String skills;

	public PersonalInformation(String firstName, String middleName, String lastName, String phoneNumber,
			String skills) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.skills = skills;
	}

	public PersonalInformation() {
		super();
	}

	public PersonalInformation(String first, String middle, String last, String phone) {
		super();
		this.firstName = first;
		this.middleName = middle;
		this.lastName = last;
		this.phoneNumber = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
}