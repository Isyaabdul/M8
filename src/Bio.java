// Bio
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Bio extends HBox {
    static Text content;

    public Bio() {
        Label biolabel = new Label("Upload bio");

        Button uploadBio = new Button("Upload bio");
        uploadBio.setAlignment(Pos.BASELINE_LEFT);
        uploadBio.setOnAction(this::processUploadBio);

        content = new Text("No bio selected");

        HBox bioBox = new HBox(biolabel, uploadBio, content);
        bioBox.setPadding(new Insets(15, 15, 15, 25));
        bioBox.setSpacing(10);

        getChildren().addAll(bioBox);
    }

    private void processUploadBio(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File bioFile = fileChooser.showOpenDialog(null);
        if (bioFile != null) {
            try {
                Scanner scanner = new Scanner(bioFile);
                StringBuilder bioContent = new StringBuilder();
                while (scanner.hasNextLine()) {
                    bioContent.append(scanner.nextLine()).append("\n");
                }
                content.setText(bioContent.toString());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
