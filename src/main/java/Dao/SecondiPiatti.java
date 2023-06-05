package Dao;

import enumPackage.ConnectionSQLEnum;
import portate.Portata;
import portate.PrimiPiatti;

import java.sql.*;

public class SecondiPiatti implements Sql{
    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();


        String createQuery = """
                    CREATE TABLE IF NOT EXISTS `primi_piatti` (
                      `id` int NOT NULL AUTO_INCREMENT,
                      `nome` varchar(100) DEFAULT NULL,
                      `prezzo` double DEFAULT NULL,
                      `descrizione` varchar(100) DEFAULT NULL,
                      `lista_allergeni` varchar(100) DEFAULT NULL,
                      `tempo_cottura` varchar(100) DEFAULT NULL,
                      PRIMARY KEY (`id`)
                    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella dei primi piatti creata");
    }

    @Override
    public void insertSQL(Portata portata) throws SQLException {
        PrimiPiatti primiPiatti = (PrimiPiatti) portata;
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO primi_piatti (nome, prezzo, descrizione, lista_allergeni, tempo_cottura) " +
                "VALUES ('" + primiPiatti.getNome() + "', '" + primiPiatti.getPrezzo() + "', '" + primiPiatti.getDescrizione() + "', '" + primiPiatti.getListaAllergeni() + "', '" + primiPiatti.getTempoCottura() + "'" + ");";

        statement.executeUpdate(insertQuery);

        conn.close();

        System.out.println("Tabella popolata");
    }

    @Override
    public void printSQL() {
        try (Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());
             Statement stmt = conn.createStatement();
        ) {
            String printQuery = """
                    SELECT * from primi_piatti;
                    """;

            ResultSet resultSet = stmt.executeQuery(printQuery);


            while (resultSet.next()) {
                System.out.println(" nome: " + resultSet.getString("nome"));
                System.out.println(" prezzo: " + resultSet.getString("prezzo"));
                System.out.println(" descrizione: " + resultSet.getString("descrizione"));
                System.out.println(" lista allergeni: " + resultSet.getString("lista_allergeni"));
                System.out.println(" tempo cottura: " + resultSet.getString("tempo_cottura"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteSQL(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM primi_piatti WHERE" + whereCondition + ");";

        statement.executeUpdate(deleteQuery);

        conn.close();

        System.out.println("Record cancellato con successo");

    }

    /**
     * //     * method that retrieves records filtered by the field 'nome' of the object
     * //     * and updates them based on the query contained in updateTable,
     * //     * the settings can be changed to search for other fields
     * //
     */
    @Override
    public void updateSQLByName(String nomeCercato, String setStatement) throws SQLException {

        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());
        Statement statement = conn.createStatement();
        String printQuery = """
                  SELECT * from primi_piatti;

                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        String findName = null;
        while (resultSet.next()) {
            String name = resultSet.getString("nome");
            if (name.equals(nomeCercato)) {
                findName = '"' + name + '"';
            }
        }

        String updateTable = """
                UPDATE primi_piatti\s""" +
                setStatement + """
                \sWHERE nome =""" + findName;


        System.out.println(updateTable);
        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Primo piatto: " + findName + " aggiornato");

    }
}
