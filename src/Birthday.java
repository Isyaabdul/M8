import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Birthday extends HBox {
    static Text message;
    DatePicker datePicker;
    static Image image2;
    static Text ageLabel;
    static Text bdayLabel;

    public Birthday() {
        Label bdayLabel = new Label("Select your birthday");

        message = new Text();

        datePicker = new DatePicker();
        datePicker.setOnAction(this::processDataChoice);

        HBox bdayBox = new HBox(bdayLabel, datePicker);
        bdayBox.setPadding(new Insets(15, 15, 15, 25));
        bdayBox.setSpacing(10);

        getChildren().addAll(bdayBox);
    }

    private void processDataChoice(ActionEvent event) {
        LocalDate birthDate = datePicker.getValue();
        LocalDate current = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate, current);
        int month = birthDate.getMonthValue();
        int day = birthDate.getDayOfMonth();

        message.setText(age + " years old");

        if (month == 1) {
            image2 = new Image("src/Aries.png");
        } else if (month == 2) {
            image2 = new Image("src/Taurus.png");
        } else if (month == 3) {
            image2 = new Image("src/Gemini.png");
        } else if (month == 4) {
            image2 = new Image("src/Aquarius.png");
        } else if (month == 5) {
            image2 = new Image("src/Cancer.png");
        } else if (month == 6) {
            image2 = new Image("src/Capricorn.png");
        } else if (month == 7) {
            image2 = new Image("src/Gemini.png");
        } else if (month == 8) {
            image2 = new Image("src/Leo.png");
        } else if (month == 9) {
            image2 = new Image("src/Libra.png");
        } else if (month == 10) {
            image2 = new Image("src/Pisces.png");
        } else if (month == 11) {
            image2 = new Image("src/Sagittarius.png");
        } else if (month == 12) {
            image2 = new Image("src/Virgo.png");
        }
    }
}