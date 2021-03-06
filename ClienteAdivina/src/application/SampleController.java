package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SampleController
{

    @FXML
    private Button btnJugar;

    @FXML
    private Button btnConfiguracion;

    @FXML
    private Button btnSalir;
    
    @FXML
    private ImageView viewIMGM;

    @FXML
    void btnConfiguracionOnAction(ActionEvent event) {
    	
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("InterfazConfiguracion.fxml"));
			Scene scene = new Scene(parent,600,400);
			Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El FXML esta vacio "+e);
		}

    } 

    @FXML
    void btnExitOnAction(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void btnJugarOnAction(ActionEvent event) {
    	
    	try {
			Parent pane =  FXMLLoader.load(getClass().getResource("xd.fxml"));
			
			Scene sceneGame = new Scene(pane, 600,600);
			sceneGame.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
			stage.setScene(sceneGame);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
	
	

}
