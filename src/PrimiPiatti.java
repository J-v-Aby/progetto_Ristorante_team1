public class PrimiPiatti {
    private String nome;
    private Double prezzo;
    private String descrizione;
    private TipoMenu tipoPrimo;

    public PrimiPiatti(String nome, Double prezzo, String descrizione, TipoMenu tipoPrimo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.tipoPrimo = tipoPrimo;
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

    public TipoMenu getTipoPrimo() {
        return tipoPrimo;
    }

    public void setTipoPrimo(TipoMenu tipoPrimo) {
        this.tipoPrimo = tipoPrimo;
    }


    public void print() {
        if (tipoPrimo.equals(TipoMenu.CARNE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_YELLOW+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoPrimo.equals(TipoMenu.PESCE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_BLUE+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoPrimo.equals(TipoMenu.VEGAN)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_GREEN+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
    }
}
