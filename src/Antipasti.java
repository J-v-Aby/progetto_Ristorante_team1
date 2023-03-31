public class Antipasti {

    //TODO ampliare le funzionalità delle classi
    private String nome;
    private float prezzo;


    public Antipasti(String nome, float prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    //TODO dov'è il metodo per stampare
    public void print(){

        System.out.println("stampare qua");
    }

}