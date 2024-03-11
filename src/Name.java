import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.stage.FileChooser;
import jdk.jfr.internal.tool.Main;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



class Name extends HBox {
    static TextField name;

    public Name() {
        Label inputlabel = new Label("What is your name?");
        name = new TextField();
        name.setPrefWidth(200);
        name.setAlignment(Pos.BASELINE_LEFT);

        HBox nameBox = new HBox(inputlabel, name);
        nameBox.setPadding(new Insets(15, 15, 15, 25));
        nameBox.setSpacing(10);

        getChildren().addAll(nameBox);
    }
}
