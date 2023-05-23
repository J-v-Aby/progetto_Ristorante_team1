package portate;

import enumPackage.AllergeniEnum;
import enumPackage.CotturaEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SecondiPiatti extends Portata {
    private String contorno;
    private CotturaEnum cotturaEnum;

    public SecondiPiatti(String nome, Double prezzo, String descrizione, String contorno, CotturaEnum cotturaEnum) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
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

    public void createTableSecondi() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ristorante_team_1", "progettoAdmin", "root");
             Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE secondi (" +
                    "nome VARCHAR(255), " +
                    "prezzo DOUBLE, " +
                    "descrizione VARCHAR(255), " +
                    "lista_allergeni VARCHAR(255), " +
                    "contorno VARCHAR(255), " +
                    "cotturaEnum VARCHAR(255)" +
                    ");";

            stmt.executeUpdate(sql);
            conn.close();
            System.out.println("Tabella Secondi Creata!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
    }


    public void insertSecondi() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ristorante_team_1", "progettoAdmin", "root");
             Statement stmt = conn.createStatement();
        ) {
            StringBuilder lista = new StringBuilder();

            for (AllergeniEnum s : getListaAllergeni()) {
                lista.append(s.getNomeAllergene()).append(" ");
            }
            lista.append(",");

            StringBuilder desc = new StringBuilder();

            for (String s : getDescrizione().split("-")) {
                for (char c : s.toCharArray()) {
                    if (c != ',') {
                        desc.append(c);
                    }
                    desc.append(" ");
                }

            }


            String sql = "INSERT INTO secondi (nome, prezzo, descrizione, lista_allergeni, contorno, cotturaEnum)" +
                    "VALUES(" + getNome() + ", " + getPrezzo() + ", " + getDescrizione() + ", " + lista + ", " + contorno + ", " + cotturaEnum.getTipoCottura();

            stmt.executeUpdate(sql);
            conn.close();
            System.out.println("Secondo Inserito!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}

