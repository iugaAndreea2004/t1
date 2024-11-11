public class Client extends Comanda {
    protected String name;
    protected Comanda[] comanda;
    protected int nrComenzi;


    public Client(String name,int nrComenzi) {
        super();
        this.name = name;
        this.comanda = comanda;
        this.nrComenzi = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

