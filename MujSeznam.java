package linearniSeznam;

public class MujSeznam {
	
	Uzel hlavicka;
	Uzel ocasek;
	
	public void pridejNaZacatek(int data) {
		Uzel novyUzel = new Uzel(data);
		
		if (hlavicka==null) {
			hlavicka = novyUzel;
		}
		
		else {
			Uzel pomocna = hlavicka;
			hlavicka = novyUzel;
			hlavicka.predchozi = hlavicka;
			hlavicka.dalsi = pomocna;
		}
		
	}
	
	public void pridejNaKonec(int data) {
		Uzel novyUzel = new Uzel(data);
		novyUzel.dalsi = null;
		novyUzel.predchozi = null;
		
		if (ocasek==null) {
			ocasek = novyUzel;
		}
		
		else {
			Uzel pomocna = ocasek;
			ocasek = novyUzel;
			pomocna.dalsi = ocasek;
			ocasek.predchozi = pomocna;
		}
	}
	
	public void odstranPrvni() {
		if (hlavicka == null) {
			return;
		}
		else { 
			hlavicka = hlavicka.dalsi;
			hlavicka.predchozi = null;
		}
	}
	
	public void tiskniList() {
		Uzel konkretniUzel = hlavicka;
		Uzel posledniUzel = ocasek;
		System.out.println("\nLinearni Seznam: ");
		
		while(konkretniUzel != null) {
			System.out.println(konkretniUzel.data + " ");
			konkretniUzel = konkretniUzel.dalsi;
		}
		
		System.out.println("\nLinearni Seznam pozadu: ");
		
		while (posledniUzel != null) {
			System.out.println(posledniUzel.data + " ");
			posledniUzel = posledniUzel.predchozi;
		}
		System.out.println();
	}
	
	public boolean obsahuje(int cislo) {
		Uzel konkretniUzel = hlavicka;
		
		while (konkretniUzel != null) {
			if (konkretniUzel.data == cislo) {
				return true;
			}
			konkretniUzel = konkretniUzel.dalsi;
		}
		return false;		
	}

	
		
	
}

