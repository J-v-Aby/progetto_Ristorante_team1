package portate;

import enumPackage.ConnectionSQLEnum;

import java.sql.*;

public class PrimiPiatti extends Portata implements Sql{
    private Boolean consigliatoPerBimbi;
    private Integer tempoCottura;

    public PrimiPiatti(String nome, Double prezzo, String descrizione, Boolean consigliatoPerBimbi, Integer tempoCottura) {
        super(nome, prezzo, descrizione);
        this.consigliatoPerBimbi = consigliatoPerBimbi;
        this.tempoCottura = tempoCottura;
    }

    public boolean isConsigliatoPerBimbi() {
        return consigliatoPerBimbi;
    }

    public void setConsigliatoPerBimbi(boolean consigliato) {
        consigliatoPerBimbi = consigliato;
    }

    public int getTempoCottura() {
        return tempoCottura;
    }

    public void setTempoCottura(int tempoCottura) {
        this.tempoCottura = tempoCottura;
    }

    @Override
    public void printPadre() {
        super.printPadre();
        System.out.println("Teampo cottura: " + tempoCottura + " minuti");
        if (isConsigliatoPerBimbi()) {
            System.out.println("Consigliato per bimbi");
        }
}


    @Override
    public void createTable() throws SQLException {

            Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

            Statement statement = conn.createStatement();


            String createQuery = """
                CREATE TABLE IF NOT EXISTS superHeroes
                ( heroes_id INTEGER(10) NOT NULL AUTO_INCREMENT,
                  name VARCHAR(30),
                  power VARCHAR(30),
                  team VARCHAR(25),
                  CONSTRAINT superHeroes_pk PRIMARY KEY (heroes_id)
                );
                """;
            statement.executeUpdate(createQuery);

            conn.close();

            System.out.println("Tabella dei primi piatti creata");
        }




    /**
     * method to insert records into the table primi_piatti
     */
    @Override
    public void insertSQL() throws SQLException {
            Connection conn = DriverManager.getConnection(ConnectionSQLEnum.ACCESS_STRING.getValue());

            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO primi_piatti (nome, prezzo, descrizione, lista_allergeni, tempo_cottura) " +
                    "VALUES ('" + getNome()+ "', '" + getPrezzo()+ "', '" + getDescrizione() + "', '" + getListaAllergeni().toString() + "', '" + getTempoCottura() + "'" + ");";

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
                SELECT * from primi_piatti;
                """;

            ResultSet resultSet = stmt.executeQuery(printQuery);



            while (resultSet.next()) {
                System.out.println(" nome: " + resultSet.getString("nome") );
                System.out.println(" prezzo: " + resultSet.getString("prezzo") );
                System.out.println(" descrizione: " + resultSet.getString("descrizione") );
                System.out.println(" lista allergeni: " + resultSet.getString("lista_allergeni") );
                System.out.println(" tempo cottura: " + resultSet.getString("tempo_cottura"));
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
                  SELECT * from primi_piatti;

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
                UPDATE primi_piatti
                SET prezzo = 3.50
                WHERE nome = '""" + findName + "';";

        statement.executeUpdate(updateTable);

        conn.close();
        System.out.println("Primo piatto: " + findName + "aggiornato" );

    }
}
