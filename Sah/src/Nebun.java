public class Nebun extends PiesaSah {

    public Nebun( int coordX, int coordY, boolean isWhite){
        super("Nebun", coordX, coordY, isWhite);
        setSimbol('N','n');
    }

    public boolean mutaPiesa (int newCoordX, int newCoordY){
        return Math.abs(newCoordX - coordX) == Math.abs(newCoordY -coordY) ;
    }
}
