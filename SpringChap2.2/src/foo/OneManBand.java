package foo;

import java.util.Collection;
import java.util.Iterator;

public class OneManBand implements Performer {
	private Collection instruments;
	public void perform(){
		Iterator itr = instruments.iterator();
		while(itr.hasNext()){
			Object obj = itr.next();
			if(obj instanceof Instrument){
				((Instrument) obj).play();
			}else{
				System.out.println(obj.toString());
			}
		}
	}
	public Collection getInstruments() {
		return instruments;
	}
	public void setInstruments(Collection instruments) {
		this.instruments = instruments;
	}

}
