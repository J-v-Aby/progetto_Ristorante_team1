package portate;

import enumPackage.AllergeniEnum;
import enumPackage.UtilityColorEnum;

import java.util.HashSet;
import java.util.Set;

public class Portata {
    private String nome;
    private Double prezzo;
    private String descrizione;
    private Set<AllergeniEnum> listaAllergeni;

    public Portata(String nome, Double prezzo, String descrizione) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.listaAllergeni = new HashSet<>();
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

    public Set<AllergeniEnum> getListaAllergeni() {
        return listaAllergeni;
    }

    public void setListaAllergeni(Set<AllergeniEnum> listaAllergeni) {
        this.listaAllergeni = listaAllergeni;
    }

    //TODO e che significa questo metodo? rendiamolo parlante
    public String allergeniGetString() {
        if (listaAllergeni.size() != 0) {
            StringBuilder sumAllerg = new StringBuilder("\t\tAllergeni: ");
            for (AllergeniEnum allergeni : listaAllergeni) {
                sumAllerg.append(allergeni.getNomeAllergene()).append(", ");
            }
            return sumAllerg.toString();
        }
        return "";
    }

    /**
     * Metodo della classe Padre Portata da Overridare nelle classi che estendono la stessa.
     */
    public void print() {
        System.out.println("\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + nome + UtilityColorEnum.ANSI_RESET.getCodice() + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + allergeniGetString());
    }
    //TODO e se volessimo cambiare i colori del menù? come facciamo?
    public void print(UtilityColorEnum utilityColorEnumFirst, UtilityColorEnum utilityColorEnumSecond){
        System.out.println("\n" + utilityColorEnumFirst.getCodice() + nome + utilityColorEnumSecond.getCodice() + "\t\t\t\t\t\t" + prezzo + " €" + "\n" + descrizione + allergeniGetString());

    }
}
