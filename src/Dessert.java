public class Dessert {
    private String nome;
    private Double prezzo;
    private String descrizione;
    private TipoMenu tipoDessert;

    public Dessert(String nome, Double prezzo, String descrizione, TipoMenu tipoDessert) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.tipoDessert = tipoDessert;
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public TipoMenu getTipoDessert() {
        return tipoDessert;
    }

    public void setTipoDessert(TipoMenu tipoDessert) {
        this.tipoDessert = tipoDessert;
    }

    public void print() {
        if (tipoDessert.equals(TipoMenu.CARNE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_YELLOW+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoDessert.equals(TipoMenu.PESCE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_BLUE+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoDessert.equals(TipoMenu.VEGAN)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_GREEN+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
    }
}


