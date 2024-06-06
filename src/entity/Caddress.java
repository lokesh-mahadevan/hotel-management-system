package entity;

public class Caddress {
	private int Doorno;
	private String street;
	private String dst;
	private String state;
	private String Country;
	private int Pincode;
	public Caddress(int doorno, String street, String dst, String state, String country, int pincode) {
		super();
		Doorno = doorno;
		this.street = street;
		this.dst = dst;
		this.state = state;
		Country = country;
		Pincode = pincode;
	}
	public int getDoorno() {
		return Doorno;
	}
	public void setDoorno(int doorno) {
		Doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Caddress [Doorno=" + Doorno + ", street=" + street + ", dst=" + dst + ", state=" + state + ", Country="
				+ Country + ", Pincode=" + Pincode + "]";
	}
	
	
	

}
