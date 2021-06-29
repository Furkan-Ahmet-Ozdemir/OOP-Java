package Btk_33_JDBC_Intro;

import java.sql.*;
import java.util.ArrayList;

public class Btk_33 {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi.");
            System.out.println("result : "+result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Code,Name,Continent,Region FROM world.country where  region=\"Middle East\"");
            System.out.println("Bağlantı oluştu");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
//                System.out.println(resultSet.getString("name"));
//                System.out.println(" ");
//                System.out.print(resultSet.getString("Region"));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "insert into city(NAME,countrycode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"TURKEY");
            statement.setInt(4,70000);

            int result = statement.executeUpdate();
            System.out.println("Kayıt eklendi");
            System.out.println("resul : "+result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void updataData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update city set Population=100000,district='TUR' where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi.");
            System.out.println("result : "+result);

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


}
