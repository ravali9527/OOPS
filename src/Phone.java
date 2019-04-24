package objectOrientedProgramming;

public class Phone {

	private int id;
	private String areaCode;
	private String number;
	private String countryCode;
	public Phone(int id, String areaCode, String number, String countryCode) {
		this.id = id;
		this.areaCode = areaCode;
		this.number = number;
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", areaCode=" + areaCode + ", number=" + number + ", countryCode=" + countryCode
				+ "]";
	}

}
	
	