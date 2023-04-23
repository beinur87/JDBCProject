package org.example.dao;

import org.example.model.Food;

import java.sql.*;

public class FoodImpl implements FoodDao{
    private final Connection connection;

    public FoodImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createtable() throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        statement.execute("create table if not exists food (" +
                "id integer auto_increment, " +
                "name varchar(100), " +
                "description varchar(100)," +
                "calories_per_100 integer, " +
                "expiration_date date, " +
                "primary key (id) )");

    }

    @Override
    public void create(Food food) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into food (name, description, calories_per_100, expiration_date) values (?, ?, ?, ?)"
        );
        preparedStatement.setString(1, food.getName());
        preparedStatement.setString(2, food.getDescription());
        preparedStatement.setInt(3, food.getCalories_per_100());
        preparedStatement.setDate(4, food.getExpiration_date());
        preparedStatement.execute();
    }

    @Override
    public void dropTable() throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        statement.execute("drop table food");
    }
}
