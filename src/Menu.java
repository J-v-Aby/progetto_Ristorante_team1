import java.util.List;

public class Menu {
    private Antipasti antipasti;
    private PrimiPiatti primiPiatti;
    private SecondiPiatti secondiPiatti;
    private Dessert dessert;
    private Bevande bevande;

    public Menu(Antipasti antipasti) {
        this.antipasti = antipasti;
    }

    public Menu(PrimiPiatti primiPiatti) {
        this.primiPiatti = primiPiatti;
    }

    public Menu(SecondiPiatti secondiPiatti) {
        this.secondiPiatti = secondiPiatti;
    }

    public Menu(Dessert dessert) {
        this.dessert = dessert;
    }

    public Menu(Bevande bevande) {
        this.bevande = bevande;
    }

    public Antipasti getAntipasti() {
        return antipasti;
    }

    public void setAntipasti(Antipasti antipasti) {
        this.antipasti = antipasti;
    }

    public PrimiPiatti getPrimiPiatti() {
        return primiPiatti;
    }

    public void setPrimiPiatti(PrimiPiatti primiPiatti) {
        this.primiPiatti = primiPiatti;
    }

    public SecondiPiatti getSecondiPiatti() {
        return secondiPiatti;
    }

    public void setSecondiPiatti(SecondiPiatti secondiPiatti) {
        this.secondiPiatti = secondiPiatti;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Bevande getBevande() {
        return bevande;
    }

    public void setBevande(Bevande bevande) {
        this.bevande = bevande;
    }

}
