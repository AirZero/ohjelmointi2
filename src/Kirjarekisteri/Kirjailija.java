package Kirjarekisteri;

/**
 * @author Timo Pakarinen & Eetu Rantakangas
 * @version 30.3.2019
 * 
 * 
 *
 */
public class Kirjailija {
	
	private int kirjailijaID = 0;
	private String kirjailijanNimi = "";
	private int syntymavuosi = 0;
	private int kuolinvuosi = 0;
	private String kotimaa = "";
	
	private static int seuraavaNro = 1;
	
	
	/**
	 * @return lis‰tyn kirjailijan ID
	 * @example
	 * <pre name="test">
	 * 
	 * </pre>
	 *
	 */
	public int rekisteroi() {
		kirjailijaID = seuraavaNro;
		seuraavaNro++;
		return kirjailijaID;
	}
	
	/**
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public Kirjailija() {
		//Kirjailija-olion muodostaja
	}
	
	/**
	 * @return Kirjailijan ID
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int getKirjailijaID() {
	    return kirjailijaID;
	}
	
	/**
	 * @return Kirjailijan nimi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String getKirjailijanNimi() {
	    return kirjailijanNimi;
	}
	
	/**
	 * @return Kirjailijan syntym‰vuosi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int getSyntymavuosi() {
	    return syntymavuosi;
	}
	
	/**
	 * @return Kirjailijan kuolinvuosi
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public int kuolinvuosi() {
	    return kuolinvuosi;
	}
	
	/**
	 * @return Kirjailijan kotimaa
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String kotimaa() {
	    return kotimaa;
	}
	
	//Mink‰ tahansa kent‰n muuntaminen Stringiksi
	@Override
	public String toString() {
		return kirjailijanNimi;
		
	}
	

	/**
	 * Kirjalijan tietojen tulostus
	 */
	public void tulosta() {
		//Kaikkien tietojen tulostus, mallissa k‰ytet‰‰n Veskun metodia
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
	 * Merkkijono |..|..-merkkijonon i:nneksi kent‰ksi
	 */
	public void aseta() {
		//
	}
	
	
	/**
	 * @param args Testip‰‰ohjelma
	 */
	public static void main(String[] args) {
		Kirjalija eino = New Kirjailija();
	}



}
