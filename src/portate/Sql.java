package portate;

import java.sql.SQLException;

public interface Sql {
   void createTable () throws SQLException;
   void insertSQL() throws SQLException;

   void printSQL();
   void deleteSQL();
   void updateSQL() throws SQLException;



}
