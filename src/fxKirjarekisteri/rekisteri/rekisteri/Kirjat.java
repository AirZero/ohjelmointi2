package rekisteri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 
 * @author Eetu Rantakangas ja Timo Pakarinen
 *
 * Luokka hoitaa kirjojen tietojen tallentamisen tiedostoon ja tietojen lukemisen tiedostosta.
 * 
 * 
 */
public class Kirjat {
	
	//new Kirjat().lueTiedostosta();

	
	
	//"Kirjailijat.dat"
	
	/*
    * <pre name="test">
    *   Kirjat testi = new Kirjat();
    * </pre>
    */
	
	public Kirjat() {
        
    }
	
	public static void main(String[] args) {
		
		try {
			lueTiedostosta();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void tallennaKantaan(String tallennettava, int rivi, int sarake) {
		
	}

	
	public static void lueTiedostosta(/*String tiedostoNimi*/)  throws Exception {
		// todo poikkeuksenkäsittely
		String kirjatTaulukko[]; 
		int riviNro = 0;
		// try ( BufferedReader fi = new BufferedReader(new FileReader("C:/ohj2toimiva/ohjelmointi2/Teokset.dat"/*tiedostoNimi*/)) ) {
	     Scanner sc = new Scanner(new BufferedReader(new FileReader("C:/ohj2toimiva/ohjelmointi2/Teokset.dat"/*tiedostoNimi*/)));
			 //kirjanNimi = fi.readLine(); //Lukee tiedoston ensimmäiseltä riviltä sen nimen.
	            String rivi;           
	            
	            
	            
	            int riviLkm = 3;
	            int sarakeLkm = 6;
	            String [][] kirjaTaulukko = new String[riviLkm][sarakeLkm];
	            
	           // while ((rivi = fi.readLine()) != null) {
	          //  	System.out.println(rivi);
	          //  	String kirjat[] = new String[riviNro];
	          //  	riviNro++;
	            while(sc.hasNextLine()) {	
	            	 for (int i=0; i<kirjaTaulukko.length; i++) {
	                    // String[] line = sc.nextLine().trim().split("\\|");
	            		 Kirja kirja = new Kirja(sc.nextLine());
	                /*     for (int j=0; j<line.length; j++) {
	                    	 
	                    	// kirjaTaulukko[i][j] = line[j].trim();
	                    	 //System.out.println(kirjaTaulukko[i][j]);
	                    	 System.out.println(line [j]);
	                    	 Kirja kirja = new Kirja(line[j]);
	                    	 
	                     }*/
	            }
	            }     
	}
	
}
