import java.util.ArrayList;
import java.util.List;

public class ListeMenu {
    private static List<Menu> carneList = new ArrayList<>();
    private static List<Menu> pesceList = new ArrayList<>();
    private static List<Menu> veganList = new ArrayList<>();
    private static List<Menu> bevandeList = new ArrayList<>();
    private static List<Menu> dolciList = new ArrayList<>();
//    private static List<Menu> ordineCliente = new ArrayList<>();

    public ListeMenu() {
    }

    public static List<Menu> getCarneList() {
        return carneList;
    }

    public static void setCarneList(List<Menu> carneList) {
        ListeMenu.carneList = carneList;
    }

    public static List<Menu> getPesceList() {
        return pesceList;
    }

    public static void setPesceList(List<Menu> pesceList) {
        ListeMenu.pesceList = pesceList;
    }

    public static List<Menu> getVeganList() {
        return veganList;
    }

    public static void setVeganList(List<Menu> veganList) {
        ListeMenu.veganList = veganList;
    }

    public static List<Menu> getBevandeList() {
        return bevandeList;
    }

    public static void setBevandeList(List<Menu> bevandeList) {
        ListeMenu.bevandeList = bevandeList;
    }

    public static List<Menu> getDolciList() {
        return dolciList;
    }

    public static void setDolciList(List<Menu> dolciList) {
        ListeMenu.dolciList = dolciList;
    }

}
