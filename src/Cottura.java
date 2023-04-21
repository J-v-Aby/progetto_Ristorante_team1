
//TODO cosa manca? da dove possiamo vedere questa classe
enum Cottura {
    SANGUE("Al sangue"),
    MEDIA("Cottura media"),
    COTTA("Ben cotta");
    private final String tipoCottura;
    Cottura(String tipoCottura) {
        this.tipoCottura = tipoCottura;
    }
    public String getTipoCottura() {
        return tipoCottura;
    }
}

