public class Carte {

    private String titlu;
    private String autor;
    private int nrPagini;
    private boolean disponibile;
    private boolean stareRea;

    Carte(String titlu, String autor, int nrPagini) {

        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.disponibile = true;
        this.stareRea = false;
    }

    public String getTitlu() {
        return titlu;
    }
    public String getAutor() {
        return autor;
    }
    public int getNrPagini() {
        return nrPagini;
    }
    public boolean isDisponibile() {
        return disponibile;
    }
    public boolean isStare() {
        return stareRea;
    }


    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }
    public void setStare(boolean stare) {
        this.stareRea = stare;

    }


    public void stareStricata() {
        this.stareRea = true;
        this.disponibile = false;
    }

    public boolean esteDisponibila() {
        return disponibile && !stareRea;
    }

    public void imprumutare() {
        if (esteDisponibila()) {
            disponibile = false;
        } else {
            System.out.println("cartea nu poate fi imprumutata");
        }
    }

    public void returnata() {
        disponibile = true;
    }


    public String toString() {
        String disponibilitate;
        String stare;

        if (disponibile) {
            disponibilitate = "disponibil";
        } else {
            disponibilitate = "imprumutata";
        }


        if (stareRea) {
            stare = "in stare rea";
        } else {
            stare = "in stare buna";
        }

        return "cartea: " + titlu + " de " + autor + "cu " + nrPagini + " pagini si este " + disponibilitate + stare;
    }
}
