import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private String nome;
    private String tipo;

    private ArrayList<Antipasti> antipastiList;

    public Menu(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.antipastiList= new ArrayList<>();
    }

    public void addAntipasti(Antipasti antipasti){
        antipastiList.add(antipasti);
    }

    public void removeAntipasti(Antipasti antipasti){
        antipastiList.remove(antipasti);
    }

    public void printAntipasti(){
        for (Antipasti antipasti : antipastiList) {
            antipasti.printAntipasti();
        }

    }

}
