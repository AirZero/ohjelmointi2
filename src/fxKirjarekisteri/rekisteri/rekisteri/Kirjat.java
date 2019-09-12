package Kirjarekisteri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Luokka kirjailijan kirjojen hallinnalle
 * @author Timo Pakarinen & Eetu Rantakangas
 * @version 26.8.2019
 *
 */
public class Kirjat implements Iterable<Kirja> {
	
	private boolean muutettu = false;
	private String tiedostonPerusNimi = "";
	
	/* 
	 * Taulukko Kirjoista
	 */
	 private final Collection<Kirja> alkiot = new ArrayList<Kirja>();
	
	 
	  /**
	 * Kirjojen alustaminen
	 */
	public Kirjat() {
		  //
	  }
	 
	
	/**
	 * Lis‰‰ Kirjan listaan
	 * @param kir lis‰tt‰v‰ kirja
	 */
	public void lisaa(Kirja kir) {
		alkiot.add(kir);
		muutettu = true;
	}
	 
	 
	/**
	 * Tiedoston luku listaksi Kirjoista
	 * @param tied tiedoston nimi
	 * @throws IOException virhe
	 */
	public void lueTiedostosta(String tied) throws IOException {
		setTiedostonPerusNimi(tied);
		try ( BufferedReader fi = new BufferedReader(new FileReader(getTiedostonPerusNimi())) ) {
			
			String rivi;
			
			 while ((rivi = fi.readLine()) != null) {
				 rivi = rivi.trim();
				 if ( "".equals(rivi) || rivi.charAt(0) == ';' ) continue;
				 Kirja kirja = new Kirja();
				 kirja.parse(rivi);
				 lisaa(kirja);
			 }
			 muutettu = false;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Tiedosto " + getTiedostonPerusNimi() + " ei aukea");
		} catch (IOException e) {
			throw new IOException("Ongelmia tiedoston kanssa: " + e.getMessage());
		}
	}
	
	/**
	 * Aiemman nimen luku
	 * @throws IOException virhe
	 */
	public void lueTiedostosta() throws IOException {
		lueTiedostosta(getTiedostonPerusNimi());
	}
	 
	 
	 
	private String getTiedostonPerusNimi() {
		return tiedostonPerusNimi;
	}


	private void setTiedostonPerusNimi(String nimi) {
		tiedostonPerusNimi = nimi;
	}

	/**
	 * Tiedoston tallennus
	 * @throws IOException virhe
	 */
	public void tallenna() throws IOException {
		if (!muutettu) return;
		
		File fbak = new File(getBakNimi());
		File ftied = new File(getTiedostonPerusNimi());
		fbak.delete(); // if .. System.err.println("Ei voi tuhota");
		ftied.renameTo(fbak); // if .. System.err.println("Ei voi nimet‰");
		
		try ( PrintWriter fo = new PrintWriter(new FileWriter(ftied.getCanonicalPath())) ) {
			 fo.println(getTiedostonPerusNimi());
			 for (Kirja kirja : this) {
				 fo.println(kirja.toString());
			 }
		} catch ( FileNotFoundException ex ) {
			throw new FileNotFoundException("Tiedosto " + ftied.getName() + " ei aukea");
		} catch ( IOException ex ) {
			throw new IOException("Tiedoston " + ftied.getName() + " kirjoittamisessa ongelmia");
		}
		muutettu = false;
	}

	private String getBakNimi() {
		return getTiedostonPerusNimi() + ".bak";
	}

	/**
	 * Kirjojen m‰‰r‰
	 * @return Alkioiden m‰‰r‰
	 */
	public int getLkm() {
		return alkiot.size();
	}
	
	/**
	 * Nimi tallennusta varten
	 * @return tiedosto.dat
	 */
	public String getTiedostonTallennusNimi() {
		return getTiedostonPerusNimi() + ".dat";
	}
	
	/**
	 * Iteraattori Kirjoille
	 */
	@Override
	public Iterator<Kirja> iterator() {
		return alkiot.iterator();
	}
	
	
	/**
	 * Tietin kirjailijan kirjojen haku
	 * @param kirjailijaID hakuehto etsinn‰lle
	 * @return list‰ t‰sm‰‰vist‰
	 */
	public List<Kirja> annaKirjat(int kirjailijaID) {
		List<Kirja> loydetyt = new ArrayList<Kirja>();
		
		for (Kirja kirja : alkiot)
			if ( kirja.getKirjailijaID() == kirjailijaID ) loydetyt.add(kirja);
		return loydetyt;
	}
	
	
	
	
	
	
	
	
	
	


	
	/**
	 * Poistaa taulukosta merkkijonon
	 */
	public void poista() {
		//
	}
		
	/**
	 * Lajittelee taulukon
	 */
	public void lajitele() {
		//
	}
	
	//Kirjat-tiedoston lukeminen ja siihen kirjoittaminen

	/**
	 * Testiohjelma kirjoille.
	 * @param args ei k‰ytˆss‰
	 */
	public static void main(String args[]) {
		//


	}
}
