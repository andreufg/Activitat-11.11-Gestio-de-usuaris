package es.progcipfpbatoi.controladores;

import es.progcipfpbatoi.modelo.entidades.Usuario;
import es.progcipfpbatoi.modelo.repositorios.UsuariosRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UsuarioController implements Initializable {
    private ListView<Usuario> lista ;
    @FXML
    private TextField nombre;

    @FXML
    private TextField apellidos;

    @FXML
    private TextField email;

    @FXML
    private TextField telefono;

    @FXML
    private DatePicker birthday;

    @FXML
    private TextField codigoPostal;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField repetirPassword;

    @FXML
    private void anyadirLista(){
        Usuario usuario = new Usuario(nombre.getText(),apellidos.getText(),email.getText(),telefono.getText(),birthday,codigoPostal.getText(),password.getText(),repetirPassword.getText());
        usuariosRepository.save(usuario);
        if (usuariosRepository.save(usuario)){
            nombre.setText("");
            apellidos.setText("");
            email.setText("");
            telefono.setText("");
            codigoPostal.setText("");
            password.setText("");
            repetirPassword.setText("");
        }
    }

    UsuariosRepository usuariosRepository;

    public UsuarioController(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @FXML
    private void handleSelectedItem(ActionEvent event) {
        /*
        tarea.cambiarEstado();
        if (tareaRepository.save(tarea)) {
            tareaListView.getSelectionModel().clearSelection();
            tareaListView.refresh();
        }*/
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FormularioController formularioController = new FormularioController(this, "/vista/list_item.fxml");
            ChangeScene.change(stage, formularioController, "/vista/formulario.fxml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
