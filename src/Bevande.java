public class Bevande {
    private String nome;
    private Double prezzo;
    private Boolean alcolico;

    Bevande(String nome, Double prezzo, Boolean alcolico) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.alcolico = alcolico;
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

    public Boolean getAlcolico() {
        return alcolico;
    }

    public void setAlcolico(Boolean alcolico) {
        this.alcolico = alcolico;
    }
    public void printBevanda() { if(getAlcolico()) {
        System.out.println(getNome() + " " + getPrezzo() + "€" + " contiene alcool");

    } else {
        System.out.println(getNome() + " " + getPrezzo() + "€");}
    }
}
