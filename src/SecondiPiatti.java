import java.util.ArrayList;
import java.util.List;

public class SecondiPiatti {
    private String nome;
    private Double prezzo;
    private String descrizione;
    private TipoMenu tipoSecondo;

    public SecondiPiatti(String nome, Double prezzo, String descrizione, TipoMenu tipoSecondo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.tipoSecondo = tipoSecondo;
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

    public TipoMenu getTipoSecondo() {
        return tipoSecondo;
    }

    public void setTipoSecondo(TipoMenu tipoSecondo) {
        this.tipoSecondo = tipoSecondo;
    }

    public void print() {
        if (tipoSecondo.equals(TipoMenu.CARNE)){
        System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_YELLOW+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoSecondo.equals(TipoMenu.PESCE)){
        System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_BLUE+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
        if (tipoSecondo.equals(TipoMenu.VEGAN)){
        System.out.println("\n" + UtilityColor.ANSI_BOLD + UtilityColor.ANSI_GREEN+ nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione);
        }
    }
}
