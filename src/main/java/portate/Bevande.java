package portate;

public class Bevande extends Portata {
    private Double gradazioneAlcolica;

    public Bevande(String nome, Double prezzo, String descrizione, Integer idMenu, double gradazioneAlcolica) {
        super(nome, prezzo, descrizione, idMenu);
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    public double getGradazioneAlcolica() {
        return gradazioneAlcolica;
    }

    public void setGradazioneAlcolica(double gradazioneAlcolica) {
        this.gradazioneAlcolica = gradazioneAlcolica;
    }

    @Override
    public void printPadre() {
        super.printPadre();
        if (gradazioneAlcolica > 0.01) {
            System.out.println("Bevanda alcolica al " + gradazioneAlcolica + "%");
        }
    }
}
