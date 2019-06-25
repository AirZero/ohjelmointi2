package Kirjarekisteri;

/**
 * @author Timo
 * @version 29.3.2019
 *
 */
public class Kirjat {
	
	String kannanNimi;
	String kannanKentat;
	
	Kirjalista<MyObject> kirjat = new Kirjalista<MyObject>();
	
	

	
	/**
	 * Luo taulukon Kirjat-tiedostosta.
	 */
	public void alusta() {
		String kirjatTaulukko[]; 
		int riviNro = 0;
		
	     Scanner sc = new Scanner(new BufferedReader(new FileReader("C:/ohj2toimiva/ohjelmointi2/Teokset.dat"/*tiedostoNimi*/)));
			 kannanNimi = fi.readLine(); //Lukee tiedoston ensimmäiseltä riviltä sen nimen.    
			 kannanKentat = fi.readLine(); //Lukee tiedoston toiselta riviltä sen kenttien nimet.

	            int riviLkm = 3;
	            int sarakeLkm = 6;
	            String [][] kirjaTaulukko = new String[riviLkm][sarakeLkm];

	            while(sc.hasNextLine()) {	
	            	 for (int i=0; i<kirjaTaulukko.length; i++) {
	                    // String[] line = sc.nextLine().trim().split("\\|");
	            		// Kirja kirja = new Kirja(sc.nextLine());   
	            		 kirjat.add( new Kirja(sc.nextLine()) );
	            	 }
	            }     
	}
	
	
	/**
	 * Lisää |..|..-m/erkkijonon taulukkoon
	 */
	public void lisaa() {
		//
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
	
	//Kirjat-tiedoston lukeminen ja siihen kirjoittaminen

	/**
	 * Testiohjelma kirjoille.
	 * @param args ei käytössä
	 */
	public static void main(String args[]) {
		//


	}


	public void lueTiedostosta() {
		// TODO Auto-generated method stub
		
	}
}
