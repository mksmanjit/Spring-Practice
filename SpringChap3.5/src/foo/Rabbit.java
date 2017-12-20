package foo;

public class Rabbit {

	private String original=null;

	public String getOriginal() {
		System.out.println("Getter");
		return original;
	}

	public void setOriginal(String original) {
		System.out.println("Setter");
		this.original = original;
	}
	
	
}
