import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

class WorkExperience extends HBox {
    static TextField workExperience;

    public WorkExperience() {
        Label inputLabel = new Label("Work Experience");
        workExperience = new TextField();
        workExperience.setPrefWidth(200);
        workExperience.setAlignment(Pos.BASELINE_LEFT);

        HBox workExBox = new HBox(inputLabel, workExperience);
        workExBox.setPadding(new Insets(15, 15, 15, 25));
        workExBox.setSpacing(10);

        getChildren().addAll(workExBox);
    }
}
