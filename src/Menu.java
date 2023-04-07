import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private String nome;
    private TipoMenu tipoMenu;
    private ArrayList<Antipasti> antipastiList;
    private ArrayList<SecondiPiatti> secondiPiattiList;



    public Menu(String nome, TipoMenu tipoMenu) {
        this.nome = nome;
        this.tipoMenu = tipoMenu;
        this.antipastiList = new ArrayList<>();
        this.secondiPiattiList = new ArrayList<>();
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





    public void addSecondiPiatti(SecondiPiatti secondiPiatti) {
        secondiPiattiList.add(secondiPiatti);
    }
    public void removeAntipasti(SecondiPiatti secondiPiatti) {
        secondiPiattiList.remove(secondiPiatti);
    }
    public void printSecondi() {
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            secondiPiatti.print();
        }
    }




}
