

public class Rettangolo {
	private float base ;
	private float altezza ;
	// ... altri metodi e costruttori
	public void setBase ( int x) throws EccezioneBaseNegativa {
		if (x <0) throw new EccezioneBaseNegativa ("Area sbagliata");
	else base = x;
	}


}
