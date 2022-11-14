package oop1;

//individual customer bireysel müşteri customer ise müşteri demek
//aşağıdaki kodda individualcustomer bir customerdır dedim.
public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;

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

}
