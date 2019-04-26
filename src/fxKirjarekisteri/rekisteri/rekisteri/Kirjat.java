package rekisteri;

import java.io.BufferedReader;
import java.io.FileReader;

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
	String kirjanNimi;
	
	//"Kirjailijat.dat"
	
	/*
    * <pre name="test">
    *   Kirjat testi = new Kirjat();
    * </pre>
    */
	
	public Kirjat() {
        
    }

	
	public void lueTiedostosta(/*String tiedostoNimi*/)  throws Exception {
		// todo poikkeuksenkäsittely
		 try ( BufferedReader fi = new BufferedReader(new FileReader("Kirjailijat.dat"/*tiedostoNimi*/)) ) {
	            kirjanNimi = fi.readLine();
	  //          if (kirjanNimi = null) throw new Exception("Kirjan nimi puuttuu");
	            System.out.println("testi");
	            
	}
		 System.out.println("testi");
	
}
}