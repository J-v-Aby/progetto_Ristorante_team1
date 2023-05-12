import enumPackage.TipologiaEnum;
import portate.Portata;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private String descrizione;
    private String prezzoMedio;
    private String recensioni;
    private Integer numeroCoperti;

    private Portata piattoDelGiorno;

    private Map<TipologiaEnum, Menu> mappaMenu;

    private Calendar date;

    //TODO bisogna inserire la prenotazione usando una struttura dati mappa che mette in relazione cliente e tavolo che saranno due classi
    //nel main chiamare ristorante.prenota(cliente,tavolo) stampare la prenotazione e poi il menù in base al tipo di cliente(vegano,carn ecc ecc)


    public Ristorante(String nome, String indirizzo, String descrizione, String prezzoMedio, String recensioni, Integer numeroCoperti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
        this.prezzoMedio = prezzoMedio;
        this.recensioni = recensioni;
        this.numeroCoperti = numeroCoperti;
        this.mappaMenu = new HashMap<>();
        this.date = Calendar.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPrezzoMedio() {
        return prezzoMedio;
    }

    public void setPrezzoMedio(String prezzoMedio) {
        this.prezzoMedio = prezzoMedio;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }

    public Integer getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(Integer numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public Portata getPiattoDelGiorno() {
        return piattoDelGiorno;
    }

    public void setPiattoDelGiorno(Portata piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }

    public Map<TipologiaEnum, Menu> getMappaMenu() {
        return mappaMenu;
    }

    public void setMappaMenu(Map<TipologiaEnum, Menu> mappaMenu) {
        this.mappaMenu = mappaMenu;
    }


    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * In base alla data impostata nel costruttore stampiamo un messaggio se la giornata attuale è una festività
     */

    public void printMessaggioFestivita() {
        int giornoOggi = date.get(Calendar.DAY_OF_MONTH);
        int meseOggi = date.get(Calendar.MONTH) + 1;

        if (giornoOggi == 12 && meseOggi == 5) { //if(giornoOggi == 25 && meseOggi == 12)
            System.out.println("\nBuon Ferragosto da Coppa Cicuti! Per l'occasione il giro di ammazzacaffè lo paga Michele.");
        }

        if (giornoOggi >= 23 && giornoOggi <= 26 && meseOggi == 12) { //if(giornoOggi == 25 && meseOggi == 12)
            System.out.println("\nBuon Natale da Coppa Cicuti! Per l'occasione il giro di ammazzacaffè lo paga Michele.");
        }

        if (giornoOggi >= 27 && giornoOggi <= 31 && meseOggi == 12) { //if(giornoOggi == 25 && meseOggi == 12)
            System.out.println("\nBuon anno nuovo da Coppa Cicuti! Per l'occasione il giro di ammazzacaffè lo paga Michele.");
        }

        if (giornoOggi >= 1 && giornoOggi <= 3 && meseOggi == 1) { //if(giornoOggi == 25 && meseOggi == 12)
            System.out.println("\nBuon anno nuovo da Coppa Cicuti! Per l'occasione il giro di ammazzacaffè lo paga Michele.");
        }
    }

    /**
     * metodo per stampare l'intestazione + il menu utilizzando come chiave della mappa da cui prendere il menu
     * un parametro di TipologiaEnum
     *
     * @param tipoMenu
     */
    public void printGlobale(TipologiaEnum tipoMenu) {
        System.out.print(descrizione);
        printMessaggioFestivita();
        mappaMenu.get(tipoMenu).printMenu();
    }
}
