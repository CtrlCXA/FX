package sample;

public class Troupe extends Player {
    private int piquier;
    private int chevalier;
    private int onarge;

    public Troupe(int productionCoast, int productionTime, int speed, int pointsDeVie, int damage) {
        super( productionCoast, productionTime, speed, pointsDeVie, damage);
    }
}
