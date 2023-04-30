package linearniSeznam;

public class Uzel {

	public int data;
	public Uzel dalsi;
	public Uzel predchozi;
	
	public Uzel(int data) {
		super();
		this.data = data;
	}

	public Uzel getDalsi() {
		return dalsi;
	}

	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}

	public Uzel getPredchozi() {
		return predchozi;
	}

	public void setPredchozi(Uzel predchozi) {
		this.predchozi = predchozi;
	}

	

	
}
