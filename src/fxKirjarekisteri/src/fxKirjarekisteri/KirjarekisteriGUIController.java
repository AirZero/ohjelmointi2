package fxKirjarekisteri;

import fi.jyu.mit.fxgui.Dialogs;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class KirjarekisteriGUIController {
	


	/**
	 * K‰sitell‰‰n uuden kirjan lis‰‰minen
	 */
	@FXML private void handleUusiKirja() {
	Dialogs.showMessageDialog("Ei osata viel‰ lis‰t‰");
}
	/**
	 * Kutsuu uuden teoksen lis‰‰misikkunan
	 */
	@FXML private void handleUusiTeos() {
		Dialogs.showMessageDialog("Ei osata viel‰ lis‰t‰");
	}

	/**
	 * Avaa Tietoja-ikkunan
	 */
	@FXML private void handleTietoja() {
		//todo avaa Tietoja -ikkunnan
		Dialogs.showMessageDialog("Avataan Tietoja-ikkuna, ei toimi viel‰");
	}

	/**
	 * Kutsuu tallentamisaliohjelmaa
	 */
	@FXML private void handleTallenna() {
		tallenna();
}

	/**
	 * Kutsuu tallentamisaliohjelmaa ja sulkee ohjelman
	 */
	@FXML private void handleLopeta() {
		tallenna();
		Platform.exit();
	}
	
	/**
	 * Kutsuu kirjanpoistamisaliohjelmaa
	 */
	@FXML private void handlePoista() {
		poistaKirja();
	}
	
	/**
	 * Hoitaa tiedoston tallennuksen
	 */
	private void tallenna() {
		Dialogs.showMessageDialog("Tallennetetaan! Mutta ei toimi viel‰");
	}
	
	/**
	 * Hoitaa kirjan poistamisen
	 */
	private void poistaKirja() {
		Dialogs.showMessageDialog("poistetaan! Mutta ei toimi viel‰");
	}
	
	
	
	
	
	
}