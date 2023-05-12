import portate.Portata;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private String descrizione;
    private String prezzoMedio;
    private String recensioni;
    private Integer numeroCoperti;
    private Portata piattoDelGiorno;

    //TODO bisogna inserire la prenotazione usando una struttura dati mappa che mette in relazione cliente e tavolo che saranno due classi
    //nel main chiamare ristorante.prenota(cliente,tavolo) stampare la prenotazione e poi il menù in base al tipo di cliente(vegano,carn ecc ecc)


    public Ristorante(String nome, String indirizzo, String descrizione, String prezzoMedio, String recensioni, Integer numeroCoperti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.descrizione = descrizione;
        this.prezzoMedio = prezzoMedio;
        this.recensioni = recensioni;
        this.numeroCoperti = numeroCoperti;
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

    /**
     * metodo per stampare l'intestazione + il menu passato come parametro
     * @param menu
     */
    public void printGlobale(Menu menu) {
        System.out.print(descrizione);
        menu.printMenu();
    }
}
