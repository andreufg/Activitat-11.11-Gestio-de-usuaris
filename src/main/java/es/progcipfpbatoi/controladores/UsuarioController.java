package es.progcipfpbatoi.controladores;

import es.progcipfpbatoi.modelo.entidades.Usuario;
import es.progcipfpbatoi.modelo.repositorios.UsuariosRepository;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UsuarioController implements Initializable {
    @FXML
    private ListView<Usuario> listaUsuarios;
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
    private TextField password;
    @FXML
    private TextField repetirPassword;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
