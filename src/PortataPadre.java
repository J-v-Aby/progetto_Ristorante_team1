import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PortataPadre {
    private String nome;
    private Double prezzo;
    private String descrizione;
    private Set<Allergeni> listaAllergeni;

    public PortataPadre(String nome, Double prezzo, String descrizione) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        listaAllergeni = new HashSet<>();
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

    public Set<Allergeni> getListaAllergeni() {
        return listaAllergeni;
    }

    public void setListaAllergeni(Set<Allergeni> listaAllergeni) {
        this.listaAllergeni = listaAllergeni;
    }

    public String allergeniGetString() {
        if (listaAllergeni.size() != 0) {
            String sumAllerg = "\t\tAllergeni: ";
            for (Allergeni allergeni : listaAllergeni) {
                sumAllerg += allergeni.getNomeAllergene() + ", ";
            }
            return sumAllerg;
        }
        return "";
    }

    public void print() {
        System.out.println("\n" + UtilityColor.ANSI_BOLD + nome + UtilityColor.ANSI_RESET + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + allergeniGetString());
    }
}
