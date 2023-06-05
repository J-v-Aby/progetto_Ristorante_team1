package Dao;

import enumPackage.ConnectionSQLEnum;
import portate.Antipasti;
import portate.Portata;

import java.sql.*;

public class AntipastiDao implements Sql {
    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();


                        String CreateTableQuery = """
                    CREATE TABLE IF NOT EXISTS `antipasti` (
                      `id_antipasto` int NOT NULL AUTO_INCREMENT,
                      `nome` varchar(100) DEFAULT NULL,
                      `prezzo` double DEFAULT NULL,
                      `descrizione` varchar(100) DEFAULT NULL,
                      `lista_allergeni` varchar(100) DEFAULT NULL,
                      `descrizione_in_inglese` varchar(100) DEFAULT NULL,
                      `tipo_piatto` varchar(100) DEFAULT NULL,
                      `id_menu` int DEFAULT NULL,
                      PRIMARY KEY (`id_antipasto`),
                      KEY `antipasti_FK` (`id_menu`),
                        CONSTRAINT `antipasti_FK` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id_menu`)
                    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
                """;
        statement.executeUpdate(CreateTableQuery);

        conn.close();

        System.out.println("Tabella degli antipasti creata");
    }

    @Override
    public void insertSQL(Portata portata) throws SQLException {
        Antipasti antipasti = (Antipasti) portata;
        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO antipasti (nome, prezzo, descrizione, lista_allergeni, descrizione_in_inglese, tipo_piatto, id_menu) " +
                "VALUES ('" + antipasti.getNome() + "', '" + antipasti.getPrezzo() + "', '" + antipasti.getDescrizione() + "', '" + antipasti.getListaAllergeni() + "', '" + antipasti.getDescrizioneInInglese() +"', '" +antipasti.getTipoPiatto() +"', '" + antipasti.getIdMenu() + "'" + ");";

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
                    SELECT * from antipasti;
                    """;

            ResultSet resultSet = stmt.executeQuery(printQuery);


            while (resultSet.next()) {
                System.out.println(" nome: " + resultSet.getString("nome"));
                System.out.println(" prezzo: " + resultSet.getString("prezzo"));
                System.out.println(" descrizione: " + resultSet.getString("descrizione"));
                System.out.println(" lista allergeni: " + resultSet.getString("lista_allergeni"));
                System.out.println(" description: " + resultSet.getString("descrizione_in_inglese"));
                System.out.println(" " + resultSet.getString("tipo_piatto"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteSQL(String whereCondition) throws SQLException {

        Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE FROM antipasti WHERE" + whereCondition + ");";

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
                  SELECT * from antipasti;

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
                UPDATE antipasti\s""" +
                setStatement + """
                \sWHERE nome =""" + findName;


        System.out.println(updateTable);
        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Antipasto: " + findName + " aggiornato");

    }
}
