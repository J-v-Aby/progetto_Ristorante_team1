public class Dessert extends PortataPadre {

    private TipoMenu tipoDessert;
    private ChefStellati chef;
    private String igredienti;

    public Dessert(String nome, Double prezzo, String descrizione, TipoMenu tipoDessert, ChefStellati chef,String igredienti ) {
        super(nome, prezzo, descrizione);
        this.tipoDessert= tipoDessert;
        this.chef= chef;
        this.igredienti=igredienti;
    }

    public TipoMenu getTipoDessert() {
        return tipoDessert;
    }

    public void setTipoDessert(TipoMenu tipoDessert) {
        this.tipoDessert = tipoDessert;
    }

    public ChefStellati getChef() {
        return chef;
    }

    public void setChef(ChefStellati chef) {
        this.chef = chef;
    }

    public String getIgredienti() {
        return igredienti;
    }

    public void setIgredienti(String igredienti) {
        this.igredienti = igredienti;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Chef: "+chef+ "\n"+ " ingrefienti : "+"\n" + igredienti);
    }
}



