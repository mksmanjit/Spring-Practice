package foo;

import java.util.Map;

public class OneManBandMap implements Performer{
private Map<String,Instrument> instruments;

@Override
public void perform() {
	// TODO Auto-generated method stub
	for(String key : instruments.keySet()){
		System.out.print(key+" : ");
		Instrument instrument = instruments.get(key);
		instrument.play();
	}
	
}

public Map<String,Instrument> getInstruments() {
	return instruments;
}

public void setInstruments(Map<String,Instrument> instruments) {
	this.instruments = instruments;
}
}
