public class Dessert extends Portata {

    private TipoDessert tipoDessert;
    private ChefStellati chef;
    private String ingredienti;

    public Dessert(String nome, Double prezzo, String descrizione, TipoDessert tipoDessert, ChefStellati chef,String ingredienti ) {
        super(nome, prezzo, descrizione);
        this.tipoDessert= tipoDessert;
        this.chef= chef;
        this.ingredienti =ingredienti;
    }

    public TipoDessert getTipoDessert() {
        return tipoDessert;
    }

    public void setTipoDessert(TipoDessert tipoDessert) {
        this.tipoDessert = tipoDessert;
    }

    public ChefStellati getChef() {
        return chef;
    }

    public void setChef(ChefStellati chef) {
        this.chef = chef;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dessert a base di "+tipoDessert +"\n"+ "Chef: "+chef.nomeChef+ "\n"+ "Ingredienti: "+"\n" + ingredienti);
    }
}



