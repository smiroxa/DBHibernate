package dao;

import model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase
{
    Connection connection = null;
    Statement  statement  = null;
    ResultSet  resultSet  = null;

//    public DataBase()
//    {
//        this.DataBase("jdbcClassName", "dataBaseURL", "root", "root");
//    }

    public DataBase(String jdbcClassName, String dataBaseURL, String userLogin, String userPassword) throws Exception
    {
        Class.forName(jdbcClassName);
        this.connection = DriverManager.getConnection(dataBaseURL, userLogin, userPassword);
        this.statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        System.out.println("create instance class DB");
    }


    public ArrayList<Person> read() throws Exception {
        String sql = "SELECT id, fName, lName, age FROM Person";
        resultSet = executeRequest(sql);
        System.out.println("SELECT: " + resultSet);
        return new ArrayList<Person>();
    }


    private ResultSet executeRequest(String sqlQuery) throws Exception
    {
        try
        {
            resultSet = statement.executeQuery(sqlQuery);
        }
        catch (Exception e)
        {
            System.out.println("Не удалось выполнить SQL запрос. Ошибка: " + e.getMessage());
        }
        finally
        {
            return resultSet;
        }
    }

}
