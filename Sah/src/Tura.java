public class Tura extends PiesaSah {

    public Tura(int coordX, int coordY, boolean isWhite) {
        super("Tura", coordX, coordY, isWhite);
        setSimbol('T', 't');
    }

    public boolean mutaPiesa (int newCoordX, int newCoordY){
        return newCoordX == coordX || newCoordY == coordY;
    }
}
