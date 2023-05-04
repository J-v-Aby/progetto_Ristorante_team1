package enumPackage;

/**
 * Enum che permette l'inserimento del tipo di cottura in un oggetto Portata,
 * il quale ha un costruttore che accetta come parametro lo stesso.
 */
public enum CotturaEnum {
    SANGUE("Al sangue"),
    MEDIA("Cottura media"),
    COTTA("Ben cotta");
    private final String tipoCottura;
    CotturaEnum(String tipoCottura) {
        this.tipoCottura = tipoCottura;
    }
    public String getTipoCottura() {
        return tipoCottura;
    }
}

