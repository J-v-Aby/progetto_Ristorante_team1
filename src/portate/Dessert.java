package portate;

import enumPackage.ChefStellatiEnum;
import enumPackage.TipoDessertEnum;

public class Dessert extends Portata {

    private TipoDessertEnum tipoDessert;
    private ChefStellatiEnum chef;
    private String ingredienti;

    public Dessert(String nome, Double prezzo, String descrizione, TipoDessertEnum tipoDessertEnum, ChefStellatiEnum chef, String ingredienti) {
        super(nome, prezzo, descrizione);
        this.tipoDessert = tipoDessertEnum;
        this.chef = chef;
        this.ingredienti = ingredienti;
    }

    public TipoDessertEnum getTipoDessert() {
        return tipoDessert;
    }

    public void setTipoDessert(TipoDessertEnum tipoDessertEnum) {
        this.tipoDessert = tipoDessertEnum;
    }

    public ChefStellatiEnum getChef() {
        return chef;
    }

    public void setChef(ChefStellatiEnum chef) {
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
        System.out.println("A base di " + tipoDessert + "\n" + "Chef: " + chef.getNomeChef() + "\n" + "Ingredienti: " + "\n" + ingredienti);
    }
}



