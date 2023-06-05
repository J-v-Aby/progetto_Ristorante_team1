package Dao;

import enumPackage.ConnectionSQLEnum;
import portate.Bevande;
import portate.Portata;
import portate.PrimiPiatti;

import java.sql.*;

public class BevandeDao implements Sql{
    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();


        String createQuery = """
                    CREATE TABLE `bevande` (
                      `id_bevande` int NOT NULL AUTO_INCREMENT,
                      `nome` varchar(100) DEFAULT NULL,
                      `prezzo` double DEFAULT NULL,
                      `descrizione` varchar(100) DEFAULT NULL,
                      `id_menu` int DEFAULT NULL,
                      PRIMARY KEY (`id_bevande`),
                      KEY `bevande_FK` (`id_menu`),
                      CONSTRAINT `bevande_FK` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id_menu`)
                    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
                """;
        statement.executeUpdate(createQuery);

        conn.close();

        System.out.println("Tabella delle bevande creata");
    }

    @Override
    public void insertSQL(Portata portata) throws SQLException {
        Bevande bevande = (Bevande) portata;
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO ristorante_team_1.bevande\n" +
                "(nome, prezzo, descrizione, id_menu, gradazione)\n" +
                "VALUES ('" + bevande.getNome() + "', '" + bevande.getPrezzo() + "', '" + bevande.getDescrizione() + "', '" + bevande.getListaAllergeni() + "', '" + bevande.getGradazioneAlcolica() + "'" + ");";

        ;

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
                    SELECT * from bevande;
                    """;

            ResultSet resultSet = stmt.executeQuery(printQuery);


            while (resultSet.next()) {
                System.out.println(" id_bevande " + resultSet.getInt("id_bevande"));
                System.out.println(" id_menu: " + resultSet.getInt("id_menu"));
                System.out.println(" nome: " + resultSet.getString("nome"));
                System.out.println(" prezzo: " + resultSet.getString("prezzo"));
                System.out.println(" descrizione: " + resultSet.getString("descrizione"));


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteSQL(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM bevande WHERE" + whereCondition + ");";

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
                  SELECT * from bevande;

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
        System.out.println("Bevanda: " + findName + " aggiornato");

    }
}
