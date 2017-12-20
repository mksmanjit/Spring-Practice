package foo;

public class AutowireImpl implements AutoWire{
	private String name;
	private Integer count;
	private Demo demo;
	public AutowireImpl(Demo demo){
		this.demo = demo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Demo getDemo() {
		return demo;
	}
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	

}
