package foo;

public class Coconut {
	private Lime lime;
	public void drinkThemBothUp(){
		System.out.println("You Put the lime in the coconut...");
		System.out.println("and drink them both up...");
		System.out.println("You put the lime in the coconut...");
		getLime().drink();
		
	}
	public Lime getLime() {
		return lime;
	}
	public void setLime(Lime lime) {
		this.lime = lime;
	}
}
