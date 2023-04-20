package es.progcipfpbatoi;

import es.progcipfpbatoi.controladores.UsuarioController;
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/vista/list_item.fxml"));

        UsuarioController usuarioController = new UsuarioController();

        loader.setController(usuarioController);

        AnchorPane rootLayout = loader.load();

        stage.setScene(new Scene(rootLayout, 400, 500));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}