import enumPackage.TipologiaEnum;
import enumPackage.UtilityColorEnum;
import portate.*;

import java.util.ArrayList;

public class Menu {
    private String nome;
    private ArrayList<Portata> portate;
    private TipologiaEnum tipoMenu;

    public Menu(String nome, TipologiaEnum tipoMenu) {
        this.nome = nome;
        this.tipoMenu = tipoMenu;
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

    public void printAntiSOLID_FattoPerProva_TiPregoMicheleNonCiPicchiare() {
        boolean round1 = true;
        boolean round2 = true;
        boolean round3 = true;
        boolean round4 = true;
        boolean round5 = true;

        for (Portata p : portate) {
            if (p instanceof Antipasti && round1) {
                System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "A N T I P A S T I" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
                round1 = false;
            } else if (p instanceof PrimiPiatti && round2) {
                System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "P R I M I" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
                round2 = false;
            } else if (p instanceof SecondiPiatti && round3) {
                System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "S E C O N D I" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
                round3 = false;
            } else if (p instanceof Dessert && round4) {
                System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "D E S S E R T" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
                round4 = false;
            } else if (p instanceof Bevande && round5) {
                System.out.println("\n\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + "B E V A N D E" + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
                round5 = false;
            }
            p.print();
            System.out.println("");
        }
    }


}
