package makao;

import java.util.ArrayList;
import java.util.Random;

public class Spil {
//	Kreirati klasu Spil koja ima:
//		niz karata - nemamo ni getter ni setter za ovaj atribut.
//		difoltni konstuktor koji kreira niz karata. Ovaj konstuktor NE PRIMA PARAMETRE!. 
//		U konstukrotu kreiramo niz karata tako sto dodajemo 52 karte, rucno!.
//		Primer:
//		karte.add(new Karta(2, “srce”));
//		karte.add(new Karta(2, “kocka”));
//		….
//		metodu izvuci random kartu iz spila koja vraca OBJEKAT koji je tipa Karta. Z
//		a uzimanje random elementa iz liste imate koristan link. Nakon sto nadjete random kartu izbacite je iz niza, 
//		a zatim je vratite kao povratnu vrednost metode. 
//		Primer izvrsenja:
//		Karta k = spil.izvuciRandom();
//		k.stampaj() => stampa se na primer [ A <3 ] 
	
	private Random randomGenerator = new Random();
	private ArrayList<Karta> karte= new ArrayList<Karta>();

	public Spil() {
		karte.add(new Karta("2", "srce"));
		karte.add(new Karta("2", "kocka"));
		karte.add(new Karta("2", "dama"));
		karte.add(new Karta("2", "tref"));
		karte.add(new Karta("3", "srce"));
		karte.add(new Karta("3", "kocka"));
		karte.add(new Karta("3", "dama"));
		karte.add(new Karta("3", "tref"));
		karte.add(new Karta("4", "srce"));
		karte.add(new Karta("4", "kocka"));
		karte.add(new Karta("4", "dama"));
		karte.add(new Karta("4", "tref"));
		karte.add(new Karta("5", "srce"));
		karte.add(new Karta("5", "kocka"));
		karte.add(new Karta("5", "dama"));
		karte.add(new Karta("5", "tref"));
		karte.add(new Karta("6", "srce"));
		karte.add(new Karta("6", "kocka"));
		karte.add(new Karta("6", "dama"));
		karte.add(new Karta("6", "tref"));
		karte.add(new Karta("7", "srce"));
		karte.add(new Karta("7", "kocka"));
		karte.add(new Karta("7", "dama"));
		karte.add(new Karta("7", "tref"));
		karte.add(new Karta("8", "srce"));
		karte.add(new Karta("8", "kocka"));
		karte.add(new Karta("8", "dama"));
		karte.add(new Karta("8", "tref"));
		karte.add(new Karta("9", "srce"));
		karte.add(new Karta("9", "kocka"));
		karte.add(new Karta("9", "dama"));
		karte.add(new Karta("9", "tref"));
		karte.add(new Karta("10", "srce"));
		karte.add(new Karta("10", "kocka"));
		karte.add(new Karta("10", "dama"));
		karte.add(new Karta("10", "tref"));
		karte.add(new Karta("J", "srce"));
		karte.add(new Karta("J", "kocka"));
		karte.add(new Karta("J", "dama"));
		karte.add(new Karta("J", "tref"));
		karte.add(new Karta("Q", "srce"));
		karte.add(new Karta("Q", "kocka"));
		karte.add(new Karta("Q", "dama"));
		karte.add(new Karta("Q", "tref"));
		karte.add(new Karta("K", "srce"));
		karte.add(new Karta("K", "kocka"));
		karte.add(new Karta("K", "dama"));
		karte.add(new Karta("K", "tref"));

	} 
	
	public Karta izvuciRandom()
    {
        int index = randomGenerator.nextInt(karte.size());
        Karta random = karte.get(index);
        return random;
    }
	
	
	
	
	
	

}
