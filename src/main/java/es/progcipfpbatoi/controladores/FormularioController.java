package es.progcipfpbatoi.controladores;

import es.progcipfpbatoi.modelo.entidades.Usuario;
import es.progcipfpbatoi.modelo.repositorios.InmemoryRepository;
import es.progcipfpbatoi.modelo.repositorios.UsuariosRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FormularioController implements Initializable {

    @FXML
    private ListView<Usuario> usuarioListView;
    private Initializable controladorPadre;
    @FXML
    private TextField buscar;
    private String vistaPadre;
    private UsuariosRepository usuariosRepository;

    @FXML
    private void searchTasks() {
        usuarioListView.getItems().clear();
        String texto = buscar.getText();
        ArrayList<Usuario> tareas = usuariosRepository.findAll(texto);
        usuarioListView.getItems().addAll(tareas);
    }
    public FormularioController(Initializable controladorPadre, String vistaPadre, UsuariosRepository usuariosRepository) {
        this.controladorPadre = controladorPadre;
        this.vistaPadre = vistaPadre;
        this.usuariosRepository = usuariosRepository;
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
   /* public void save(Usuario usuario){
        usuarioListView.getItems().add(usuario);
    }*/

    private ObservableList<Usuario> getData() {
        return FXCollections.observableArrayList(usuariosRepository.findAll());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usuarioListView.setItems(getData());
    }

}
