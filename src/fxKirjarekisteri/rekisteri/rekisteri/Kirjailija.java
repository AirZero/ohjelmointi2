package Kirjarekisteri;

/**
 * @author Timo Pakarinen & Eetu Rantakangas
 * @version 14.8.2019
 */
public class Kirjailija {
	
	private int kirjailijaID = 0;
	private String kirjailijanNimi = "";
	private String syntymavuosi = "0";
	private String kuolinvuosi = "0";
	private String kotimaa = "";
	
	private static int seuraavaNro = 1;
	
	
	
	
	/**
	 * Testiarvot oliolle
	 */
	public void vastaa() {
		kirjailijanNimi = "Matti";
		syntymavuosi = "1918";
		kuolinvuosi = "2000";
		kotimaa = "Suomi";
	}
	
	
	
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
	 * @return Kirjailijan ID
	 */
	public int getKirjailijaID() {
	    return kirjailijaID;
	}
	
	/**
	 * @return Kirjailijan nimi
	 */
	public String getKirjailijanNimi() {
	    return kirjailijanNimi;
	}
	
	/**
	 * @return Kirjailijan syntym‰vuosi
	 */
	public String getSyntymavuosi() {
	    return syntymavuosi;
	}
	
	/**
	 * @return Kirjailijan kuolinvuosi
	 */
	public String getKuolinvuosi() {
	    return kuolinvuosi;
	}
	
	/**
	 * @return Kirjailijan kotimaa
	 */
	public String getKotimaa() {
	    return kotimaa;
	}
	
	/**
	 * @param id asetettava ID-numero
	 */
	public void setId(int id) {
		kirjailijaID = id;
	}
	
	/**
	 * @param nimi asetettava nimi kirjailijalle
	 * @return null
	 */
	public String setNimi(String nimi) {
		kirjailijanNimi = nimi;
		return null;
	}
	
	/**
	 * @param kuolin asetettava kuolinvuosi
	 * @return null
	 */
	public String setSyntymavuosi(String kuolin) {
		syntymavuosi = kuolin;
		return null;
	}
	
	/**
	 * @param syntyma asetettava synnyinvuosi
	 * @return null
	 */
	public String setKuolinvuosi(String syntyma) {
		kuolinvuosi = syntyma;
		return null;
	}
	
	/**
	 * @param koti asetettava kotimaa
	 * @return null
	 */
	public String setKotimaa(String koti) {
		kotimaa = koti;
		return null;
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
	 * tietojen erottaminen ..|..|-merkkijonosta
	 * @param rivi erotettava rivi tietokannasta
	 * 
	 * @example
	 * <pre name="test">
	 * Kirjailija testi = new Kirjailija();
	 * String eka = "1|Nimi|1900|2000|Suomi";
	 * testi.parse(eka);
	 * testi.getKirjailijaID() === 1;
	 * testi.getKirjailijanNimi() === "Nimi";
	 * testi.getSyntymavuosi() === "1900";
	 * testi.getKuolinvuosi() === "2000";
	 * testi.getKotimaa() === "Suomi";
	 * testi.toString() === "1|Nimi|1900|2000|Suomi";
	 * </pre>
	 */
	public void parse(String rivi) {

		StringBuilder sb = new StringBuilder(rivi);
		String id = sb.substring(0, sb.indexOf("|"));
		int Idnro = Integer.parseInt(id);
		setId(Idnro);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String nimi = sb.substring(0, sb.indexOf("|"));
		setNimi(nimi);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String syntyma = sb.substring(0, sb.indexOf("|"));
		setSyntymavuosi(syntyma);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String kuolin = sb.substring(0, sb.indexOf("|"));
		setKuolinvuosi(kuolin); 
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		setKotimaa(sb.substring(0));
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
		eino.vastaa();
		System.out.println(eino.toString());
		Kirjailija testi = new Kirjailija();
		
		testi.parse("124|jyrgen|11|12|suomi");
		System.out.println(testi.toString());
		
		System.out.println(testi.getKirjailijanNimi());
	}



}
