import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

class ColorPick extends HBox {
    public ColorPick() {
        Label accentLabel = new Label("Choose an accent Color");
        ColorPicker accentColor = new ColorPicker(Color.BLACK);

        accentColor.setOnAction(event -> {
            Color newColor = accentColor.getValue();
            accentLabel.setTextFill(newColor);
        });

        HBox colBox = new HBox(accentLabel, accentColor);
        colBox.setPadding(new Insets(15, 15, 15, 25));
        colBox.setSpacing(10);

        getChildren().addAll(colBox);
    }
}