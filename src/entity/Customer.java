package entity;

public class Customer {
	private String cname;																																																																															
	private int Cid;
	private long cphno;
	private String cemail;
	private Caddress caddress;
	private String Cpan;
	private double camt;
	
	

	public Customer(String cname, int cid, long cphno, String cemail, String cpan,int doorno, String street, String dst, String state, String country, int pincode) {
		this.cname = cname;
		this.Cid = cid;
		this.cphno = cphno;
		this.cemail = cemail;
		this.caddress = new Caddress(doorno,street, dst, state, country,  pincode);
		this.Cpan = cpan;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}


	public Caddress getCaddress() {
		return caddress;
	}

	public void setCaddress(Caddress caddress) {
		this.caddress = caddress;
	}

	public String getCpan() {
		return Cpan;
	}

	public void setCpan(String cpan) {
		Cpan = cpan;
	}
	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", Cid=" + Cid + ", cphno=" + cphno + ", cemail=" + cemail + ", caddress="
				+ caddress + ", Cpan=" + Cpan + "]";
	}

	

}
