import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

import java.io.File;


// Picture class
class Picture extends HBox {
    static ImageView imageView;

    public Picture() {
        Label picturelabel = new Label("Upload picture");

        Button uploadPic = new Button("Upload Picture");
        uploadPic.setAlignment(Pos.BASELINE_LEFT);

        imageView = new ImageView();
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        EventHandler<ActionEvent> picPush = event -> {
            FileChooser picChooser = new FileChooser();

            FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG Files(*.jpg)", "*.JPG");
            FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG Files(*.png)", "*.PNG");

            picChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

            File headshot = picChooser.showOpenDialog(null);

            if (headshot != null) {
                Image image = new Image(headshot.toURI().toString());
                imageView.setImage(image);
            }
        };

        uploadPic.setOnAction(picPush);

        HBox picBox = new HBox(picturelabel, uploadPic, imageView);
        picBox.setPadding(new Insets(15, 15, 15, 25));
        picBox.setSpacing(10);

        getChildren().addAll(picBox);
    }
}
