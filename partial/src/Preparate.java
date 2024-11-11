
public class Preparate {
     protected String name;
     protected int pret;
     protected int count;


     Preparate(String name, int pret) {
         this.name = name;
         this.pret = pret;
         this.count++;
     }

     public void setPret(int pret) {
         this.pret = pret;
     }

    public int getPret() {
        return pret;
    }

    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }

    public String toString() {
         return "Preparate{" + "name=" + name + ", pret=" + pret + ", count=" + count + '}';
    }



}
