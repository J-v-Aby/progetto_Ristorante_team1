package portate;

import enumPackage.CotturaEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondiPiatti extends Portata implements Sql{
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
    public void insert() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ristorante_team_1", "progettoAdmin", "root");
             Statement stmt = conn.createStatement();
        ) {
            String sql = "INSERT INTO secondi (nome, prezzo, descrizione, lista_allergeni, contorno, cotturaEnum)" +
                    "VALUES(" + getNome() + ", " + getPrezzo() + getDescrizione() + ", " + getListaAllergeni() + ", " + contorno + ", " + cotturaEnum.getTipoCottura();

            stmt.executeUpdate(sql);
            conn.close();
            System.out.println("Tabella creata!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printTot() {


    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }


    @Override
    public void print() {
        super.printTot();
        System.out.println("Contorno: " + contorno + "\tTipo cottura: " + cotturaEnum);
    }


}
