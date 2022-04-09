package com.example.mediaplayer;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class MediaPlayerApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXMLDocument.fxml")));

        Scene scene = new Scene(root);
//        scene.getStyleSheets().addPath("style.css");
        stage.setTitle("Cruncyunroll");
        stage.getIcons().add(new Image("C:\\Users\\kosne\\Desktop\\MediaPlayer\\src\\main\\java\\com\\example\\mediaplayer\\icons\\icon.png"));
        stage.setFullScreenExitHint("Press ESC or Double click to exit the full Screen");
        scene.setOnMouseClicked(new EventHandler <MouseEvent>(){
            @Override
            public void handle(MouseEvent clicked) {
                if(clicked.getClickCount() == 2){
                    if(!stage.isFullScreen()){
                        stage.setFullScreen(true);
                    }else{
                        stage.setFullScreen(false);
                    }
                }
            }
        });

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}