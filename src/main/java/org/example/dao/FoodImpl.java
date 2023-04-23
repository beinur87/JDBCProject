package org.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FoodImpl implements FoodDao{
    private final Connection connection;

    public FoodImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createtable() throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        statement.execute("create table food (" +
                "id integer auto_increment, " +
                "name varchar(100), " +
                "description varchar(100)," +
                "calories_per_100 integer, " +
                "expiration_date date, " +
                "primary key (id) )");

    }

    @Override
    public void dropTable() throws SQLException {

    }
}
