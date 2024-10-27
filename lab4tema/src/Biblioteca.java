public class Biblioteca {

    private Carte carte;
    private int nrCarti = 100;

    public Biblioteca(Carte carte) {
        this.carte = carte;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }

    public void imprumutareCarte() {
        carte.imprumutare();
    }

    public void returnareCarte() {
        carte.returnata();
    }

    public int getNrCarti() {
        return nrCarti;
    }

    public void stareCarteStricata() {
        carte.stareStricata();
        System.out.println("cartea: " + carte.getTitlu() + " este in stare proasta");
    }

    public void adaugaCarte(Carte carteNoua) {
        this.carte = carteNoua;
        nrCarti++;
        System.out.println("cartea " + carteNoua.getTitlu() + " a fost adaugata");
    }

    public void eliminaCarte() {

            System.out.println("cartea " + carte.getTitlu() + " a fost eliminata");
            carte = null;
            nrCarti--;
            System.out.println("nr de carti este " + nrCarti);
    }

    public boolean cautareCarteDupaTitlu(String titlu) {
        return carte != null && carte.getTitlu().equalsIgnoreCase(titlu);
    }

}
