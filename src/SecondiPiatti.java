public class SecondiPiatti extends PortataPadre {

    private String contorno;
    private Cottura cottura;

    public SecondiPiatti(String nome, Double prezzo, String descrizione, String contorno, Cottura cottura) {
        super(nome, prezzo, descrizione);
        this.contorno = contorno;
        this.cottura = cottura;
    }

    public String getContorno() {
        return contorno;
    }

    public void setContorno(String contorno) {
        this.contorno = contorno;
    }

    public Cottura getCottura() {
        return cottura;
    }

    public void setCottura(Cottura cottura) {
        this.cottura = cottura;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Contorno: " + contorno + "\tTipo cottura: " + cottura);
    }
}
