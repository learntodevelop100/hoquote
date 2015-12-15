package tcs.bits.hackathon.hoquote.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class PersonalInforamtionPO extends HOQAbstractBean {

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String dob;

	@NotEmpty
	private String streetAddress;

	@NotEmpty
	private String city;

	@NotEmpty
	private String state;

	@NotEmpty
	private String zipCode;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNumber;

	@Override
	public String toString() {
		return "PersonalInformation [firstName=" + firstName + ", lastName=" + lastName + ", don=" + dob
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", zipCode=" + zipCode + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
