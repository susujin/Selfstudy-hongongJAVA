package sec01.ex05;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company=company;
		this.os=os;
	}
	
	@Override
	public String toString() {
		return company+","+os;
	}
}
