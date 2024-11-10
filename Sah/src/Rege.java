public class Rege extends PiesaSah {

    public Rege(int coordX, int coordY, boolean isWhite) {
        super("Rege", coordX, coordY, isWhite);
        setSimbol('R', 'r');
    }

    public boolean mutaPiesa (int newCoordX, int newCoordY){
        return Math.abs(newCoordX - coordX) <= 1 && Math.abs(newCoordY -coordY) <=1;
    }
}
