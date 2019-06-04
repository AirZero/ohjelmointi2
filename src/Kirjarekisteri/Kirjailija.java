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
	public int getKuolinvuosi() {
	    return kuolinvuosi;
	}
	
	/**
	 * @return Kirjailijan kotimaa
	 * @example
	 * <pre name="test">
	 * </pre>
	 */
	public String getKotimaa() {
	    return kotimaa;
	}
	
	
	@Override
	public String toString() {
		return "" +
				getKirjailijaID() + "|" +
				kirjailijanNimi + "|" +
				syntymavuosi + "|" +
				kuolinvuosi + "|" +
				kotimaa;
				
		
	}
	

	/**
	 * Kirjalijan tietojen tulostus
	 */
	public void tulosta() {
		System.out.println();
	}
	
	/**
	 * tietojen erottaminen |..|..-merkkijonosta
	 * @param rivi xd
	 */
	public void parse(String rivi) {
		int alku = 0;
		StringBuilder sb = new StringBuilder(rivi);
		kirjailijaID = sb.substring(alku, sb.indexOf("|"));
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
		Kirjailija eino = new Kirjailija();
		eino.rekisteroi();
	}



}
