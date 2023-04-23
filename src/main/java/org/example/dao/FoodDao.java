package org.example.dao;

import org.example.model.Animal;
import org.example.model.Food;

import java.sql.SQLException;

public interface FoodDao {
    //create table
    void createtable() throws SQLException;
    //adaugare date         CREATE animals
    void create(Food food) throws SQLException;
    //gasire date           READ animals
    //modificare date       UPDATE animals
    //stergere date         DELETE animals
    //sters total

    void dropTable() throws SQLException;
}
