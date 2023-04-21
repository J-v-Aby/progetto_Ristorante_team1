public class PrimiPiatti extends PortataPadre {
     boolean consigliatoPerBimbi;
    private int tempoCottura;

    public PrimiPiatti(String nome, Double prezzo, String descrizione,boolean consigliatoPerBimbi, int tempoCottura) {
        super(nome, prezzo, descrizione);
        this.consigliatoPerBimbi = consigliatoPerBimbi;
        this.tempoCottura = tempoCottura;
    }

    public boolean isConsigliatoPerBimbi() {
        return consigliatoPerBimbi;
    }

    public void setConsigliatoPerBimbi(boolean consigliato) {
        consigliatoPerBimbi = consigliato;
    }


    public int getTempoCottura() {
        return tempoCottura;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Teampo cottura: " + tempoCottura + " minuti");
        if (isConsigliatoPerBimbi()){
            System.out.println("Consigliato per bimbi");
        }
    }
}
