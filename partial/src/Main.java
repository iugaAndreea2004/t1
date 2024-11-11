import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nrPreparate = 0;
        Preparate[] preparate = new Preparate[nrPreparate];
        Comanda[] comanda = new Comanda[nrPreparate];

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti nr de preparate");
        nrPreparate  = scan.nextInt();
        System.out.println("Numarul de preparate pe care il are restauranul este " + nrPreparate);


        Preparate p1 = new Pizza("Pizza1", 20);
        Preparate p2 = new Pizza("Pizza2", 30);

        Preparate p3 = new Bauturi("Suc1", 5);
        Preparate p4 = new Bauturi("Suc2", 5);

        Preparate p5 = new Desert("Desert1", 10);
        Preparate p6 = new Desert("Desert2", 20);

        Comanda c1 = new Comanda("In asteptare",preparate,2,100);
        Comanda c2 = new Comanda("In livrare ",preparate,3,100);

        Client cl1 = new Client("Ana", 2);
        Client cl2 = new Client("Ana", 1);

        //c1.add(p1);
        //c2.add(p2);
        //cl1.add(p3);

        System.out.println();
        



        }



    }
}