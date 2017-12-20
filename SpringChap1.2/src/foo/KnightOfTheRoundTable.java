package foo;

public class KnightOfTheRoundTable implements Knight {

	private String name;
	private Quest quest;
	
	public KnightOfTheRoundTable(String name){
		this.name = name;
	}
	public void setQuest(Quest quest){
		this.quest = quest;
	}
	public Object embarkOnQuest(){
		System.out.println("Embark On Quest");
		return quest.embark();
	}
}
