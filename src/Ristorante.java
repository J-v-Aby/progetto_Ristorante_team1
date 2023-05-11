import enumPackage.UtilityColorEnum;
import portate.Portata;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private Integer numeroCoperti;
    private Portata piattoDelGiorno;

    //TODO bisogna inserire la prenotazione usando una struttura dati mappa che mette in relazione cliente e tavolo che saranno due classi
    //nel main chiamare ristorante.prenota(cliente,tavolo) stampare la prenotazione e poi il menù in base al tipo di cliente(vegano,carn ecc ecc)
    public Ristorante(String nome, String indirizzo, Integer numeroCoperti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroCoperti = numeroCoperti;
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

    public Integer getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(Integer numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public Portata getPiattoDelGiorno() {
        return piattoDelGiorno;
    }

    public void setPiattoDelGiorno(Portata piattoDelGiorno) {
        this.piattoDelGiorno = piattoDelGiorno;
    }

    public void impostazioni() {
        System.out.println("\n\n\t\t\t" + UtilityColorEnum.ANSI_YELLOW_BACKGROUND.getCodice() + UtilityColorEnum.ANSI_BLACK.getCodice() +
                "  C O P P A  C I C U T I  " + UtilityColorEnum.ANSI_RESET.getCodice() + "\n");
        System.out.println("\t\t\t" + "L'esperienza che ferma il tempo\n" +
                "Le lancette rallentano il loro avanzare, nell’aria il racconto di piatti che emozionano al primo sguardo."
                + "\n" + " Danzatori silenziosi si muovono intorno a te per regalarti lo spettacolo di un servizio impeccabile,"
                + "\n" + " in una cornice di dettagli moreschi che parlano di storie antiche: signore e signori, " +
                "benvenuti nel Ristorante di Coppa Cicuti.");
        System.out.println("\n\t" + "Prezzo Medio: 50€\t" + "Recensioni: ⭐⭐⭐⭐⭐");
    }
}
