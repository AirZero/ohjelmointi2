package fxKirjarekisteri;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;


/**
 * @author Eetu Rantakangas ja Timo Pakarinen
 * @version 18.10.2018
 *
 * Kirjarekisteri luettujen kirjojen seuraamiseksi
 */
public class KirjarekisteriMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		 try {
		        FXMLLoader ldr = new FXMLLoader(getClass().getResource("KirjarekisteriGUIView.fxml"));
		        final Pane root = (Pane)ldr.load();
		        final KirjarekisteriGUIController kirjaCtrl = (KirjarekisteriGUIController)ldr.getController(); // kirjaCtrl ei välttämättä toimi tällä nimellä
		        
		        final Scene scene = new Scene(root);
		        scene.getStylesheets().add(getClass().getResource("kirjarekisteri.css").toExternalForm());
		        primaryStage.setScene(scene);
		        primaryStage.setTitle("Kirjarekisteri");
		        
		        // Platform.setImplicitExit(false); // jos tämän laittaa, pitää itse sulkea
		        
		        primaryStage.setOnCloseRequest((event) -> {
		            // Kutsutaan voikoSulkea-metodia
		            if ( !kirjaCtrl.voikoSulkea() ) event.consume(); // kirjaCtrl ei välttämättä toimi tällä nimellä
		        });
		        
		        primaryStage.show();
		    } catch(Exception e) {
		        e.printStackTrace();
		    }
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
