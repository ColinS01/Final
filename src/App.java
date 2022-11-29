import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{
    String font = "Verdana";
    Scene scene;
    boolean adding = false;
    Stage stage;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        scene = write_note();

        stage.setTitle("");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();
  

    }
    
    public Scene write_note(){
        Group root = new Group();
        Scene scene = new Scene(root, 900, 1000);

        Label header = new Label("My Notes...");
        Label title_label = new Label("Name of note: ");
        TextField title = new TextField();
        Label content_label = new Label("Description: ");
        TextArea content = new TextArea();
        Button add = new Button("ADD");
        Label name = new Label("Name");
        Label description = new Label("Description");
        Line line = new Line();
        root.getChildren().addAll(line, name, description, header, title_label, title, content_label, content, add);

        header.setFont(Font.font("Verdana", 24));
        header.setLayoutX(20);
        header.setLayoutY(20);

        title_label.setLayoutX(100);
        title_label.setLayoutY(100);

        title.setLayoutX(200);
        title.setLayoutY(100);

        content_label.setLayoutX(100);
        content_label.setLayoutY(150);

        content.setLayoutX(175);
        content.setLayoutY(150);

        name.setLayoutX(200);
        name.setLayoutY(420);

        description.setLayoutX(300);
        description.setLayoutY(420);

        line.setStartX(200);
        line.setEndX(400);
        line.setStartY(440);
        line.setEndY(440);

        add.setLayoutX(200);
        add.setLayoutY(350);

        add.setOnAction(new EventHandler<ActionEvent>() {

            int y = 400;
            @Override
            public void handle(ActionEvent e){

                y = y + 50;
                System.out.println(y);


                Label label = new Label(title.getText());
                Label description = new Label(content.getText());

                root.getChildren().addAll(label, description);
                label.setLayoutY(y);
                label.setLayoutX(200);
                description.setLayoutX(300);
                description.setLayoutY(y);

            }
            
        });
        
        return scene;
    }

    


}

