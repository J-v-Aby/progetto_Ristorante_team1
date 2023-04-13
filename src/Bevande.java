public class Bevande {
    private String nome;
    private Double prezzo;
   private TipoMenu tipoBevande;

    public Bevande(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }


    public void print() {
        System.out.println("\n" + "\033[0;1m" + nome + "\033[0m" + "\t\t\t\t\t\t" + prezzo + " €");
    }
}
