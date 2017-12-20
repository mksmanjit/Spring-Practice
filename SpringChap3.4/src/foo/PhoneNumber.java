package foo;

public class PhoneNumber {

	private String areaCode;
	private String prefix;
	private String number;
	
	public PhoneNumber(){
		
	}
	public PhoneNumber(String areaCode , String prefix,String number){
		
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.number = number;
	}
	
	public String toString(){
		return this.areaCode + this.prefix + this.number;
	}
	
}
