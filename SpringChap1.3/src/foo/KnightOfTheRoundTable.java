package foo;

public class KnightOfTheRoundTable implements Knight {
	private String name;
	private Quest quest;
	private Minstrel minstrel;
	@Override
	/*public Object embarkOnQuest() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
		Quest grail = (Quest) quest.embark();
		return grail;
	}*/
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		System.out.println(this.getName());
		//Quest grail = (Quest) quest.embark();
	}
	public KnightOfTheRoundTable(String name){
		this.setName(name);
	}
	public void setQuest(Quest quest){
		this.quest = quest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Minstrel getMinstrel() {
		return minstrel;
	}
	public void setMinstrel(Minstrel minstrel) {
		this.minstrel = minstrel;
	}

}
