import javax.swing.plaf.basic.BasicViewportUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private String nome;
    private TipoMenu tipoMenu;
    private ArrayList<Antipasti> antipastiList;
    private ArrayList<PrimiPiatti> primiPiattiList;
    private ArrayList<SecondiPiatti> secondiPiattiList;
    private ArrayList<Dessert> dessertList;
    private ArrayList<Bevande> bevandeList;

    public Menu(String nome, TipoMenu tipoMenu) {
        this.nome = nome;
        this.tipoMenu = tipoMenu;
        this.antipastiList = new ArrayList<>();
        this.primiPiattiList = new ArrayList<>();
        this.secondiPiattiList = new ArrayList<>();
        this.dessertList = new ArrayList<>();
        this.bevandeList = new ArrayList<>();

    }

    public void addAntipasti(Antipasti antipasti) {
        antipastiList.add(antipasti);
    }

    public void removeAntipasti(Antipasti antipasti) {
        antipastiList.remove(antipasti);
    }

    public void printAnti() {
        for (Antipasti antipasti : antipastiList) {
            antipasti.print();
        }
    }

    public void addPrimiPiatti(PrimiPiatti primiPiatti) {
        primiPiattiList.add(primiPiatti);
    }
    public void removeAntipasti(PrimiPiatti primiPiatti) {
        primiPiattiList.remove(primiPiatti);
    }
    public void printPrimi() {
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            primiPiatti.print();
        }
    }

    public void addSecondiPiatti(SecondiPiatti secondiPiatti) {
        secondiPiattiList.add(secondiPiatti);
    }
    public void removeSecondiPiatti(SecondiPiatti secondiPiatti) {
        secondiPiattiList.remove(secondiPiatti);
    }
    public void printSecondi() {
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            secondiPiatti.print();
        }
    }

    public void addDessert(Dessert dessert) {
        dessertList.add(dessert);
    }
    public void removeDessert(Dessert dessert) {
        dessertList.remove(dessert);
    }
    public void printDessert() {
        for (Dessert dessert : dessertList) {
            dessert.print();
        }
    }

    public void addBevande (Bevande bevande) {
        bevandeList.add(bevande);
    }
    public void removeBevande (Bevande bevande) {
        bevandeList.remove(bevande);
    }
    public void printBevande () {
        for(Bevande bevande : bevandeList) {
            bevande.print();
        }
    }





}
