package objectOrientedProgramming;

public class Employee {

	
	private int id;
	private String firstName;
	private String lastName;
	private Phone phone;
private Address addr;
private EmployeeType type;
private Company company;

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName=firstName;
		this.lastName = lastName;
	}

		public void setPhoneNumber(Phone phone)
		{
			this.phone=phone;
		}

		public Phone getPhoneNumber()
		{
			return phone;
		}
		public void setaddress(Address addr)
		{
			this.addr=addr;
		}

		public Address getAddress()
		{
			return addr;
		}

		public void settype(EmployeeType type)
		{
			this.type=type;
		}

		public EmployeeType gettype()
		{
			return type;
		}

		public void setid(int id)
		{
			this.id=id;
		}
		public int getid()
		{
			return id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
public void setCompany(Company compnay)
{
	this.company=company;
}
		
	public Company getCompany()	
	{
		return company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", addr=" + addr + ", type=" + type + ", company=" + company + "]";
	}

		
		
		
}




