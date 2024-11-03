import java.util.Random;

public class Matrice {
    private Complex[][] matrix;

    public Matrice(int rows, int columns) {
        this.matrix = new Complex[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = new Complex(new Random().nextInt(10), new Random().nextInt(10));
            }
        }

    }

    public void afisareMatrice() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public Complex getElement(int row, int column) {
        return this.matrix[row][column];
    }

    public void adunare(Matrice matrice) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j].adunare(matrice.getElement(i, j));
            }
        }
        System.out.println("adunare");
        this.afisareMatrice();
    }

    public void scadere(Matrice matrice) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j].scadere(matrice.getElement(i, j));
            }
        }
        System.out.println("scadere");
        this.afisareMatrice();
    }

    public void inmultireScalar(int scalar) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                this.matrix[i][j].inmultireCuScalar(scalar);
            }
        }
        System.out.println();
        this.afisareMatrice();
    }

    public void inmultire(Matrice matrice) {
        if (this.matrix[0].length != matrice.matrix.length) {
            System.out.println("Matrix multiplication not possible: incompatible dimensions.");
            return;
        }

        Matrice rez = new Matrice(this.matrix.length, matrice.matrix[0].length);
        for (int i = 0; i < rez.matrix.length; i++) {
            for (int j = 0; j < rez.matrix[i].length; j++) {
                rez.matrix[i][j] = new Complex(0, 0);
            }
        }

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrice.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    Complex temp = new Complex(this.matrix[i][k].getReal(), this.matrix[i][k].getImag());
                    temp.inmultire(matrice.getElement(k, j));

                    rez.matrix[i][j].adunare(temp);
                }
            }
        }

        System.out.println("inmultire");
        rez.afisareMatrice();
    }
}
// tema
// finalizare inmultire
// si cea cu sah
