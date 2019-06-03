package rekisteri;

/**
 * 
 * @author Eetu Rantakangas ja Timo Pakarinen
 * 
 * Luokalta voi pyyt‰‰ kirjojen yksitt‰isten kenttien tietoja.
 *
 */
public class Kirja {

	private static int kirjailijanID;
	private static String teoksenNimi;
	private static int julkaisuvuosi;
	private static String luettuPvm;
	private static int kirjanID;
	

	
	public Kirja(String kirjanTiedot) {
		String testi = "Kirjailijan ID| Teoksen nimi             | Julkaisuvuosi| Luettu pvm  | Kirjan ID |";
		String[] tiedot = testi.trim().split("\\|");
   	 	System.out.println(tiedot[0]);	
  
			try {
        		setKirjailijanID(Integer.parseInt(tiedot[0]));
        		//System.out.println(getKirjailijanID());
        		setTeoksenNimi(tiedot[1]);
        		setJulkaisuvuosi(Integer.parseInt(tiedot[2]));
        		setLuettuPvm(tiedot[3]);
        		setKirjanID(Integer.parseInt(tiedot[4]));
        	
        	} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
        }
	
	
	}
	
	public void setKirjailijanID(int kirjailijanID) {
		this.kirjailijanID = kirjailijanID;
	}
	
	public void setTeoksenNimi(String teoksenNimi) {
		this.teoksenNimi = teoksenNimi;
	}
	
	public void setJulkaisuvuosi(int julkaisuvuosi) {
		this.julkaisuvuosi = julkaisuvuosi;
	}
	
	//todo tee p‰iv‰m‰‰r‰tarkistus
	public void setLuettuPvm(String luettuPvm) {
		this.luettuPvm = luettuPvm;
	}
	
	public void setKirjanID(int kirjanID) {
		this.kirjanID = kirjanID;
	}
	
	
	
	
	public int getKirjailijanID() {
		return this.kirjailijanID;
	}
	
	public String getTeoksenNimi() {
		return this.teoksenNimi;
	}
	
	public int getJulkaisuvuosi() {
		return this.julkaisuvuosi;
	}
	
	public String getLuettuPvm() {
		return this.luettuPvm;
	}
	
	public int getKirjanID() {
		return this.kirjanID;
	}
	
}

