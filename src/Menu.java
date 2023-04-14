import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    //TODO se volete potete inserire altri field
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

    public void addPrimipiatti(PrimiPiatti primiPiatti){ primiPiattiList.add(primiPiatti);}
    public void removePrimiPiatti(PrimiPiatti primiPiatti){primiPiattiList.remove(primiPiatti);}
    public void printPrimi() {
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            primiPiatti.print();
            //Creo un Array di stringe dove passo il regex nelle descrizioni
            String[] descrizione = primiPiatti.getDescrizione().split(" ");
            // creo un for each che permetta allo switch di identificare gli allergeni
            for (String s : descrizione) {
                //TODO in portata aggiungiamo una lista di allergenici
                switch (s) {
                    case "uova", "maionese" -> System.out.println("Allergene presente: " + Allergeni.UOVA.nomeAllergene);
                    case "gamberi", "granchi" -> System.out.println("Allergene presente: " + Allergeni.CROSTACEI.nomeAllergene);
                    case "sedano" -> System.out.println("Allergene presente: " + Allergeni.SEDANO.nomeAllergene);
                    case "arachidi" -> System.out.println("Allergene presente: " + Allergeni.ARACHIDI.nomeAllergene);
                    case "capesante", "cozze", "calamari", "polpo" -> System.out.println("Allergene presente: " + Allergeni.MOLLUSCHI.nomeAllergene);
                    case "mandorle", "noci" -> System.out.println("Allergene presente : " + Allergeni.FRUTTA_A_GUSCIO.nomeAllergene);
                    case "pesce", "salmone", "orata" -> System.out.println("Allergene presente: " + Allergeni.PESCE.nomeAllergene);
                    case "latte", "burro", "yogurt" -> System.out.println("Allergene presente: " + Allergeni.LATTE.nomeAllergene);
                    case "senape" -> System.out.println("Allergene presente: " + Allergeni.SENAPE.nomeAllergene);
                    case "funghi", "pomodoro", "tartufo" -> System.out.println("Allergene presente: " + Allergeni.NICKEL.nomeAllergene);
                    case "cannelloni", "ravioli", "paccheri", "linguine", "spaghetti", "conchiglioni", "farina", "saitan" ->
                            System.out.println("Allergene presente: " + Allergeni.GLUTINE.nomeAllergene);
                    default -> {
                    }
                }
            }
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
