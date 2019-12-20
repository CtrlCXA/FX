package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
     Piquier piquier;
    private Pane playerFilder;
    private Scene scene;
    Chateau chateau;
    Group root;
    AnimationTimer gameLoop;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = new Group();
        chateau = new Chateau(1,5,new Duc(),1,new Troupe(1,1,1,1,1));
        root.getChildren().add(chateau);
        primaryStage.setTitle("Dukes of the Realm");
        playerFilder = new Pane();
        scene = new Scene(root, 700, 675);
        root.getChildren().addAll(playerFilder);

        primaryStage.setScene(scene);
        primaryStage.show();


        loadGame();
        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long l) {
                piquier.processusInput(scene);
            }
        };
        gameLoop.start();


    }
    private void loadGame(){
        creatPlayer();
        /*scene.setOnMousePressed(e->{
            piquier.setX((int) (e.getX() - 23));
            piquier.setY((int) (e.getY() - 23));
        });*/

    }
    private void creatPlayer(){
        piquier = new Piquier(playerFilder,1,1,1,1,1,50,50);
        //root.getChildren().addAll(piquier);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
