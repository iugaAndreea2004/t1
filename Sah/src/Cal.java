public class Cal extends PiesaSah{

    public Cal(int coordX, int coordY, boolean isWhite){
        super("Cal", coordX, coordY, isWhite);
        setSimbol('C', 'c');
    }
    public boolean mutaPiesa (int newCoordX, int newCoordY){
        return (Math.abs(newCoordX - coordX) == 1 && Math.abs(newCoordY -coordY) ==2) || (Math.abs(newCoordX - coordX) == 2 && Math.abs(newCoordY -coordY) == 1);
    }
}
