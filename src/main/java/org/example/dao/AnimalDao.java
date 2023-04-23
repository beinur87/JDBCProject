package org.example.dao;

import java.sql.SQLException;

//Animal data access object clasa pentru a accesa date din animals
//manipulare structura baze de date (creare stergere tabel)
//manipulare date CRUD
public interface AnimalDao {

    //create table
    void createtable() throws SQLException;
    //adaugare date         CREATE animals

    //gasire date           READ animals
    //modificare date       UPDATE animals
    //stergere date         DELETE animals
    //sters total

    void dropTable() throws SQLException;

}
