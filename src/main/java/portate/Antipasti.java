package portate;

import enumPackage.TipoPiattoEnum;

public class Antipasti extends Portata {

    private String descrizioneInInglese;
    private TipoPiattoEnum tipoPiatto;

    public Antipasti(String nome, Double prezzo, String descrizione, String descrizioneInInglese, TipoPiattoEnum tipoPiatto) {
        super(nome, prezzo, descrizione);
        this.descrizioneInInglese = descrizioneInInglese;
        this.tipoPiatto = tipoPiatto;
    }

    public String getDescrizioneInInglese() {
        return descrizioneInInglese;
    }

    public void setDescrizioneInInglese(String descrizioneInInglese) {
        this.descrizioneInInglese = descrizioneInInglese;
    }

    public TipoPiattoEnum getTipoPiatto() {
        return tipoPiatto;
    }

    public void setTipoPiatto(TipoPiattoEnum tipoPiatto) {
        this.tipoPiatto = tipoPiatto;
    }

    @Override
    public void printPadre() {
        super.printPadre();
        System.out.println(descrizioneInInglese + "\n" + tipoPiatto.getDescrizioneTipoPiatto());
    }
}
