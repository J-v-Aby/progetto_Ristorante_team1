import enumPackage.TipologiaEnum;

import java.util.ArrayList;

public class Menu {

    //TODO se volete potete inserire altri field
    private String nome;
    private ArrayList<Portata> portate;

    private TipologiaEnum tipoMenu;


    public Menu(String nome, TipologiaEnum tipoMenu) {
        this.nome = nome;
        this.tipoMenu= tipoMenu;
        this.portate = new ArrayList<>();

    }

    public void addPortata(Portata antipasti) {
        portate.add(antipasti);
    }

    public void removePortata(Portata antipasti) {
        portate.remove(antipasti);
    }

    public void print() {
        for (Portata portata : portate) {
            portata.print();
        }
    }






}
