package portate;

import enumPackage.ConnectionSQLEnum;
import enumPackage.CotturaEnum;

import java.sql.*;

public class SecondiPiatti extends Portata{
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
    public void printPadre() {
        super.printPadre();
        System.out.println("Contorno: " + contorno + "\tTipo cottura: " + cotturaEnum);

    }

    
    public void createTable() throws SQLException {

        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();


        String createQuery = """
                    CREATE TABLE IF NOT EXISTS `secondi_piatti` (
                      `id` int NOT NULL AUTO_INCREMENT,
                      `nome` varchar(100) DEFAULT NULL,
                      `prezzo` double DEFAULT NULL,
                      `descrizione` varchar(100) DEFAULT NULL,
                      `lista_allergeni` varchar(100) DEFAULT NULL,
                      `contorno` varchar(100) DEFAULT NULL,
                      `cotturaEnum` varchar(100) DEFAULT NULL,
                      PRIMARY KEY (`id`)
                    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella dei secondi piatti creata");
    }
}
