public class Main {
    public static void main(String[] args) {

        Complex complex = new Complex(1, 6);
        Complex complex2 = new Complex(3, 4);
        System.out.println(complex.toString());

        System.out.println(complex2);
        complex.adunare(complex2);
        System.out.println(complex);

        complex.scadere(complex2);
        System.out.println(complex);

        complex.inmultireCuScalar(3);
        System.out.println(complex);

        Complex[] array = new Complex[2];
        array[0] = complex;
        array[1] = complex2;
        for ( Complex v : array) {
            System.out.println(v);
        }

        Matrice matrice = new Matrice(3,3);
        Matrice matrice2 = new Matrice(3,3);
        matrice.afisareMatrice();

        matrice.adunare(matrice);
        //matrice.scadere(matrice);
        matrice.inmultireScalar(3);
        matrice.inmultire(matrice);

    }
}