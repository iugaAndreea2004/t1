public class Comanda {
    protected Preparate[] preparate;
    protected int index;
    protected String status;
    protected int id;
    ;
    public Comanda(){

    }

    public Comanda(String status, Preparate[] preparate, int nrPreparate, int id) {
        this.preparate = new Preparate[nrPreparate];
        this.status = status;
        this.preparate = preparate;
        this.index = 0;
        this.id = id;
    }

    void setStatus(String status) {
        this.status = status;
    }

//    public void add(Preparate prep) {
//        Comanda[index++] = prep;
//    }

    void setId(int id) {
        this.id = id;
    }

}

