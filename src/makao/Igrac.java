package makao;

import java.util.ArrayList;

public class Igrac {
//	Kreirati klasu Igrac koja ima:
//		ime i prezime
//		niz karata.
//		konstuktor koji postavlja ime i prezime
//		getter za karte
//		metodu dodajKartu koja dodaje prosledjenu kartu u niz.
//		metodu da li postoji karta, koja vraca true/false ako karta postoji u nizu. Metoda prime broj i znak karte.
//		metodu odigrajKartu - metoda kao parametar prima broj i znak karte koju treba da odigra. 
//		Metoda iz niza karata pronalazi kartu izbacuje je iz niza i vraca kao povratnu vrednost metode. 
//		Primer ako igrac ima karte [ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
//		i pozove se metoda milan.odigraj(12, “srce”) metoda vraca objekat Karta koja ima 12 i srce. 
//		Nakon izvrsenja metode stanje kod igraca je [ 10 /\ ] [ Q <> ] [ A *** ]
//		metodu stampaj koja stampa podatke o igracu u formatu:
//		[Ime i prezime]
//		[Karte]
//		Primer:
//		Milan Jovanovic
//		[ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
	
	private String igrac;
	private ArrayList<Karta> karte= new ArrayList<Karta>();
	
	public Igrac(String igrac) {
		this.igrac = igrac;
	}

	public ArrayList<Karta> getKarte() {
		return karte;
	}
	
	public void dodajKartu(Karta karta) {
		karte.add(karta);
	}
	
//	metodu da li postoji karta, koja vraca true/false ako karta postoji u nizu. Metoda prime broj i znak karte.
	
	public boolean daLiPostojiUNizu(String broj, String znak) {
		for (int i = 0; i < karte.size(); i++) {
			if(this.karte.get(i).getBroj().equals("broj") && this.karte.get(i).getZnak().equals(znak)) {
				return true;
			}
		}
		return false;
	}
	
//	metodu odigrajKartu - metoda kao parametar prima broj i znak karte koju treba da odigra. 
//	Metoda iz niza karata pronalazi kartu izbacuje je iz niza i vraca kao povratnu vrednost metode. 
//	Primer ako igrac ima karte [ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
//	i pozove se metoda milan.odigraj(12, “srce”) metoda vraca objekat Karta koja ima 12 i srce. 
//	Nakon izvrsenja metode stanje kod igraca je [ 10 /\ ] [ Q <> ] [ A *** ]
	
	public Karta odigrajKartu(String broj, String znak) {
		Karta karta = new Karta("", "");
		for (int i = 0; i < karte.size(); i++) {
			if(this.karte.get(i).getBroj().equals("broj") && this.karte.get(i).getZnak().equals(znak)) {
				karta= karte.get(i);
				karte.remove(i);
				
			}
			
		}
		return karta;
	}
	
	public void print() {
		System.out.println("Igrac:" + this.igrac);
		for (int i = 0; i < karte.size(); i++) {
			System.out.print("[ " + this.karte.get(i).getBroj()+" " + this.karte.get(i).getZnak() + " ]");
		}
	}

}
