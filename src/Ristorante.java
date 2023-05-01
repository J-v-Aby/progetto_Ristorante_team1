import portate.Portata;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private Byte numeroCoperti;
    private Portata piattoDelGiorno;

    public Ristorante(String nome, String indirizzo, Byte numeroCoperti, Portata piattoDelGiorno) {
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
    public Byte getNumeroCoperti() {
        return numeroCoperti;
    }
    public void setNumeroCoperti(Byte numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }
    public Portata getPiattoDelGiorno() {
        return piattoDelGiorno;
    }
    public void setPiattoDelGiorno(Portata piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }
}
