package Kirjarekisteri;

/**
 * @author Timo
 * @version 29.3.2019
 *
 */
public class Kirjailijat {
	
	
	private static final int MAX_ALKIOT = 10;
	private int lkm = 0;
	private String tiedostonNimi = "";
	private Kirjailija alkiot[] = new Kirjailija[MAX_ALKIOT];
	
	
	/**
	 * Oletusmuodostaja
	 */
	public Kirjailijat() {
		//
	}
	
	
	

	/**
	 * Luo taulukon Kirjailijat-tiedostosta.
	 */
	public void alusta() {
		//
	}
	
	/**
	 * Lisää |..|..-merkkijonon taulukkoon
	 * @param kirjailija lisättävä kirjailija
	 */
	public void lisaa(Kirjailija kirjailija) {
		if (lkm >= alkiot.length) throw new IndexOutOfBoundsException("Liikaa alkioita!");
		alkiot[lkm] = kirjailija;
		lkm++;
	}
	
	/**
	 * Poistaa taulukosta merkkijonon
	 */
	public void poista() {
		//
	}
	
	/**
	 * @return Taulukon alkiot, joissa merkkijono esiintyy.
	 */
	public String etsi() {
		return null;
		
	}
	
	/**
	 * Lajittelee taulukon
	 */
	public void lajitele() {
		//
	}
	
	//Kirjailijat-tiedoston lukeminen ja siihen kirjoittaminen
	
	
	/**
	 * Testiohjelma kirjailijoille.
	 * @param args ei käytössä
	 */
	public static void main(String args[]) {
		//


	}	
}
