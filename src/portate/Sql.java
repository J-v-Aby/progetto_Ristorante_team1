package portate;

import java.sql.SQLException;

public interface Sql {
   void insert() throws SQLException;

   void print();
   void delete();
   void update();



}
