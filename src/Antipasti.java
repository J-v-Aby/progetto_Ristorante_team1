public class Antipasti {
    private String nome;
    private Double prezzo;
    private String descrizione;

    //TODO inserire enumerati
    private TipoPiatto tipoPiattoAntipasto;
    private TipoMenu tipoAnti;

    public Antipasti(String nome, Double prezzo, String descrizione, TipoPiatto tipoPiattoAntipasto, TipoMenu tipoAnti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.tipoPiattoAntipasto = tipoPiattoAntipasto;
        this.tipoAnti = tipoAnti;
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

    public TipoMenu getTipoMenu() {
        return tipoAnti;
    }

    public void setTipoMenu() {
        this.tipoAnti = tipoAnti;
    }

    public TipoPiatto getTipoPiattoAntipasto() {
        return tipoPiattoAntipasto;
    }

    public void setTipoPiattoAntipasto(TipoPiatto tipoPiattoAntipasto) {
        this.tipoPiattoAntipasto = tipoPiattoAntipasto;
    }

    public TipoMenu getTipoAnti() {
        return tipoAnti;
    }

    public void setTipoAnti(TipoMenu tipoAnti) {
        this.tipoAnti = tipoAnti;
    }

    //TODO inserire una classe utility con i colori
    public void print() {

        if (tipoAnti.equals(TipoMenu.CARNE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_YELLOW+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + tipoPiattoAntipasto.descrizioneTipoPiatto);
        }
        if (tipoAnti.equals(TipoMenu.PESCE)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_BLUE+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + tipoPiattoAntipasto.descrizioneTipoPiatto);
        }
        if (tipoAnti.equals(TipoMenu.VEGAN)){
            System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_GREEN+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + tipoPiattoAntipasto.descrizioneTipoPiatto);
        }
    }

}