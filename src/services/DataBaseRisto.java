package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseRisto {

    private final String DB_URL = "jdbc:mysql://localhost:3306/localhost";
    private final String USERNAME = "progettoAdmin";
    private final String PASSWORD = "root";

    public DataBaseRisto() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    }
    public void init() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
        ) {
            String portataTAB = "CREATE TABLE IF NOT EXISTS Portata(" +
                    "id_portata INTEGER AUTO_INCREMENT, " +
                    " nome VARCHAR(255) , " +
                    " prezzo DOUBLE, " +
                    " descrizione VARCHAR(255)" +
                    " lista_allergeni VARCHAR(255)"+
                    " PRIMARY KEY (id)" +
                    ");";

            String ristoTAB = "CREATE TABLE IF NOT EXISTS ristorante (" +
                    "  id int NOT NULL AUTO_INCREMENT," +
                    "  PRIMARY KEY (id)" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";

            String menuTAB = "CREATE TABLE IF NOT EXISTS menu (" +
                    "  id int NOT NULL AUTO_INCREMENT," +
                    "  id_ristorante int DEFAULT NULL," +
                    "  KEY menu_FK (id)," +
                    "  CONSTRAINT menu_FK FOREIGN KEY (id) REFERENCES ristorante (id)" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";


            stmt.executeUpdate(portataTAB);
            stmt.executeUpdate(ristoTAB);
            stmt.executeUpdate(menuTAB);
            //stmt.executeUpdate(secondiTAB);
            conn.close();
            System.out.println("Tabella creata!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public String getDB_URL() {
        return DB_URL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void aggiungiTabella(String nomeTAB){


    }

}
