package makao;

import java.util.ArrayList;
import java.util.Random;

public class Makao {
//	spil karata - objekat SPIL !! 
//	niz igraca za stolom (Uvek igramo sa 4 igraca da bude jednostavnije)
//	niz odigranih karata.
//	indeks igraca koji je na redu da igra. Indeks varira od 0 do 3) i u startu je 0 tj. kada se napravi objekat Sto treba da igra igrac na poziciji 0.
//	konstuktor koji postavlja spil karata
//	metodu pristupi stolu - metodi se prosledjuje igrac i dodaje se u niz igraca
//	metodu podeli karte koja za svakog igraca iz spila izvlaci pod 6 random (mozete 3 pa jos 3, svejedno je) karata i dodeljuje ih igracima.
//	metodu sledeci koja pomera indeks na sledeceg igraca
	
	private Random randomGenerator = new Random();
	private ArrayList<Spil> spil = new ArrayList<Spil>();
	private ArrayList<Igrac> igraci = new ArrayList<Igrac>(4);
	private ArrayList<Karta> karte = new ArrayList<Karta>(); 
	private int naPotezu;
	
	public Makao() {
		
	}

	public Makao(ArrayList<Spil> spil) {
		this.spil = spil;
	}
	
	public void pristupiStolu(Igrac igrac) {
		igraci.add(igrac);
	}
	
	public void podeliKate(Igrac igrac) {
    	
			
    		for (int j = 0; j < 6; j++) {
				int index = randomGenerator.nextInt(karte.size());
				Karta random = karte.get(index);
        	
				//this.igraci[i].g
				this.igraci.get(j).dodajKartu(random);
			}
			
    }
	
	public void sledeciIgra() {
		if (this.naPotezu<3) {
			this.naPotezu++;
		}else {
			this.naPotezu=0;
		}
	}
	
	public void print() {
		System.out.println("****************************************");
		for (int i = 0; i < igraci.size(); i++) {
			if(i==this.naPotezu) {
				this.igraci.get(i).print();
				System.out.println("****************************************");
			}else {
				this.igraci.get(i).print();
			}
		}
		System.out.print("Poslednja karta na stolu je: ");
		for (int i = karte.size()-1; i < karte.size(); i++) {
			this.karte.get(i).print();
		}
	}
	
//	metodu za kraj igre. Metoda vraca boolean, true ako postoji neki igrac sa bez ijedne karte u suprotnom vraca false.
	
	public boolean kraj() {
	
		for (int i = 0; i < igraci.size(); i++) {
			if(this.igraci.get(i).getKarte().isEmpty()) {
				return true;
			}
			
		}
		return false;
	}
	
//	metoda koja vraca pobednika igre. Metoda vraca igraca (objekat) koji kod sebe nema nijednu kartu.
	
	public Igrac pobednik() {
		Igrac igrac = new Igrac("");
		for (int i = 0; i < igraci.size(); i++) {
			if(this.igraci.get(i).getKarte().isEmpty()) {
				igrac= igraci.get(i);
			}
		}
		return igrac;
	}
}

	