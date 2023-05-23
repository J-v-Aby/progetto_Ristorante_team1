package portate;

import java.sql.*;

public class PrimiPiatti extends Portata implements Sql{
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/ristorante_team_1?user=progettoAdmin&password=root";
    private boolean consigliatoPerBimbi;
    private Integer tempoCottura;

    public PrimiPiatti(String nome, Double prezzo, String descrizione, boolean consigliatoPerBimbi, int tempoCottura) {
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
    public void printTot() {
        super.printTot();
        System.out.println("Teampo cottura: " + tempoCottura + " minuti");
        if (isConsigliatoPerBimbi()) {
            System.out.println("Consigliato per bimbi");
        }
}



    @Override
    public void insert() throws SQLException {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);

            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO primi_piatti (nome, prezzo, descrizione, lista_allergeni, tempo_cottura) " +
                    "VALUES ('" + getNome()+ "', '" + getPrezzo()+ "', '" + getDescrizione() + "', '" + getListaAllergeni().toString() + "', '" + getTempoCottura() + "'" + ");";
        System.out.println(insertQuery);

            // String nome, Double prezzo, String descrizione, boolean consigliatoPerBimbi, int tempoCottura

            statement.executeUpdate(insertQuery);

            conn.close();

            System.out.println("Tabella popolata");
    }


    @Override
    public void print() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ristorante_team_1", "progettoAdmin", "root");
             Statement stmt = conn.createStatement();
        ) {
            String printQuery = """
                SELECT * from primi_piatti;
                """;

            ResultSet resultSet = stmt.executeQuery(printQuery);

            int i = 0;

            while (resultSet.next()) {
                i = i +1;
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
    public void delete() {

    }

    @Override
    public void update() {

    }
}
