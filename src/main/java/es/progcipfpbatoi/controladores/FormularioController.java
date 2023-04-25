package es.progcipfpbatoi.controladores;

import es.progcipfpbatoi.modelo.entidades.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FormularioController implements Initializable {


    private Initializable controladorPadre;

    private String vistaPadre;

    public FormularioController(Initializable controladorPadre, String vistaPadre) {
        this.controladorPadre = controladorPadre;
        this.vistaPadre = vistaPadre;
    }
    @FXML
    private void volverAnyadir(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            ChangeScene.change(stage, controladorPadre, vistaPadre);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
