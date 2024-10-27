import java.math.BigDecimal;
import java.util.Random;

public class Loterie {

    private static BigDecimal CalculateFact(int n, int k) {
        BigDecimal nFactorial = CalculateFact(n);
        BigDecimal kFactorial = CalculateFact(k);
        BigDecimal nkFactorial = CalculateFact(n-k);

        return nFactorial.divide(kFactorial.multiply(nkFactorial)); // sansele
    }


    private static BigDecimal CalculateFact(int n) {
        BigDecimal res = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigDecimal.valueOf(i));
        }
        return res;
    }

    private static void extragereLoterie ( int nrTotalBile, int intervalBile) {
        Random random = new Random();
        for (int i = 0; i < nrTotalBile; i++) {
           int numar = random.nextInt(intervalBile) + 1;
           System.out.println(numar);
        }
    }

    private static long extragereLoterieLong ( int nrTotalBile, int intervalBile) {
        Random random = new Random();
        long numereExtrase = 0;
        for (int i = 0; i < nrTotalBile; i++) {
            int numar = random.nextInt(intervalBile) + 1;
            long masca =  1L << numar;
                numereExtrase |= masca;

        }
        return numereExtrase;
    }

    private static void inOrdine(long numereExtrase) {
        for (int i = 1; i <= 49; i++) {
            long masca = 1L << i;
            if ((numereExtrase & masca) != 0) {
                System.out.print( i + " ");
            }

        }
    }
    public static void main(String[] args) {

        BigDecimal sanse = CalculateFact(49, 6);
        System.out.println("sansele de câștig: " + sanse);

        System.out.println("numerele extrase: ");
        extragereLoterie(6, 49);

       long numere = extragereLoterieLong(6, 49);
       inOrdine(numere);

    }
}
