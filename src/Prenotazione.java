import enumPackage.TavoliEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Prenotazione {

    private Integer numeroPosti;
    private String nomeCliente;

    public Prenotazione(Integer numeroPosti, String nomeCliente) {
        this.numeroPosti = numeroPosti;
        this.nomeCliente = nomeCliente;

    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}
