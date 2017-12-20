package foo;

public class OneManBand implements Performer {
	public void perform(){
		System.out.println(song);
		instrument.play();
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	private Instrument instrument;
	private String song;
}
