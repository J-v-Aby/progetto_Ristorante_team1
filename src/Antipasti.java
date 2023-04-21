public class Antipasti extends PortataPadre {

    //TODO aggiungere filed
    private String descrizioneInInglese;
    private TipoPiatto tipoPiattoAntipasto;

    public Antipasti(String nome, Double prezzo, String descrizione, String descrizioneInInglese, TipoPiatto tipoPiattoAntipasto) {
        super(nome, prezzo, descrizione);
        this.descrizioneInInglese = descrizioneInInglese;
        this.tipoPiattoAntipasto = tipoPiattoAntipasto;
    }

    public TipoPiatto getTipoPiattoAntipasto() {
        return tipoPiattoAntipasto;
    }

    public void setTipoPiattoAntipasto(TipoPiatto tipoPiattoAntipasto) {
        this.tipoPiattoAntipasto = tipoPiattoAntipasto;
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
        System.out.println(descrizioneInInglese + "\n" +tipoPiattoAntipasto.descrizioneTipoPiatto);
    }
}