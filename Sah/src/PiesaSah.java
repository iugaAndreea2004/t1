 abstract class PiesaSah {

     protected String nume;
     protected int coordX;
     protected int coordY;
     protected char simbol;
     protected boolean isWhite;


     public PiesaSah(String nume, int coordX, int coordY, boolean isWhite) {
         this.nume = nume;
         this.coordX = coordX;
         this.coordY = coordY;
         this.isWhite = isWhite;
     }
     abstract boolean mutaPiesa (int coordX, int coordY);

     protected void setSimbol (char simbolW, char simbolB) {
         if (isWhite) {
             this.simbol = simbolW;
         } else {
             this.simbol = simbolB;
         }
     }

     public String getNume () {
         return nume;
     }
     public int getCoordX () {
         return coordX;
     }
     public int getCoordY () {
         return coordY;
     }
     public char getSimbol () {
         return simbol;
     }
     public boolean isWhite () {
         return isWhite;
     }

     public void update(int newCoordX, int newCoordY) {
         this.coordX = newCoordX;
         this.coordY = newCoordY;
     }
 }