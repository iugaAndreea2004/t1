public class Pion extends PiesaSah{

    public Pion(int coordX, int coordY, boolean isWhite){
        super("Pion", coordX, coordY, isWhite);
        setSimbol('P', 'p');
    }
    public boolean mutaPiesa (int newCoordX, int newCoordY){
        int directie;
        int pozitie;

        if (isWhite){
            directie = -1;
            pozitie = 6;
        } else {
            directie = 1;
            pozitie = 1;
        }

        if (newCoordX == coordX + directie && newCoordY == coordY){
            return true;
        }

        if (coordX == pozitie && newCoordX == coordX + 2 * directie && newCoordY == coordY) {
                    return true;
        }

        if (newCoordX == coordX + directie && Math.abs(newCoordY - coordY) == 1) {
                    return true;
        }

        return false;
    }
}


