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
	
//	metodu izvuciKartu. Simuliramo situaciju kada igrac nema sta da odigra, pa mora da izvuce novu kartu. 
//	Metoda iz spila izvlaci kartu i dodaje je igracu koji je na redu da igra.
	
	public void izvuciKartu(Igrac igrac) {
    	
		for (int i = 0; i < karte.size(); i++) {
			int index = randomGenerator.nextInt(karte.size());
			Karta random = karte.get(index);
			this.igraci.get(i).dodajKartu(random);
		}
		
	}
	
//	metoda odigraj kartu:
//		od parametara prima broj i znak karte. Npr: makao.odigraj(11, ?srce?)
//		potrebna je prover da li igrac, koji je na redu da igra, ima tu kartu kod sebe. Ako je nema ispisati gresku!
//		potrebna je provera da li je moguce odgirati tu kartu. Da li je moguce postaviti tu kartu preko one koja je zadnja odigrana. 
//		Ako nije moguce ispisati gresku.
//		[Ako je moguce odigrati tu kartu i igrac koji je na redu ima tu kartu] onda tu kartu izvucete od igraca 
//		(imate metodu odigraj koja i izbaci to iz niza karata koji ima igrac) i postavite je u niz odigranih karata.
//		Zatim potrebno je izvrsiti igru po pravilima. Ako je odigrana karta:
//		7 - onda sledecem igracu dodate 2 karte i taj igrac je sledeci na redu.
//		8 - preskacete sledeceg igraca 
//		A - mora da poklopi kec. Tada ne prelazimo na sledec igraca, nego fokus ostaje na istog.
//		2 detelina - prethodnom igracu dodelite 4 karte iz spila i prelazite na sledeceg..


	public void odigrajKartu(String broj, String znak) {
		for (int i = 0; i < igraci.size(); i++) {
			if(this.naPotezu==i && this.igraci.get(i).daLiPostojiUNizu(broj, znak)) {
				for (int j = 0; j < this.karte.size(); j++) {
					if(this.karte.get(j).daLiJeMogucePoklopiti(broj, znak)){
						this.karte.add(this.igraci.get(j).odigrajKartu(broj, znak));
					
					}else {
						System.out.println("Nije moguce odigrati potez!!");
					}
				}
			}
		}
	}
}

	