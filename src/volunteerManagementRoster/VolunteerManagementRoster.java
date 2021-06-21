package volunteerManagementRoster;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VolunteerManagementRoster {

	static int choice;
	static int search;
	static int editVolunteer;
	static int exit;
	static boolean misMatch;
	static PersonalInformation personalInformationData = new PersonalInformation();
	static Addresses addressData = new Addresses();
	static Contacts database = new Contacts();
	static int volunteerID = -1;
	static int volunteerIDNext = 0;
	static int volunteerIDEdit = 0;

	public static void main(String[] args) {

		VolunteerManagementRoster.primary();
		VolunteerManagementRoster.addFirstName();
		VolunteerManagementRoster.addMiddleName();
		VolunteerManagementRoster.addLastName();
		VolunteerManagementRoster.addPhoneNumber();
		VolunteerManagementRoster.addAddress();
		VolunteerManagementRoster.addCity();
		VolunteerManagementRoster.addState();
		VolunteerManagementRoster.addZipCode();
		VolunteerManagementRoster.addSkills();
		VolunteerManagementRoster.finalEntry();
		VolunteerManagementRoster.search();
		VolunteerManagementRoster.searchFN();
		VolunteerManagementRoster.searchMN();
		VolunteerManagementRoster.searchLN();
		VolunteerManagementRoster.searchPN();
		VolunteerManagementRoster.searchAddress();
		VolunteerManagementRoster.searchCity();
		VolunteerManagementRoster.searchState();
		VolunteerManagementRoster.searchZipCode();
		VolunteerManagementRoster.searchAll();
		VolunteerManagementRoster.select();
		VolunteerManagementRoster.edit();
		VolunteerManagementRoster.editFirstName();
		VolunteerManagementRoster.editMiddleName();
		VolunteerManagementRoster.editLastName();
		VolunteerManagementRoster.editPhoneNumber();
		VolunteerManagementRoster.editAddress();
		VolunteerManagementRoster.editCity();
		VolunteerManagementRoster.editState();
		VolunteerManagementRoster.editZipCode();
		VolunteerManagementRoster.editSkills();
		VolunteerManagementRoster.viewFinalEntry();
		VolunteerManagementRoster.removeFinalEntry();
		VolunteerManagementRoster.showAll();
		VolunteerManagementRoster.byVolunteerID();
		VolunteerManagementRoster.alpha();
		VolunteerManagementRoster.quit();

	}

	public static void primary() {

		System.out.println("*** Volunteer Management Roster ***");
		System.out.println("");
		System.out.println("NOTE: To return to the main menu at any time, type '$' and press 'ENTER'");
		System.out.println("");
		System.out.println("Options:");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1. About");
		System.out.println("2: Add a Volunteer");
		System.out.println("3: Search the Database + Edit/Remove Options");
		System.out.println("4: Display/Sort All Volunteers");
		System.out.println("5: Quit");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please choose an option:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			choice = input.nextInt();
		} catch (InputMismatchException e) {
			misMatch = true;
		}
		switch (choice) {
		case 1:
			System.out.println("by: Tyler Wright, 2021.");
			System.out
					.println("\nThis program allows you to manage volunteer information in a dynamic way, including:");
			System.out.println(
					"1) adding new volunteers, 2) editing and removing existing volunteers, and 3) documenting");
			System.out
					.println("valuable skills to aid volunteer managers in successfully executing a service event.\n");
			primary();
			break;
		case 2:
			addFirstName();
			break;
		case 3:
			search();
			break;
		case 4:
			showAll();
			break;
		case 5:
			quit();
			break;
		default:
			if (misMatch == false) {
				System.out.println("Invalid entry.  Please type an integer (1 - 5) and press 'ENTER'.\n");
				primary();
			} else {
				System.out.println("Invalid entry.  Please type an integer (1 - 5) and press 'ENTER'.\n");
				primary();
			}
			break;
		}
	}

	public static void addFirstName() {

		System.out.println("");
		System.out.println("Add a Volunteer");
		System.out.println("\n------------------------------------------------------------------\n");
		volunteerID = (volunteerID + 1);
		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a First Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String firstName = input.nextLine();
			if (firstName.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				personalInformationData.setFirstName(firstName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("First Name: " + personalInformationData.getFirstName());
				System.out.println("\n------------------------------------------------------------------\n");
				addMiddleName();
			}
		}
	}

	public static void addMiddleName() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a Middle Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String middleName = input.nextLine();
			if (middleName.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				personalInformationData.setMiddleName(middleName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Middle Name: " + personalInformationData.getMiddleName());
				System.out.println("\n------------------------------------------------------------------\n");
				addLastName();
			}
		}
	}

	public static void addLastName() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a Last Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String lastName = input.nextLine();
			if (lastName.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				personalInformationData.setLastName(lastName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Last Name: " + personalInformationData.getLastName());
				System.out.println("\n------------------------------------------------------------------\n");
				addPhoneNumber();
			}
		}
	}

	public static void addPhoneNumber() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a Phone Number:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String phone = input.nextLine();
			if (phone.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				personalInformationData.setPhoneNumber(phone);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Phone Number: " + personalInformationData.getPhoneNumber());
				System.out.println("\n------------------------------------------------------------------\n");
				addAddress();
			}
		}
	}

	public static void addAddress() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter an Address:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String address = input.nextLine();
			if (address.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				addressData.setAddress(address);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Address: " + addressData.getAddress());
				System.out.println("\n------------------------------------------------------------------\n");
				addCity();
			}
		}
	}

	public static void addCity() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a City:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String city = input.nextLine();
			if (city.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				addressData.setCity(city);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("City: " + addressData.getCity());
				System.out.println("\n------------------------------------------------------------------\n");
				addState();
			}
		}
	}

	public static void addState() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a State:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String state = input.nextLine();
			if (state.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				addressData.setState(state);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("City: " + addressData.getState());
				System.out.println("\n------------------------------------------------------------------\n");
				addZipCode();
			}
		}
	}

	public static void addZipCode() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please enter a Zip Code:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String zipCode = input.nextLine();
			if (zipCode.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				addressData.setZipCode(zipCode);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Zip Code: " + addressData.getZipCode());
				System.out.println("\n------------------------------------------------------------------\n");
				addSkills();
			}
		}
	}

	public static void addSkills() {

		System.out.println("Volunteer ID: " + volunteerID);
		System.out.println("Please provide any relevant skills:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String skills = input.nextLine();
			if (skills.equals("$")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				personalInformationData.setSkills(skills);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("Skills: " + personalInformationData.getSkills());
				System.out.println("\n------------------------------------------------------------------\n");
				finalEntry();
			}
		}
	}

	public static void finalEntry() {

		System.out.println("Final Entry");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("VOLUNTEER ID: " + volunteerID + "; FULL NAME: " + personalInformationData.getFirstName()
				+ " " + personalInformationData.getMiddleName() + " " + personalInformationData.getLastName() + "; "
				+ "PHONE: " + personalInformationData.getPhoneNumber() + "; " + "ADDRESS: " + addressData.getAddress()
				+ ", " + addressData.getCity() + ", " + addressData.getState() + ", " + addressData.getZipCode()
				+ "; SKILLS: " + personalInformationData.getSkills());
		volunteerIDNext = volunteerID + 1;
		String volunteerIDNextB = Integer.toString(volunteerIDNext);
		String addVolunteerID = Integer.toString(volunteerID);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println(
				"Do you want to add this volunteer to the database?  (Y/N)  WARNING: If 'N', this entry will be permanently deleted.");
		try (Scanner input = new Scanner(System.in)) {
			String finalEntry = input.nextLine();
			if (finalEntry.equals("N") || finalEntry.equals("n") || finalEntry.equals("No")
					|| finalEntry.equals("no")) {
				volunteerID = (volunteerID - 1);
				primary();
			} else {
				database.getContactsPersonId()[volunteerID] = addVolunteerID;
				database.getContactsFirstName()[volunteerID] = personalInformationData.getFirstName();
				database.getContactsMiddleName()[volunteerID] = personalInformationData.getMiddleName();
				database.getContactsLastName()[volunteerID] = personalInformationData.getLastName();
				database.getContactsPhoneNumber()[volunteerID] = personalInformationData.getPhoneNumber();
				database.getContactsAddress()[volunteerID] = addressData.getAddress();
				database.getContactsCity()[volunteerID] = addressData.getCity();
				database.getContactsState()[volunteerID] = addressData.getState();
				database.getContactsZipCode()[volunteerID] = addressData.getZipCode();
				database.getContactsSkills()[volunteerID] = personalInformationData.getSkills();
				database.getContactsPersonId()[volunteerIDNext] = volunteerIDNextB;
				database.getContactsFirstName()[volunteerIDNext] = "...";
				database.getContactsMiddleName()[volunteerIDNext] = "...";
				database.getContactsLastName()[volunteerIDNext] = "...";
				database.getContactsPhoneNumber()[volunteerIDNext] = "...";
				database.getContactsAddress()[volunteerIDNext] = "...";
				database.getContactsCity()[volunteerIDNext] = "...";
				database.getContactsState()[volunteerIDNext] = "...";
				database.getContactsZipCode()[volunteerIDNext] = "...";
				database.getContactsSkills()[volunteerIDNext] = "...";
				System.out.println("Entry submitted.");
				System.out.println("\n------------------------------------------------------------------\n");
				primary();
			}
		}
	}

	public static void search() {

		System.out.println("");
		System.out.println("Search the Database");
		System.out.println("NOTE: Once your volunteer is found, you have the option to edit/remove from the roster.");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1. First Name");
		System.out.println("2. Middle Name");
		System.out.println("3. Last Name");
		System.out.println("4. Phone Number");
		System.out.println("5. Address");
		System.out.println("6. City");
		System.out.println("7. State");
		System.out.println("8. Zip Code");
		System.out.println("9. All Fields");
		System.out.println("10. ** Return to Main Menu **");
		System.out.println("");
		System.out.println("Please choose an option:");
		System.out.println("");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			search = input.nextInt();
		} catch (InputMismatchException e) {
			misMatch = true;
		}
		switch (search) {
		case 1:
			searchFN();
			break;
		case 2:
			searchMN();
			break;
		case 3:
			searchLN();
			break;
		case 4:
			searchPN();
			break;
		case 5:
			searchAddress();
			break;
		case 6:
			searchCity();
			break;
		case 7:
			searchState();
			break;
		case 8:
			searchZipCode();
			break;
		case 9:
			searchAll();
			break;
		case 10:
			primary();
			break;
		default:
			if (misMatch == false) {
				System.out.println("Invalid entry.  Please type an integer (1 - 10) and press 'ENTER'.\n");
				search();
			} else {
				System.out.println("Invalid entry.  Please type an integer (1 - 10) and press 'ENTER'.\n");
				search();
			}
			break;
		}
	}

	public static void searchFN() {

		System.out.println("Search First Name");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a First Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchFN = input.nextLine();
			for (int i = 0; i < database.getContactsFirstName().length; i++) {
				if (searchFN.equals(database.getContactsFirstName()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchMN() {

		System.out.println("Search Middle Name");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a Middle Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchMN = input.nextLine();
			for (int i = 0; i < database.getContactsMiddleName().length; i++) {
				if (searchMN.equals(database.getContactsMiddleName()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchLN() {

		System.out.println("Search Last Name");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a Last Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchLN = input.nextLine();
			for (int i = 0; i < database.getContactsLastName().length; i++) {
				if (searchLN.equals(database.getContactsLastName()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchPN() {

		System.out.println("Search Phone Number");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a Phone Number:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchPN = input.nextLine();
			for (int i = 0; i < database.getContactsPhoneNumber().length; i++) {
				if (searchPN.equals(database.getContactsPhoneNumber()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchAddress() {

		System.out.println("Search Address");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter an Address:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchAddress = input.nextLine();
			for (int i = 0; i < database.getContactsAddress().length; i++) {
				if (searchAddress.equals(database.getContactsAddress()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchCity() {

		System.out.println("Search City");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a City:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchCity = input.nextLine();
			for (int i = 0; i < database.getContactsCity().length; i++) {
				if (searchCity.equals(database.getContactsCity()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchState() {

		System.out.println("Search State");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a State:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchState = input.nextLine();
			for (int i = 0; i < database.getContactsState().length; i++) {
				if (searchState.equals(database.getContactsState()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

	public static void searchZipCode() {

		System.out.println("Search Zip Code");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a Zip Code:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchZipCode = input.nextLine();
			for (int i = 0; i < database.getContactsZipCode().length; i++) {
				if (searchZipCode.equals(database.getContactsZipCode()[i]))
					System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
							+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
							+ database.getContactsLastName()[i] + "; " + "PHONE: "
							+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
							+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
							+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
							+ database.getContactsSkills()[i]);
			}
			select();
		}
	}

		public static void searchAll() {

		System.out.println("Search All Fields");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter a full string in the following format: 'First Name, Middle Name,");
		System.out.println("Last Name, Phone Number, Address, City, State, Zip Code'");
		System.out.println("NOTE: String must adhere to this format, separated by commas, even for absent values!");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String searchAll = input.nextLine();
			if (searchAll.contains(", ")) {
				String[] searchAllSplit = searchAll.split(", ");
				if (searchAllSplit.length > 7) {
					System.out.println("");
				} else {
					System.out.println("Invalid entry.");
					primary();
				}
				for (int i = 0; i < database.getContactsFirstName().length; i++) {
					if ((searchAllSplit[0].equals(database.getContactsFirstName()[i])
							& searchAllSplit[2].equals(database.getContactsLastName()[i])
							& (searchAllSplit[5].equals(database.getContactsCity()[i])
									& searchAllSplit[7].equals(database.getContactsZipCode()[i])))) {
						System.out.println("Potential match:\n");
						System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
								+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
								+ database.getContactsLastName()[i] + "; " + "PHONE: "
								+ database.getContactsPhoneNumber()[i] + "; " + "ADDRESS: "
								+ database.getContactsAddress()[i] + ", " + database.getContactsCity()[i] + ", "
								+ database.getContactsState()[i] + ", " + database.getContactsZipCode()[i]
								+ "; SKILLS: " + database.getContactsSkills()[i]);
						select();
					}
				}
			}
			select();
		}
	}

	public static void select() {

		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Which volunteer would you like to edit or remove?");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please enter the Volunteer ID:");
		System.out.println("NOTE: To return to the main menu at any time, type '$' and press 'ENTER'");
		System.out.println("\n------------------------------------------------------------------\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			volunteerIDEdit = input.nextInt();
			if (volunteerIDEdit >= 0) {
				System.out.println("Entry selected.");
				System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[volunteerIDEdit] + "; FULL NAME: "
						+ database.getContactsFirstName()[volunteerIDEdit] + " "
						+ database.getContactsMiddleName()[volunteerIDEdit] + " "
						+ database.getContactsLastName()[volunteerIDEdit] + "; " + "PHONE: "
						+ database.getContactsPhoneNumber()[volunteerIDEdit] + "; " + "ADDRESS: "
						+ database.getContactsAddress()[volunteerIDEdit] + ", "
						+ database.getContactsCity()[volunteerIDEdit] + ", "
						+ database.getContactsState()[volunteerIDEdit] + ", "
						+ database.getContactsZipCode()[volunteerIDEdit] + "; SKILLS: "
						+ database.getContactsSkills()[volunteerIDEdit]);
				edit();
			} else {
				System.out.println("Error: Volunteer ID can only be '0' or a positive integer.");
				System.out.println("Returned to the main menu.");
				primary();
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: Volunteer ID can only be '0' or a positive integer.");
			System.out.println("Returned to the main menu.");
			primary();
		}
	}

	public static void edit() {

		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("What would you like to do?");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1. Edit Volunteer");
		System.out.println("2. Remove Volunteer");
		System.out.println("3. ** Return to Main Menu **");
		System.out.println("\n------------------------------------------------------------------\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			editVolunteer = input.nextInt();
		} catch (InputMismatchException e) {
			misMatch = true;
		}
		switch (editVolunteer) {
		case 1:
			editFirstName();
			break;
		case 2:
			removeFinalEntry();
			break;
		case 3:
			primary();
			break;
		default:
			if (misMatch == false) {
				System.out.println("Invalid entry.  Please type an integer (1 - 3) and press 'ENTER'.\n");
				edit();
			} else {
				System.out.println("Invalid entry.  Please type an integer (1 - 3) and press 'ENTER'.\n");
				edit();
			}
			break;
		}
	}

	public static void editFirstName() {

		System.out.println("Edit a Volunteer");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current First Name: " + database.getContactsFirstName()[volunteerIDEdit]);
		System.out.println("Please enter a First Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String firstName = input.nextLine();
			if (firstName.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				personalInformationData.setFirstName(firstName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New First Name: " + personalInformationData.getFirstName());
				System.out.println("\n------------------------------------------------------------------\n");
				editMiddleName();
			}
		}
	}

	public static void editMiddleName() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Middle Name: " + database.getContactsMiddleName()[volunteerIDEdit]);
		System.out.println("Please enter a Middle Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String middleName = input.nextLine();
			if (middleName.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				personalInformationData.setMiddleName(middleName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Middle Name: " + personalInformationData.getMiddleName());
				System.out.println("\n------------------------------------------------------------------\n");
				editLastName();
			}
		}
	}

	public static void editLastName() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Last Name: " + database.getContactsLastName()[volunteerIDEdit]);
		System.out.println("Please enter a Last Name:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String lastName = input.nextLine();
			if (lastName.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				personalInformationData.setLastName(lastName);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Last Name: " + personalInformationData.getLastName());
				System.out.println("\n------------------------------------------------------------------\n");
				editPhoneNumber();
			}
		}
	}

	public static void editPhoneNumber() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Phone Number: " + database.getContactsPhoneNumber()[volunteerIDEdit]);
		System.out.println("Please enter a Phone Number:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String phone = input.nextLine();
			if (phone.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				personalInformationData.setPhoneNumber(phone);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Phone Number: " + personalInformationData.getPhoneNumber());
				System.out.println("\n------------------------------------------------------------------\n");
				editAddress();
			}
		}
	}

	public static void editAddress() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Address: " + database.getContactsAddress()[volunteerIDEdit]);
		System.out.println("Please enter an Address:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String address = input.nextLine();
			if (address.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				addressData.setAddress(address);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Address: " + addressData.getAddress());
				System.out.println("\n------------------------------------------------------------------\n");
				editCity();
			}
		}
	}

	public static void editCity() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current City: " + database.getContactsCity()[volunteerIDEdit]);
		System.out.println("Please enter a City:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String city = input.nextLine();
			if (city.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				addressData.setCity(city);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New City: " + addressData.getCity());
				System.out.println("\n------------------------------------------------------------------\n");
				editState();
			}
		}
	}

	public static void editState() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current State: " + database.getContactsState()[volunteerIDEdit]);
		System.out.println("Please enter a State:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String state = input.nextLine();
			if (state.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				addressData.setState(state);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New State: " + addressData.getState());
				System.out.println("\n------------------------------------------------------------------\n");
				editZipCode();
			}
		}
	}

	public static void editZipCode() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Zip Code: " + database.getContactsZipCode()[volunteerIDEdit]);
		System.out.println("Please enter a Zip Code:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String zipCode = input.nextLine();
			if (zipCode.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				addressData.setZipCode(zipCode);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Zip Code: " + addressData.getZipCode());
				System.out.println("\n------------------------------------------------------------------\n");
				editSkills();
			}
		}
	}

	public static void editSkills() {

		System.out.println("Volunteer ID: " + volunteerIDEdit);
		System.out.println("Current Skills: " + database.getContactsSkills()[volunteerIDEdit]);
		System.out.println("Please provide any relevant skills:");
		System.out.println("\n------------------------------------------------------------------\n");
		try (Scanner input = new Scanner(System.in)) {
			String skills = input.nextLine();
			if (skills.equals("$")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				personalInformationData.setSkills(skills);
				System.out.println("\n------------------------------------------------------------------\n");
				System.out.println("New Skills: " + personalInformationData.getSkills());
				System.out.println("\n------------------------------------------------------------------\n");
				viewFinalEntry();
			}
		}
	}

	public static void viewFinalEntry() {

		System.out.println("");
		System.out.println("Final Entry");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("VOLUNTEER ID: " + volunteerIDEdit + "; FULL NAME: " + personalInformationData.getFirstName()
				+ " " + personalInformationData.getMiddleName() + " " + personalInformationData.getLastName() + "; "
				+ "PHONE: " + personalInformationData.getPhoneNumber() + "; " + "ADDRESS: " + addressData.getAddress()
				+ ", " + addressData.getCity() + ", " + addressData.getState() + ", " + addressData.getZipCode()
				+ "; SKILLS: " + personalInformationData.getSkills());
		String editPersonID = Integer.toString(volunteerIDEdit);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println(
				"Do you want to save changes to this entry?  (Y/N)  WARNING: If 'N', changes will be rejected.");
		try (Scanner input = new Scanner(System.in)) {
			String finalEntry = input.nextLine();
			if (finalEntry.equals("N") || finalEntry.equals("n") || finalEntry.equals("no")
					|| finalEntry.equals("No")) {
				volunteerIDEdit = 0;
				System.out.println("\n------------------------------------------------------------------\n");
				primary();
			} else {
				database.getContactsPersonId()[volunteerIDEdit] = editPersonID;
				database.getContactsFirstName()[volunteerIDEdit] = personalInformationData.getFirstName();
				database.getContactsMiddleName()[volunteerIDEdit] = personalInformationData.getMiddleName();
				database.getContactsLastName()[volunteerIDEdit] = personalInformationData.getLastName();
				database.getContactsPhoneNumber()[volunteerIDEdit] = personalInformationData.getPhoneNumber();
				database.getContactsAddress()[volunteerIDEdit] = addressData.getAddress();
				database.getContactsCity()[volunteerIDEdit] = addressData.getCity();
				database.getContactsState()[volunteerIDEdit] = addressData.getState();
				database.getContactsZipCode()[volunteerIDEdit] = addressData.getZipCode();
				database.getContactsSkills()[volunteerIDEdit] = personalInformationData.getSkills();
				System.out.println("Entry adjusted.");
				System.out.println("\n------------------------------------------------------------------\n");
				primary();
			}
		}
	}

	public static void removeFinalEntry() {

		System.out.println("Remove Volunteer");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[volunteerIDEdit] + "; FULL NAME: "
				+ database.getContactsFirstName()[volunteerIDEdit] + " "
				+ database.getContactsMiddleName()[volunteerIDEdit] + " "
				+ database.getContactsLastName()[volunteerIDEdit] + "; " + "PHONE: "
				+ database.getContactsPhoneNumber()[volunteerIDEdit] + "; " + "ADDRESS: "
				+ database.getContactsAddress()[volunteerIDEdit] + ", " + database.getContactsCity()[volunteerIDEdit]
				+ ", " + database.getContactsState()[volunteerIDEdit] + ", "
				+ database.getContactsZipCode()[volunteerIDEdit] + "; SKILLS: "
				+ database.getContactsSkills()[volunteerIDEdit]);
		String deletePersonID = Integer.toString(volunteerIDEdit);
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println(
				"Do you want to remove this volunteer?  (Y/N)  WARNING: If 'Y', entry will be permanently deleted.");
		try (Scanner input = new Scanner(System.in)) {
			String deleteEntry = input.nextLine();
			if (deleteEntry.equals("N") || deleteEntry.equals("n") || deleteEntry.equals("No")
					|| deleteEntry.equals("no")) {
				volunteerIDEdit = 0;
				primary();
			} else {
				database.getContactsPersonId()[volunteerIDEdit] = deletePersonID;
				database.getContactsFirstName()[volunteerIDEdit] = "";
				database.getContactsMiddleName()[volunteerIDEdit] = "";
				database.getContactsLastName()[volunteerIDEdit] = "";
				database.getContactsPhoneNumber()[volunteerIDEdit] = "";
				database.getContactsAddress()[volunteerIDEdit] = "";
				database.getContactsCity()[volunteerIDEdit] = "";
				database.getContactsState()[volunteerIDEdit] = "";
				database.getContactsZipCode()[volunteerIDEdit] = "";
				database.getContactsSkills()[volunteerIDEdit] = "";
				System.out.println("Volunteer removed");
				System.out.println("\n------------------------------------------------------------------\n");
				primary();
			}
		}
	}

	public static void showAll() {

		System.out.println("");
		System.out.println("Display all Volunteers");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Options:");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: By Volunteer ID");
		System.out.println("2: Alphabetical");
		System.out.println("3. ** Return to Main Menu **");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Please choose an option:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			choice = input.nextInt();
		} catch (InputMismatchException e) {
			misMatch = true;
		}
		switch (choice) {
		case 1:
			byVolunteerID();
			break;
		case 2:
			alpha();
			break;
		case 3:
			primary();
			break;
		default:
			if (misMatch == false) {
				System.out.println("Invalid entry.  Please type an integer (1 - 3) and press 'ENTER'.\n");
				primary();
			} else {
				System.out.println("Invalid entry.  Please type an integer (1 - 3) and press 'ENTER'.\n");
				primary();
			}
			break;
		}
	}

	public static void byVolunteerID() {

		System.out.println("");
		System.out.println("Display all Volunteers");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("All volunteers displayed in ascending order, by Volunteer ID.");
		System.out.println("\n------------------------------------------------------------------\n");
		for (int i = 0; i < database.getContactsFirstName().length; i++) {
			if (database.getContactsFirstName()[i] != null)
				System.out.println("VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; FULL NAME: "
						+ database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
						+ database.getContactsLastName()[i] + "; " + "PHONE: " + database.getContactsPhoneNumber()[i]
						+ "; " + "ADDRESS: " + database.getContactsAddress()[i] + ", " + database.getContactsCity()[i]
						+ ", " + database.getContactsState()[i] + ", " + database.getContactsZipCode()[i] + "; SKILLS: "
						+ database.getContactsSkills()[i]);
		}
		System.out.println("\n------------------------------------------------------------------\n");
		primary();
	}

	public static void alpha() {

		System.out.println("Display all Volunteers");
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("All volunteers displayed in ascending order, alphabetically.");
		System.out.println("\n------------------------------------------------------------------\n");
		String[] sortA = new String[volunteerIDNext];
		for (int i = 0; i < sortA.length; i++) {
			if (database.getContactsFirstName()[i] != null)
				sortA[i] = (database.getContactsFirstName()[i] + " " + database.getContactsMiddleName()[i] + " "
						+ database.getContactsLastName()[i] + "; " + "PHONE: " + database.getContactsPhoneNumber()[i]
						+ "; " + "ADDRESS: " + database.getContactsAddress()[i] + ", " + database.getContactsCity()[i]
						+ ", " + database.getContactsState()[i] + ", " + database.getContactsZipCode()[i]
						+ "; VOLUNTEER ID: " + database.getContactsPersonId()[i] + "; SKILLS: "
						+ database.getContactsSkills()[i]) + " --END--";
		}
		{
			Arrays.sort(sortA);
			String sortDisplayA = Arrays.toString(sortA);
			String[] sortDisplayB = sortDisplayA.split(" --END--", volunteerIDNext);
			for (String a : sortDisplayB)
				System.out.println(a);
			{
			}
			System.out.println("\n------------------------------------------------------------------\n");
			primary();
		}
	}

	public static void quit() {

		System.out.println("");
		System.out.println("Are you sure that you want to quit?");
		System.out.println("'y' for yes; 'n' for no");
		System.out.println("\n------------------------------------------------------------------\n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			exit = input.next().charAt(0);
		} catch (InputMismatchException e) {
			misMatch = true;
		}
		switch (exit) {
		case 'y':
			System.out.println("Good luck on your service project! --END--");
			System.exit(0);
			break;
		case 'Y':
			System.out.println("Good luck on your service project! --END--");
			System.exit(0);
			break;
		case 'n':
			primary();
			break;
		case 'N':
			primary();
			break;
		default:
			if (misMatch == false) {
				System.out.println("Invalid entry. Try again.\n");
				quit();
			} else {
				System.out.println("Invalid entry. Try again.\n");
				quit();
			}
			break;
		}
	}

}
