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
import java.util.NoSuchElementException;

/**
 * @author Timo Pakarinen & Eetu Rantakangas
 * @version 14.8.2019
 *
 */
public class Kirjailijat implements Iterable<Kirjailija>{
	
	private boolean muutettu = false;
	private static final int MAX_ALKIOT = 10;
	private int lkm = 0;
	private String tiedostonNimi = "";
	private String tiedostonPerusNimi = "nimet";
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
		muutettu = true;
	}
	
	/**
	 * @param i haluttu indeksi
	 * @return haluttu indeksi
	 */
	public Kirjailija anna (int i) {
		if ( i < 0 || lkm <= i ) throw new IndexOutOfBoundsException("Laiton indeksi: " + i);
		return alkiot[i];
	}
	
	/**
	 * Tiedoston luku listaksi
	 * @param tied tiedoston nimi
	 * @throws IOException virhe
	 */
	public void lueTiedostosta(String tied) throws IOException {
		setTiedostonPerusNimi(tied);
		try ( BufferedReader fi = new BufferedReader(new FileReader(getTiedostonNimi())) ) {
			tiedostonNimi = fi.readLine();
			if(tiedostonNimi == null) throw new NullPointerException("Tyhjä nimi.");
			String rivi = fi.readLine();
			
			 while ((rivi = fi.readLine()) != null) {
				 rivi = rivi.trim();
				 if ( "".equals(rivi) || rivi.charAt(0) == ';' ) continue;
				 Kirjailija kirjailija = new Kirjailija();
				 kirjailija.parse(rivi);
				 lisaa(kirjailija);
			 }
			 muutettu = false;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Tiedosto " + getTiedostonNimi() + " ei aukea");
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
	
	/**
	 * Tiedoston tallennus
	 * @throws IOException virhe
	 */
	public void tallenna() throws IOException {
		if (!muutettu) return;
		
		File fbak = new File(getBakNimi());
		File ftied = new File(getTiedostonNimi());
		fbak.delete(); // if .. System.err.println("Ei voi tuhota");
		ftied.renameTo(fbak); // if .. System.err.println("Ei voi nimetä");
		
		try ( PrintWriter fo = new PrintWriter(new FileWriter(ftied.getCanonicalPath())) ) {
			 fo.println(getTiedostonNimi());
			 fo.println(alkiot.length);
			 for (Kirjailija kirjailija : this) {
				 fo.println(kirjailija.toString());
			 }
		} catch ( FileNotFoundException ex ) {
			throw new FileNotFoundException("Tiedosto " + ftied.getName() + " ei aukea");
		} catch ( IOException ex ) {
			throw new IOException("Tiedoston " + ftied.getName() + " kirjoittamisessa ongelmia");
		}
		muutettu = false;
	}
	
	
	/**
	 * @return Varmuuskopion nimi
	 */
	public String getBakNimi() {
		return tiedostonPerusNimi + ".bak";
	}




	/**
	 * @return tiedoston nimi tallentamista varten .dat lisällä
	 */
	public String getTiedostonNimi() {
		return tiedostonNimi;
	}
	
	/**
	 * @return Tiedoston nimi + .dat tallennusta varten
	 */
	public String getTallennusNimi() {
		return getTiedostonPerusNimi() + ".dat";
	}

	
	/**
	 * @return Tiedoston perus nimi
	 */
	public String getTiedostonPerusNimi() {
		return tiedostonPerusNimi;
	}




	/**
	 * @param nimi tiedostolle asetettava nimi
	 */
	public void setTiedostonPerusNimi(String nimi) {
		tiedostonPerusNimi = nimi;	
	}

	/**
	 * @return Tallatettujen kirjailijoiden lukumäärä
	 */
	public int getLkm() {
		return lkm;
	}
	
	


	
	/**
	 * Kirjailijoiden iteraattori
	 */
	public class KirjailijatIterator implements Iterator<Kirjailija> {
		private int kohdalla = 0;
		
		/**
		 * Onko vielä seuraavaa?
		 */
		@Override
		public boolean hasNext() {
			return kohdalla < getLkm();
		}
		
		/**
		 * Antaa seuraavan
		 */
		@Override
		public Kirjailija next() throws NoSuchElementException {
			if ( !hasNext() ) throw new NoSuchElementException("Ei oo");
			return anna(kohdalla++);
		}
	
			}
	
	
		/**
		* @return Iteraattori kirjailijoista
	 	*/
		@Override
		public Iterator<Kirjailija> iterator() {
		return new KirjailijatIterator();
		
		}
	
		/**
		 * @param hakuehto hakuehto
		 * @param k etsittävän kentän indeksi
		 * @return lista löytyneistä
		 */
		@SuppressWarnings("unused")
		public Collection<Kirjailija> etsi(String hakuehto, int k) {
			Collection<Kirjailija> loytyneet = new ArrayList<Kirjailija>();
			for (Kirjailija kirjailija : this) {
				loytyneet.add(kirjailija);
			}
			return loytyneet;
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
	
	//Kirjailijat-tiedoston lukeminen ja siihen kirjoittaminen
	
	
	/**
	 * Testiohjelma kirjailijoille.
	 * @param args ei käytössä
	 */
	public static void main(String args[]) {
		//


	}	
}
