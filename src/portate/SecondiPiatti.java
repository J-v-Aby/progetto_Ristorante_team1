package portate;

import enumPackage.CotturaEnum;
import services.DataBaseRisto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

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

    @Override
    public void sqlSalva(String nomeTabella, String parametroUno, String parametroDue) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        super.sqlSalva(nomeTabella, parametroUno, parametroDue);
    }
}
