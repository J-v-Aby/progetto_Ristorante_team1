package portate;

import enumPackage.AllergeniEnum;
import enumPackage.UtilityColorEnum;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Portata {
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

    public void addAllergeni(AllergeniEnum allergenico) {
        listaAllergeni.add(allergenico);
    }

    public void setListaAllergeni(Set<AllergeniEnum> listaAllergeni) {
        this.listaAllergeni = listaAllergeni;
    }

    /**
     * Metodo che restituisce in una stringa gli allergeni della pietanza, se presenti.
     * Aggiunge anche una virgola se sono più elementi.
     *
     * @return String
     */
    public String allergeniChecker() {
        if (listaAllergeni.size() != 0) {
            StringBuilder sumAllerg = new StringBuilder("Allergeni: ");
            Iterator<AllergeniEnum> iterator = listaAllergeni.iterator();
            while (iterator.hasNext()) {
                sumAllerg.append(UtilityColorEnum.ANSI_RED.getCodice() + iterator.next().getNomeAllergene());
                if (iterator.hasNext()) {
                    sumAllerg.append(", ");
                }
            }
            sumAllerg.append(UtilityColorEnum.ANSI_RESET.getCodice());
            return sumAllerg.toString();
        }
        return "";
    }

    /**
     * Metodo della classe Padre Portata da Overridare nelle classi che estendono la stessa; permette anche di standardizzare la formattazione.
     */
    public void print() {
        String prima = "\n" + UtilityColorEnum.ANSI_BOLD.getCodice() + nome + UtilityColorEnum.ANSI_RESET.getCodice();
        StringBuilder stringBuilder = new StringBuilder(prima);

        while (stringBuilder.length() < 80) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(UtilityColorEnum.ANSI_YELLOW.getCodice() + prezzo + UtilityColorEnum.ANSI_RESET.getCodice() + " €" + "\n" + descrizione);

        stringBuilder.append("\n" + allergeniChecker());
        System.out.println(stringBuilder);
    }
}
