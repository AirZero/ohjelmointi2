package Kirjarekisteri;



/**
 * @author Timo
 * @version 25.3.2019
 * 
 * Hallinnoi yhden Kirjan tietojen syntaksia ja käsittelyä
 *
 */
public class Kirja {

	private int KirjailijaID;
	private int KirjaID;
	private String KirjanNimi;
	private int Julkaisuvuosi;
	private String LuettuPvm;
	
	
	/**
	 * Muodostaja
	 */
	public Kirja() {
		//
	}
	
	/**
	 * @return Kirjalijan ID
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int KirjailijaID() {
	    return KirjailijaID;
	}
	
	/**
	 * @return Kirjan ID
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int KirjaID() {
	    return KirjaID;
	}
	
	/**
	 * @return Kirjan nimi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String KirjanNimi() {
	    return KirjanNimi;
	}
	
	/**
	 * @return Päivämäärä joilloin kirja luettiin loppuun
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String LuettuPvm() {
	    return LuettuPvm;
	}
	
	
	/**
	 * @return Kirjan julkaisuvuosi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int Julkaisuvuosi() {
	    return Julkaisuvuosi;
	}
	
	//Minkä tahansa kentän muuntaminen Stringiksi
	@Override
	public String toString() {
		return "";
		
	}
	

	/**
	 * Kirjan tietojen tulostus
	 */
	public void tulosta() {
		//Kaikkien tietojen tulostus, mallissa käytetään Veskun metodia
	}
	
	/**
	 * tietojen erottaminen |..|..-merkkijonosta
	 */
	public void parse() {
		//
	}
	
	/**
	 * Syntaksin tarkistus
	 */
	public void tarkista() {
		//Ehtolauseilla kaikkien kenttien tarkastus samaan?
	}
	
	/**
	 * Merkkijono |..|..-merkkijonon i:nneksi kentäksi
	 */
	public void aseta() {
		//
	}
	
	
	
	/**
	 * Testiohjelma kirjalle.
	 * @param args ei käytössä
	 */
	public static void main(String args[]) {
		//


	}
	
	
}
