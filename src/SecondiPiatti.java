import enumPackage.CotturaEnum;

public class SecondiPiatti extends Portata {

    private String contorno;
    private CotturaEnum cotturaEnum;

    public SecondiPiatti(String nome, Double prezzo, String descrizione, String contorno, CotturaEnum cotturaEnum) {
        super(nome, prezzo, descrizione);
        this.contorno = contorno;
        this.cotturaEnum = cotturaEnum;
    }

    public String getContorno() {
        return contorno;
    }

    public void setContorno(String contorno) {
        this.contorno = contorno;
    }

    public CotturaEnum getCottura() {
        return cotturaEnum;
    }

    public void setCottura(CotturaEnum cotturaEnum) {
        this.cotturaEnum = cotturaEnum;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Contorno: " + contorno + "\tTipo cottura: " + cotturaEnum);
    }
}
