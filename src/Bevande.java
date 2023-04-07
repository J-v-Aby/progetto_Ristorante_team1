public class Bevande {
    private String nome;
    private Double prezzo;
    private Integer checkTipoMenu;

    public Bevande(String nome, Double prezzo, Integer checkTipoMenu) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.checkTipoMenu = checkTipoMenu;
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

    public Integer getCheckTipoMenu() {
        return checkTipoMenu;
    }

    public void setCheckTipoMenu(Integer checkTipoMenu) {
        this.checkTipoMenu = checkTipoMenu;
    }

    public void printBevande() {
        System.out.println("\n" + "\033[0;1m" + nome + "\033[0m" + "\t\t\t\t\t\t" + prezzo + " €");
    }
}
