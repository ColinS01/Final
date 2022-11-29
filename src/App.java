import java.util.List;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{

    int width = 900;
    int height = 900;
    String font = "Verdana";
    Scene scene;
    boolean adding = false;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        if (!adding){
            scene = main();
        }

        else {
            scene = write_note();
        }

        stage.setTitle("");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
  

    }
    
    public Scene main(){

        Group root = new Group();
        Scene scene = new Scene(root, 900, 600);

        Label title = new Label("My Notes...");
        Button add = new Button("Add note");

        root.getChildren().addAll(title, add);

        title.setFont(Font.font("Verdana", 24));
        title.setLayoutX(20);
        title.setLayoutY(20);

        add.setLayoutX(800);
        add.setLayoutY(550);

        return scene;
    }

    public Scene write_note(){

        Group root = new Group();
        Scene scene = new Scene(root, 900, 600);

        Label title_label = new Label("Name of note: ");
        TextField title = new TextField();
        Label content_label = new Label("Description: ");
        TextArea content = new TextArea();
        Button add = new Button("ADD");

        root.getChildren().addAll(title_label, title, content_label, content, add);

        title_label.setLayoutX(100);
        title_label.setLayoutY(100);

        title.setLayoutX(200);
        title.setLayoutY(100);

        content_label.setLayoutX(100);
        content_label.setLayoutY(150);

        content.setLayoutX(175);
        content.setLayoutY(150);

        add.setLayoutX(200);
        add.setLayoutY(350);

        return scene;
    }






}

