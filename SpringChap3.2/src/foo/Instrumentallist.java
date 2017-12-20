package foo;

public abstract class Instrumentallist implements Performer {

	@Override
	public void Perform() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + getSong() + " : ");
		getInstrument().play();
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	private String song;
	public abstract Instrument getInstrument();
}
