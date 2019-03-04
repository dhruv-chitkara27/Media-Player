package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;

public class VideoBar extends HBox {

    Slider timeslider = new Slider();
    Slider volSlider = new Slider();

    Button button = new Button("||");
    Label volume = new Label("Volume");

    MediaPlayer player;

    public VideoBar(MediaPlayer play) {
        player = play;

        //css styling thing

        setAlignment(Pos.CENTER);
        setPadding(new Insets(5, 10, 5, 10));

        volSlider.setPrefWidth(70.0);
        volSlider.setMinWidth(30.0);
        volSlider.setValue(100);

        HBox.setHgrow(timeslider, Priority.ALWAYS);

        button.prefWidth(40.0);

        getChildren().add(button);
        getChildren().add(timeslider);
        getChildren().add(volume);
        getChildren().add(volSlider);

    }

}






