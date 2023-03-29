import java.util.List;

public class Ristorante {
    public static void main(String[] args) {
        creazioneBevande();
    }

    public static void creazioneBevande() {
        Bevande acqua = new Bevande("Acqua", 1.00F);
        Bevande acquaFrizzante = new Bevande("Acqua frizzante", 1.20F);
        Bevande cocaCola = new Bevande("Coca Cola", 2.00F);
        Bevande Sprite = new Bevande("Sprite", 2.00F);
        Bevande fanta = new Bevande("Fanta", 2.00F);
        System.out.println("Bevande:" + "\n" + acqua.getNome() + "\n" + acquaFrizzante.getNome() + "\n" + cocaCola.getNome() + "\n" + Sprite.getNome() + "\n" + fanta.getNome());
    }


}
