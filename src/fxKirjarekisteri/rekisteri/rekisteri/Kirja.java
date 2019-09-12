package Kirjarekisteri;



/**
 * @author Timo Pakarinen & Eetu Rantakangas
 * @version 14.8.2019
 * 
 * Hallinnoi yhden Kirjan tietojen syntaksia ja käsittelyä
 *
 */
public class Kirja {

	private int kirjailijaID = 0;
	private int kirjaID = 0;
	private String kirjanNimi = "";
	private String julkaisuvuosi = "0";
	private String luettuPvm = "0";
	
	private static int seuraavaNro = 1;
	
	
	
	/**
	 * Alustetaan kirja
	 */
	public Kirja() {
		//
	}


	
	/**
	 * @return lisätyn kirjan ID
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
	 */
	public int getKirjailijaID() {
	    return kirjailijaID;
	}
	
	/**
	 * @return Kirjan ID

	 */
	public int getKirjaID() {
	    return kirjaID;
	}
	
	/**
	 * @return Kirjan nimi
	 */
	public String getKirjanNimi() {
	    return kirjanNimi;
	}
	
	/**
	 * @return Päivämäärä joilloin kirja luettiin loppuun
	 */
	public String getLuettuPvm() {
	    return luettuPvm;
	}
	
	
	/**
	 * @return Kirjan julkaisuvuosi
	 */
	public String getJulkaisuvuosi() {
	    return julkaisuvuosi;
	}
	
	/**
	 * @param nro Kirjailijan ID
	 */
	public void setKirjailijaID(int nro) {
		kirjailijaID = nro;
	}
	
	/**
	 * @param nro Kirjan ID
	 */
	public void setKirjaID(int nro) {
		kirjaID = nro;
	}
	
	/**
	 * @param nimi Kirjan nimi
	 * @return null
	 */
	public String setNimi(String nimi) {
		kirjanNimi = nimi;
		return null;
	}
	
	/**
	 * @param vuosi Kirjan julkaisuvuosi
	 * @return null
	 */
	public String setJulkaisuvuosi(String vuosi) {
		julkaisuvuosi = vuosi;
		return null;
	}
	
	/**
	 * @param luettu Pvm, jolloi kirja luettiin loppuun
	 * @return null
	 */
	public String setLuettu(String luettu) {
		luettuPvm = luettu;
		return null;
	}
	
	

	@Override
	public String toString() {
		return ""+
				kirjailijaID + "|" +
				kirjaID + "|" +
				kirjanNimi + "|" +
				julkaisuvuosi + "|" +
				luettuPvm;
	}
	

	/**
	 * Kirjan tietojen tulostus
	 */
	public void tulosta() {
		//Kaikkien tietojen tulostus
	}
	
	/**
	 * tietojen erottaminen |..|..-merkkijonosta
	 * @param rivi Parsittava rivi tiedostosta
	 */
	public void parse(String rivi) {
		
		StringBuilder sb = new StringBuilder(rivi);
		String kirjailijaId = sb.substring(0, sb.indexOf("|"));
		int nro = Integer.parseInt(kirjailijaId);
		setKirjailijaID(nro);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String kirjaId = sb.substring(0, sb.indexOf("|"));
		int numero = Integer.parseInt(kirjaId);
		setKirjaID(numero);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String nimi = sb.substring(0, sb.indexOf("|"));
		setNimi(nimi);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String vuosi = sb.substring(0, sb.indexOf("|"));
		setJulkaisuvuosi(vuosi);
		sb.delete(0, sb.indexOf("|"));
		sb.delete(0, 1);
		String pvm = sb.substring(0);
		setLuettu(pvm);
	}
	
	/**
	 * Syntaksin tarkistus
	 */
	public void tarkista() {
		//Ehtolauseilla kaikkien kenttien tarkastus samaan?
	}
	

	/**
	 * Testiohjelma kirjalle.
	 * @param args ei käytössä
	 */
	public static void main(String args[]) {
		Kirja testi = new Kirja();
		
		testi.parse("1|2|taisteluni|1938|10.1.2010");
		System.out.println(testi.toString());

	}
	
	
}
