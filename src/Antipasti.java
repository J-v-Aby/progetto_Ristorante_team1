public class Antipasti extends Portata {


    private String descrizioneInInglese;

    //TODO sistemare
    private TipoPiatto tipoPiatto;

    public Antipasti(String nome, Double prezzo, String descrizione, String descrizioneInInglese, TipoPiatto tipoPiattoAntipasto) {
        super(nome, prezzo, descrizione);
        this.descrizioneInInglese = descrizioneInInglese;
        this.tipoPiatto = tipoPiattoAntipasto;
    }

    public TipoPiatto getTipoPiatto() {
        return tipoPiatto;
    }

    public void setTipoPiatto(TipoPiatto tipoPiatto) {
        this.tipoPiatto = tipoPiatto;
    }

    public String getDescrizioneInInglese() {
        return descrizioneInInglese;
    }

    public void setDescrizioneInInglese(String descrizioneInInglese) {
        this.descrizioneInInglese = descrizioneInInglese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(descrizioneInInglese + "\n" + tipoPiatto.descrizioneTipoPiatto);
    }
}