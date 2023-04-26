package es.progcipfpbatoi;

import es.progcipfpbatoi.controladores.ChangeScene;
import es.progcipfpbatoi.controladores.UsuarioController;
import es.progcipfpbatoi.modelo.repositorios.InmemoryRepository;
import es.progcipfpbatoi.modelo.repositorios.UsuariosRepository;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Creamos la capa de acceso de a datos
        InmemoryRepository usuariosRepository = new InmemoryRepository();
        UsuarioController usuarioController = new UsuarioController(usuariosRepository);
        ChangeScene.change(stage, usuarioController, "/vista/list_item.fxml");

       /* Tarea tarea = new Tarea(6, "Sacar la basura", Categoria.HOGAR);
        TareaDetailController tareaDetailController = new TareaDetailController(tarea, inMemoryTareaRepository);
        ChangeScene.change(stage, tareaDetailController, "/vistas/tarea_detail.fxml");*/
    }

    public static void main(String[] args) {
        launch();
    }

}