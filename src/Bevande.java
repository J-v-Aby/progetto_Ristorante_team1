public class Bevande extends Portata {


    //TODO inseriamo il grado alcolico, e poi facciamo un metodo che se è 0 ci stampa qualcosa
    private boolean isAlcolic;


    public Bevande(String nome, Double prezzo, String descrizione,boolean isAlcolic) {
        super(nome, prezzo, descrizione);
        this.isAlcolic = isAlcolic;
    }

    public boolean isAlcolic() {
        return isAlcolic;
    }

    public void setAlcolic(boolean alcolic) {
        isAlcolic = alcolic;
    }

    @Override
    public void print() {
        super.print();
        if(isAlcolic){
            System.out.println("Bevanda alcolica");
        }
    }
}
