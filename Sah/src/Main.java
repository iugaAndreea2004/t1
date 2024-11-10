import java.util.Scanner;

public class Main {

    private static final int SIZE = 8;
    private static PiesaSah[] piesa;

    private static void printare() {
        char[][] tabla = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tabla[i][j] = '.';
            }
        }

        for (PiesaSah p : piesa) {
            int x = p.getCoordX();
            int y = p.getCoordY();
            tabla[x][y] = p.getSimbol();
        }
        System.out.println("   0 1 2 3 4 5 6 7");
                for(int i = 0; i < SIZE; i++) {
                    System.out.print(i + "  ");
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(tabla[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
    }

    private static void mutarePiesa() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("coordonatele piesei de mutat (x y): ");


            int x = scanner.nextInt();
            int y = scanner.nextInt();

            PiesaSah piesaDeMutat = null;
            for (PiesaSah p : piesa) {
                if (p != null && p.getCoordX() == x && p.getCoordY() == y) {
                    piesaDeMutat = p;
                    break;
                }
            }

            if (piesaDeMutat == null) {
                System.out.println("nu exista piesa la acele coordonate");
                continue;
            }

            System.out.print("coordonatele destinației (x y): ");
            int xDest = scanner.nextInt();
            int yDest = scanner.nextInt();

            if (!piesaDeMutat.mutaPiesa(xDest, yDest)) {
                System.out.println("mutarea nu e valida");
                continue;
            }

            piesaDeMutat.update(xDest, yDest);

            printare();
        }
    }



    public static void main(String[] args) {

        piesa = new PiesaSah[32];

        piesa[0] = new Tura(0, 0, false);
        piesa[1] = new Tura(0, 7, false);
        piesa[2] = new Tura(7, 0, true);
        piesa[3] = new Tura(7, 7, true);


        piesa[4] = new Cal(0, 1, false);
        piesa[5] = new Cal(0, 6, false);
        piesa[6] = new Cal(7, 1, true);
        piesa[7] = new Cal(7, 6, true);

        piesa[8] = new Nebun(0, 2, false);
        piesa[9] = new Nebun(0, 5, false);
        piesa[10] = new Nebun(7, 2, true);
        piesa[11] = new Nebun(7, 5, true);

        piesa[12] = new Regina(0, 3, false);
        piesa[13] = new Regina(7, 3, true);

        piesa[14] = new Rege(0, 4, false);
        piesa[15] = new Rege(7, 4, true);

        for (int i = 0; i < 8; i++) {
            piesa[16 + i] = new Pion(1, i, false);
        }

        for (int i = 0; i < 8; i++) {
            piesa[24 + i] = new Pion(6, i, true);
        }
        System.out.println("tabla initiala");
        printare();

        mutarePiesa();

    }
}