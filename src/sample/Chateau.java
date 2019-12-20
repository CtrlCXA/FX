package sample;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Chateau extends Parent {
    private int niveau = 1;
    private int quantiteTroup;
    private Duc duc;
    private int Tresor;
    private Troupe troupe;

    Rectangle[] rectangles;
    Circle circle;
    Rectangle gate;
    public Chateau(int niveau, int quantiteTroup, Duc duc, int tresor, Troupe troupe) {
        this.niveau = niveau;
        this.quantiteTroup = quantiteTroup;
        this.duc = duc;
        Tresor = tresor;
        this.troupe = troupe;
        rectangles = new Rectangle[] {
                new Rectangle(5,5,50,50),
                new Rectangle(200,120,50,50),
                new Rectangle(550,75,50,50),
                new Rectangle(25,250,50,50),
                new Rectangle(320,450,50,50),
                new Rectangle(640,615,50,50),
                new Rectangle(15,575,50,50),
                new Rectangle(600,325,50,50)
        };
        for (Rectangle rectangle : rectangles){
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.BLACK);
            rectangle.setArcWidth(5);
            rectangle.setArcHeight(5);
            this.getChildren().add(rectangle);
        }
        for (int i = 0 ; i < rectangles.length ; i++){
            gate = new Rectangle(rectangles[i].getX()+20,rectangles[i].getY()+30, 10,20);
            gate.setStroke(Color.BLACK);
            gate.setArcHeight(3);
            gate.setArcWidth(3);
            this.getChildren().add(gate);
            circle = new Circle();
            circle.setCenterX(gate.getX()+3);
            circle.setCenterY(gate.getY()+10);
            circle.setRadius(1);
            circle.setFill(Color.WHITE);
            this.getChildren().add(circle);
            proccessInputSouris();
        }
    }
    public void proccessInputSouris(){
        for(Rectangle rectangle:rectangles){
            rectangle.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    rectangle.setFill(Color.RED);
                }
            });
            rectangle.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    rectangle.setFill(Color.LIGHTGRAY);
                }
            });
        }
    }
}
