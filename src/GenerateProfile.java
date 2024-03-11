import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.soap.Text;

class GenerateProfile extends HBox {
    public GenerateProfile() {
        Button generateProfileButton = new Button("Generate Profile");
        generateProfileButton.setOnAction(this::generateProfileWindow);

        HBox subBox = new HBox(generateProfileButton);
        subBox.setPadding(new Insets(15, 15, 15, 15));
        subBox.setSpacing(10);

        getChildren().addAll(subBox);
    }

    private void generateProfileWindow(ActionEvent event) {
        Stage profileStage = new Stage();
        profileStage.setTitle("Generated Profile");

        VBox profileLayout = new VBox(10);
        profileLayout.setPadding(new Insets(20));

        // Add components to profileLayout
        profileLayout.getChildren().addAll(
                new Label("Profile Picture:"),
                Picture.imageView,
                new Label("Education: " + Education.education.getText()),
                new Label("Work Experience: " + WorkExperience.workExperience.getText()),
                new Label("Birthday: " + Birthday.message.getText()),
                new Label("Zodiac Sign:"),
                new ImageView(Birthday.image2),
                new Label("Biography: " + Bio.content.getText()),
                new Label("Scene Mode")
        );

        Scene profileScene = new Scene(profileLayout, 400, 600);
        profileStage.setScene(profileScene);
        profileStage.show();
    }
}
