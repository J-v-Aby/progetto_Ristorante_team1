package portate;

import enumPackage.ConnectionSQLEnum;
import enumPackage.CotturaEnum;

import java.sql.*;

public class SecondiPiatti extends Portata implements Sql {
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

    @Override
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

    /**
     * method to insert records into the table secondi_piatti
     */
    @Override
    public void insertSQL() throws SQLException {
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO secondi_piatti (nome, prezzo, descrizione, contorno, cotturaEnum) " +
                "VALUES ('" + getNome() + "', '" + getPrezzo() + "', '" + getDescrizione() + "', '" + getListaAllergeni().toString() + "', '" + getContorno() + "', '" + getCottura() + "'" + ");";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");
    }

    /**
     * method that retrieves data from the db with a select statement and prints them in console
     */
    @Override
    public void printSQL() {
        try (Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());
             Statement stmt = conn.createStatement();
        ) {
            String printQuery = """
                    SELECT * from secondi_piatti;
                    """;

            ResultSet resultSet = stmt.executeQuery(printQuery);


            while (resultSet.next()) {
                System.out.println(" nome: " + resultSet.getString("nome"));
                System.out.println(" prezzo: " + resultSet.getString("prezzo"));
                System.out.println(" descrizione: " + resultSet.getString("descrizione"));
                System.out.println(" lista allergeni: " + resultSet.getString("lista_allergeni"));
                System.out.println(" contorno: " + resultSet.getString("contorno"));
                System.out.println(" cotturaEnum: " + resultSet.getString("cotturaEnum"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteSQL() {

    }

    /**
     * method that retrieves records filtered by the field 'nome' of the object
     * and updates them based on the query contained in updateTable,
     * the settings can be changed to search for other fields
     */
    @Override
    public void updateSQL() throws SQLException {
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from secondi_piatti;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        String findName = null;
        while (resultSet.next()) {
            String name = resultSet.getString("nome");
            if (name.equals(getNome())) {
                findName = name;
            }
        }
        String updateTable = """
                UPDATE secondi_piatti
                SET prezzo = 3.50
                WHERE nome = '""" + findName + "';";

        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Secondo piatto: " + findName + "aggiornato");
    }
}
