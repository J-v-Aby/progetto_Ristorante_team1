import enumPackage.TipologiaEnum;

import java.time.LocalDate;

public class Cliente {
    String nomeCognome;
    TipologiaEnum menuPreferito;
    Integer postiPrenotati;
    LocalDate dataPrenotazione;

    public Cliente(String nomeCognome, TipologiaEnum menuPreferito, Integer postiPrenotati, LocalDate dataPrenotazione) {
        this.nomeCognome = nomeCognome;
        this.menuPreferito = menuPreferito;
        this.postiPrenotati = postiPrenotati;
        this.dataPrenotazione = dataPrenotazione;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public TipologiaEnum getMenuPreferito() {
        return menuPreferito;
    }

    public void setMenuPreferito(TipologiaEnum menuPreferito) {
        this.menuPreferito = menuPreferito;
    }

    public Integer getPostiPrenotati() {
        return postiPrenotati;
    }

    public void setPostiPrenotati(Integer postiPrenotati) {
        this.postiPrenotati = postiPrenotati;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }
}