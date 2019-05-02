/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class FXMLDocumentController implements Initializable {

    Stage stage;
    @FXML
    private Button boton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stage = new Stage();
    }

    private void abrirSitiosVisitar(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("SitiosVisitar.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void abrirAlojamientos(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("Alojamientos.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void abrirTransportes(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("Transportes.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void abrirRestaurantes(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("Restaurantes.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void abrirCrearPaquetes(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("CrearPaquete.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    private void abrirElegirPaquete(ActionEvent event) throws IOException {
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("ElegirPaquete.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
