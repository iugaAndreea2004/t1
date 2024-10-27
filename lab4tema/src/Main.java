//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carte carte1 = new Carte("Ion", "Liviu Rebreanu", 448);
        Biblioteca biblioteca = new Biblioteca(carte1);

        System.out.println(carte1);

        if (biblioteca.cautareCarteDupaTitlu("Ion")) {
            System.out.println("cartea este disponibila");
        } else {
            System.out.println("cartea nu este disponibila");
        }

        biblioteca.returnareCarte();

        biblioteca.stareCarteStricata();

        biblioteca.imprumutareCarte();

        biblioteca.eliminaCarte();

        Carte carte2 = new Carte("Enigma Otiliei", "George Calinescu", 450);
        biblioteca.adaugaCarte(carte2);

        System.out.println("numarul de carti dupa adaugare : " + biblioteca.getNrCarti());





    }
}