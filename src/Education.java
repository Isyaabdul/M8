import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

class Education extends HBox {
    static TextField education;

    public Education() {
        Label inputLabel = new Label("Education");
        education = new TextField();
        education.setPrefWidth(100);
        education.setAlignment(Pos.BASELINE_LEFT);

        HBox eduBox = new HBox(inputLabel, education);
        eduBox.setPadding(new Insets(15, 15, 15, 25));
        eduBox.setSpacing(10);

        getChildren().addAll(eduBox);
    }
}

