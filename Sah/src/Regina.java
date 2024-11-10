public class Regina extends PiesaSah{

    public Regina(int coordX, int coordY, boolean isWhite){
        super("Regina", coordX, coordY, isWhite);
        setSimbol('R', 'r');
    }

    public boolean mutaPiesa (int newCoordX, int newCoordY){
        boolean miscareTura =  newCoordX == coordX || newCoordY == coordY;
        boolean miscareNebun = Math.abs(newCoordX - coordX) == Math.abs(newCoordY -coordY);

        return miscareTura || miscareNebun;
    }
}
