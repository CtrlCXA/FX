package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piquier extends Player {
    private Circle playerCircle;
    private Pane layer;
    private int x;
    private int y;
    public Piquier(Pane playerFilder, int productionCoast, int productionTime, int speed, int pointsDeVie, int damage,int x, int y) {
        super(productionCoast, productionTime, speed, pointsDeVie, damage);
        this.x = x;
        this.y = y;
        this.layer = playerFilder;
        this.playerCircle = new Circle(3);
        this.playerCircle.setFill(Color.RED);
        this.playerCircle.setCenterX(x);
        this.playerCircle.setCenterY(y);
        this.getChildren().add(playerCircle);
        playerFilder.getChildren().add(playerCircle);
    }
    public void processusInput(Scene scene){
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(mouseEvent.getX());
            }
        });



    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void addToLayer(){
        this.layer.getChildren().add(this.playerCircle);
    }

    @Override
    public void move() {
        super.move();
    }
}
