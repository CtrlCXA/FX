package sample;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public abstract class Player extends Parent {

    private int productionCoast;
    private int productionTime;
    private int speed;
    private int pointsDeVie;
    private int damage;
    protected double x;
    protected double y;

    protected double dx;
    protected double dy;

    public Player(int productionCoast, int productionTime, int speed, int pointsDeVie, int damage) {

        this.productionCoast = productionCoast;
        this.productionTime = productionTime;
        this.speed = speed;
        this.pointsDeVie = pointsDeVie;
        this.damage = damage;
    }

    public int getProductionCoast() {
        return productionCoast;
    }

    public void setProductionCoast(int productionCoast) {
        this.productionCoast = productionCoast;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void move(){
        x += dx;
        y += dy;
    }
}
