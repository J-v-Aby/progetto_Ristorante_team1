import portate.Portata;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private Integer numeroCoperti;
    private Portata piattoDelGiorno;

    //TODO ognugno di voi dovrà farsi la propria tabella quindi installiamo un db con lo stesso nome ma in locale sui vostri pc
    //TODO bisogna inserire la prenotazione usando una struttura dati mappa che mette in relazione cliente e tavolo che saranno due classi
    //nel main chiamare ristorante.prenota(cliente,tavolo) stampare la prenotazione e poi il menù in base al tipo di cliente(vegano,carn ecc ecc)
    public Ristorante(String nome, String indirizzo, Integer numeroCoperti, Portata piattoDelGiorno) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroCoperti = numeroCoperti;
        this.piattoDelGiorno = piattoDelGiorno;
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
}
