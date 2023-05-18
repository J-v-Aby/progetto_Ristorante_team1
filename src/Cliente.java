import enumPackage.TipologiaEnum;

public class Cliente {

    private String nome;
    private String cognome;
    private String numeroTelefono;
    private TipologiaEnum menuPreferito;

    public Cliente(String nome, String cognome, String numeroTelefono, TipologiaEnum menuPreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.menuPreferito = menuPreferito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public TipologiaEnum getMenuPreferito() {
        return menuPreferito;
    }

    public void setMenuPreferito(TipologiaEnum menuPreferito) {
        this.menuPreferito = menuPreferito;
    }

    public void printInfo() {
        System.out.print(
                "Nome: " + getNome() +
                "\nCognome: " + getCognome() +
                "\nTelefono: " + getNumeroTelefono() +
                "\nMenù preferito: " + getMenuPreferito() + "\n");
    }
}
