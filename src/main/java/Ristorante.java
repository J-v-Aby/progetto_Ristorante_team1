import enumPackage.TavoliEnum;
import enumPackage.TipologiaEnum;
import portate.Portata;

import java.util.*;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private String descrizione;
    private Double prezzoMedio;
    private String recensioni;
    private Integer tavoloDaQuattro;
    private Integer tavoloDaSei;
    private Integer tavoloDaOtto;
    private boolean tavoloVip;
    private Portata piattoDelGiorno;
    private List<Menu> menuList;

    private Calendar date;

    public Ristorante(String nome, String indirizzo, String descrizione, Double prezzoMedio, String recensioni,
                      Integer tavoloDaQuattro, Integer tavoloDaSei, Integer tavoloDaOtto, boolean tavoloVip) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
        this.prezzoMedio = prezzoMedio;
        this.recensioni = recensioni;
        this.tavoloDaQuattro = tavoloDaQuattro;
        this.tavoloDaSei = tavoloDaSei;
        this.tavoloDaOtto = tavoloDaOtto;
        this.tavoloVip = tavoloVip;
        this.menuList = new ArrayList<>();
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

    public Double getPrezzoMedio() {
        return prezzoMedio;
    }

    public void setPrezzoMedio(Double prezzoMedio) {
        this.prezzoMedio = prezzoMedio;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public Integer getTavoloDaSei() {
        return tavoloDaSei;
    }

    public void setTavoloDaSei(Integer tavoloDaSei) {
        this.tavoloDaSei = tavoloDaSei;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }

    public Integer getTavoloDaQuattro() {
        return tavoloDaQuattro;
    }

    public void setTavoloDaQuattro(Integer tavoloDaQuattro) {
        this.tavoloDaQuattro = tavoloDaQuattro;
    }

    public Portata getPiattoDelGiorno() {
        return piattoDelGiorno;
    }

    public Integer getTavoloDaOtto() {
        return tavoloDaOtto;
    }

    public void setTavoloDaOtto(Integer tavoloDaOtto) {
        this.tavoloDaOtto = tavoloDaOtto;
    }

    public boolean isTavoloVip() {
        return tavoloVip;
    }

    public void setTavoloVip(boolean tavoloVip) {
        this.tavoloVip = tavoloVip;
    }

    public void setPiattoDelGiorno(Portata piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
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
     * metodo per stampare l'intestazione + il menu utilizzando come parametro il field tipoMenu del menu che si vuole stampare
     * un parametro di TipologiaEnum
     *
     * @param //tipoMenu
     */
    public void printGlobale() {
        System.out.print(descrizione);
        printMessaggioFestivita();
    }

    public void prenotaTavolo(Prenotazione prenotazione) {
        if (prenotazione.getNumeroPosti() <= 4 && tavoloDaQuattro > 0) {
            prenotazione.equals(TavoliEnum.TAVOLO_4);
            tavoloDaQuattro -= 1;
            System.out.println("Singor " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
        } else if ((prenotazione.getNumeroPosti() > 4) && (prenotazione.getNumeroPosti() <= 6) && tavoloDaSei > 0) {
            prenotazione.equals(TavoliEnum.TAVOLI_6);
            tavoloDaSei -= 1;
            System.out.println("Singor " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
        } else if ((prenotazione.getNumeroPosti() > 6) && (prenotazione.getNumeroPosti() <= 8) && tavoloDaOtto > 0) {
            prenotazione.equals(TavoliEnum.TAVOLI_8);
            tavoloDaOtto -= 1;
            System.out.println("Singor " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
        } else {
            System.out.println("Singor  " + prenotazione.getNomeCliente() + "  non ci sono tavoli disponibili al momento ");
        }
    }

    public void prenotaTavoloVip(Prenotazione prenotazione) {
        if (tavoloVip == true) {
            if (prenotazione.getNumeroPosti() <= 4 && tavoloDaQuattro > 0) {
                prenotazione.equals(TavoliEnum.TAVOLO_4);
                tavoloDaQuattro -= 1;
                System.out.println("Singor  " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
            } else if ((prenotazione.getNumeroPosti() > 4) && (prenotazione.getNumeroPosti() <= 6) && tavoloDaSei > 0) {
                prenotazione.equals(TavoliEnum.TAVOLI_6);
                tavoloDaSei -= 1;
                System.out.println("Singor  " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
            } else if ((prenotazione.getNumeroPosti() > 6) && (prenotazione.getNumeroPosti() <= 8) && tavoloDaOtto > 0) {
                prenotazione.equals(TavoliEnum.TAVOLI_8);
                tavoloDaOtto -= 1;
                System.out.println("Singor  " + prenotazione.getNomeCliente() + " la prentazione é andata a buon fine");
            }
        }
        System.out.println("Spiacente Signor" + prenotazione.getNomeCliente() + " il nostro ristorante non dispone di area vip");
    }

    public void liberaTavolaDallaCassa(Prenotazione prenotazione) {
        if (prenotazione.getNumeroPosti() <= 4 && tavoloDaQuattro >= 0) {
            prenotazione.equals(TavoliEnum.TAVOLO_4);
            tavoloDaQuattro += 1;
        }
        if (prenotazione.getNumeroPosti() <= 6 && tavoloDaSei > 0) {
            prenotazione.equals(TavoliEnum.TAVOLI_6);
            tavoloDaQuattro += 1;
        }
        if (prenotazione.getNumeroPosti() <= 8 && tavoloDaOtto > 0) {
            prenotazione.equals(TavoliEnum.TAVOLI_8);
            tavoloDaQuattro += 1;
        }
    }

    public void printMenuCliente(TipologiaEnum tipologiaEnum) {
        for (Menu menu : menuList)
            if (menu.getTipoMenu() == tipologiaEnum) {
                menu.printMenu();
            }
    }
}
