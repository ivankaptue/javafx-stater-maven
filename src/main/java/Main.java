import controllers.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Controller controller = new Controller();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/rootView.fxml"));
        loader.setController(controller);
        Parent root = loader.load();

        Scene scene = new Scene(root);



        primaryStage.setTitle("Project title");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
