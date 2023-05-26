import enumPackage.ChefStellatiEnum;
import enumPackage.StagioniEnum;
import enumPackage.TipologiaEnum;
import enumPackage.UtilityColorEnum;
import portate.*;


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nome;
    private ArrayList<Portata> portate;
    private TipologiaEnum tipoMenu;
    private Double prezzoMedio;
    private ChefStellatiEnum chef;

    public Menu(String nome, TipologiaEnum tipoMenu, Double prezzoMedio, ChefStellatiEnum chef) {
        this.nome = nome;
        this.tipoMenu = tipoMenu;
        this.portate = new ArrayList<>();
        this.prezzoMedio = prezzoMedio;
        this.chef = chef;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Portata> getPortate() {
        return portate;
    }

    public void setPortate(ArrayList<Portata> portate) {
        this.portate = portate;
    }

    public TipologiaEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipologiaEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public Double getPrezzoMedio() {
        return prezzoMedio;
    }

    public void setPrezzoMedio(Double prezzoMedio) {
        this.prezzoMedio = prezzoMedio;
    }

    public ChefStellatiEnum getChef() {
        return chef;
    }

    public void setChef(ChefStellatiEnum chef) {
        this.chef = chef;
    }

    public void addPortata(Portata antipasti) {
        portate.add(antipasti);
    }

    public void addAllPortate(List<Portata> portatas) {
        portate.addAll(portatas);
    }

    public void removePortata(Portata antipasti) {
        portate.remove(antipasti);
    }


    /**
     * <p>Metodo che stampa il menù completo con il colore dell'intestazione delle portate, in base alla Stagione.
     * Il metodo utilizza la classe LocalDate per ottenere la data corrente e poi la confronta con le variabili rappresentanti
     * l'inizio e fine delle stagioni
     * </p>
     */
    public void printMenu() {
        LocalDate data = LocalDate.now();
        LocalDate inizioPrimavera = LocalDate.of(Year.now().getValue(), Month.MARCH, 20);
        LocalDate finePrimavera = LocalDate.of(Year.now().getValue(), Month.JUNE, 22);
        LocalDate inizioEstate = LocalDate.of(Year.now().getValue(), Month.JUNE, 21);
        LocalDate fineEstate = LocalDate.of(Year.now().getValue(), Month.SEPTEMBER, 22);
        LocalDate inizioAutunno = LocalDate.of(Year.now().getValue(), Month.SEPTEMBER, 21);
        LocalDate fineAutunno = LocalDate.of(Year.now().getValue(), Month.DECEMBER, 23);
        LocalDate inizioInverno = LocalDate.of(Year.now().getValue(), Month.DECEMBER, 21);
        LocalDate fineInverno = LocalDate.of(Year.now().getValue(), Month.DECEMBER, 23);

        StagioniEnum stagione = null;
        if (data.isAfter(inizioPrimavera) && data.isBefore(finePrimavera)) {
            stagione = StagioniEnum.PRIMAVERA;
        }
        if (data.isAfter(inizioEstate) && data.isBefore(fineEstate)) {
            stagione = StagioniEnum.ESTATE;
        }
        if (data.isAfter(inizioAutunno) && data.isBefore(fineAutunno)) {
            stagione = StagioniEnum.AUTUNNO;
        }
        if (data.isAfter(inizioInverno) && data.isBefore(fineInverno)) {
            stagione = StagioniEnum.INVERNO;
        }

        System.out.println("\n" + stagione.getColore() + "ANTIPASTI\n" + UtilityColorEnum.ANSI_RESET.getCodice());
        portate.stream().filter(antipasto -> antipasto instanceof Antipasti).forEach(antipasto -> antipasto.printPadre());
        System.out.println("\n" + stagione.getColore() + "PRIMI PIATTI\n" + UtilityColorEnum.ANSI_RESET.getCodice());
        portate.stream().filter(primo -> primo instanceof PrimiPiatti).forEach(primo -> primo.printPadre());
        System.out.println("\n" + stagione.getColore() + "SECONDI PIATTI\n" + UtilityColorEnum.ANSI_RESET.getCodice());
        portate.stream().filter(secondo -> secondo instanceof SecondiPiatti).forEach(secondo -> secondo.printPadre());
        System.out.println("\n" + stagione.getColore() + "DESSERT\n" + UtilityColorEnum.ANSI_RESET.getCodice());
        portate.stream().filter(dessert -> dessert instanceof Dessert).forEach(dessert -> dessert.printPadre());
        System.out.println("\n" + stagione.getColore() + "BEVANDE\n" + UtilityColorEnum.ANSI_RESET.getCodice());
        portate.stream().filter(bevanda -> bevanda instanceof Bevande).forEach(bevanda -> bevanda.printPadre());
    }


}



