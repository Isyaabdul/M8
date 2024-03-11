import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application {

    public String personName;

    @Override
    public void start(Stage primaryStage) {

        Label heading = new Label("Profile Generation");
        heading.setStyle("-fx-font-size: 25; -fx-font-weight: bold;");

        Name name1 = new Name();
        name1.setAlignment(Pos.CENTER);

        Picture picture1 = new Picture();
        picture1.setAlignment(Pos.CENTER);

        Education edu1 = new Education();
        edu1.setAlignment(Pos.CENTER);

        WorkExperience workExp = new WorkExperience();
        workExp.setAlignment(Pos.CENTER);

        Birthday birthday1 = new Birthday();
        birthday1.setAlignment(Pos.CENTER);

        GenerateProfile gen1 = new GenerateProfile();
        gen1.setAlignment(Pos.CENTER);

        ColorPick accent = new ColorPick();
        accent.setAlignment(Pos.CENTER);

        Bio bio1 = new Bio();
        bio1.setAlignment(Pos.CENTER);

        VBox root = new VBox(heading, name1, edu1, workExp, picture1, birthday1, accent, bio1, gen1);
        root.setPadding(new Insets(16));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: blue");

        Scene scene = new Scene(root, 500, 600);

        primaryStage.setTitle("Profile Generating for: ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}










