package Dao;

import portate.Portata;

import java.sql.SQLException;

public interface Sql {
   void createTable () throws SQLException;
   void insertSQL(Portata portata) throws SQLException;
   void printSQL();
   void deleteSQL(String whereCondition) throws SQLException;
   void updateSQLByName(String nomeCercato, String setStatement) throws SQLException;



}
