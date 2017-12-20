package foo;


public abstract class B implements ASuper{
	private A a;
	public void perform(){
		System.out.println("Perform");
		System.out.println(getLookUpA().getI());
	}
	public void display(){
		System.out.println("Display A");
	}

	/**
	 * @return the a
	 */
	public  A getA() {
		return a;
	}
	
	public abstract A getLookUpA();

	/**
	 * @param a the a to set
	 */
	public void setA(A a) {
		this.a = a;
	}
	
}