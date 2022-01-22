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
	

}
