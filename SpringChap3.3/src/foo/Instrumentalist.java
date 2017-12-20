package foo;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer {

	@Override
	public void performer() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + getSong() + " : ");
	}
	
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private String song;
	private Instrument instrument;

}
