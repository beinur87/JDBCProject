package org.example.dao;

import java.sql.SQLException;

public interface FoodDao {
    //create table
    void createtable() throws SQLException;
    //adaugare date         CREATE animals

    //gasire date           READ animals
    //modificare date       UPDATE animals
    //stergere date         DELETE animals
    //sters total

    void dropTable() throws SQLException;
}
