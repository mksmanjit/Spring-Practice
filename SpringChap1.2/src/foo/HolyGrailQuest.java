package foo;

public class HolyGrailQuest implements Quest{
	
	public Object embark(){
		return new HolyGrailQuest();
	}
}
