package foo;

import java.util.Iterator;
import java.util.Properties;

public class OneManBandProp implements Performer {
	private Properties instruments;
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		for(Iterator itr = instruments.keySet().iterator();itr.hasNext();){
			String key = (String) itr.next();
			System.out.println(instruments.getProperty(key));
		}
	}
	public Properties getInstruments() {
		return instruments;
	}
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}

}
