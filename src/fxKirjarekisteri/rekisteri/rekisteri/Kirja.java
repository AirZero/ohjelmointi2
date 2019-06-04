package Kirjarekisteri;



/**
 * @author Timo
 * @version 25.3.2019
 * 
 * Hallinnoi yhden Kirjan tietojen syntaksia ja k�sittely�
 *
 */
public class Kirja {

	private int kirjailijaID;
	private int kirjaID;
	private String kirjanNimi;
	private int julkaisuvuosi;
	private String luettuPvm;
	
	private static int seuraavaNro = 1;
	

	/**
	 * Muodostaja
	 */
	public Kirja() {
		//
	}
	
	
	/**
	 * @return lis�tyn kirjan ID
	 * @example
	 * <pre name="test">
	 * 
	 * </pre>
	 */
	public int rekisteroi() {
		kirjaID = seuraavaNro;
		seuraavaNro++;
		return kirjaID;
	}
	
	/**
	 * @param kirjailijaID alustetaan kirjailijan ID kirjalle
	 */
	public Kirja(int kirjailijaID) {
		this.kirjailijaID = kirjailijaID;
	}
	
	
	
	
	/**
	 * @return Kirjalijan ID
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int kirjailijaID() {
	    return kirjailijaID;
	}
	
	/**
	 * @return Kirjan ID
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int kirjaID() {
	    return kirjaID;
	}
	
	/**
	 * @return Kirjan nimi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String kirjanNimi() {
	    return kirjanNimi;
	}
	
	/**
	 * @return P�iv�m��r� joilloin kirja luettiin loppuun
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String luettuPvm() {
	    return luettuPvm;
	}
	
	
	/**
	 * @return Kirjan julkaisuvuosi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int julkaisuvuosi() {
	    return julkaisuvuosi;
	}
	
	//Mink� tahansa kent�n muuntaminen Stringiksi
	@Override
	public String toString() {
		return "";
		
	}
	

	/**
	 * Kirjan tietojen tulostus
	 */
	public void tulosta() {
		//Kaikkien tietojen tulostus, mallissa k�ytet��n Veskun metodia
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
	 * Merkkijono |..|..-merkkijonon i:nneksi kent�ksi
	 */
	public void aseta() {
		//
	}
	
	
	
	/**
	 * Testiohjelma kirjalle.
	 * @param args ei k�yt�ss�
	 */
	public static void main(String args[]) {
		//


	}
	
	
}
