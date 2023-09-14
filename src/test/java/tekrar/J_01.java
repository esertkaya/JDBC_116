package tekrar;

import java.sql.*;

public class J_01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Dogru surucuyu ekle
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Veritabani ile iletisimi baslat

        //URL: "jdbc:mysql://194.140.198.209/wonderworld_qa2";
        //USERNAME= "wonderworld_qawcollegeuser";
        //PASSWORD="1gvyfx6#Q";
        Connection connection= DriverManager.getConnection("jdbc:mysql://194.140.198.209/wonderworld_qa2",
                "wonderworld_qawcollegeuser","1gvyfx6#Q");

        //SQL sorgularini yonetebilmek icin suit hazirla
        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        //SQL sorgularini calistir, sonuc al, isle
        String query="SELECT * FROM wonderworld_qa2.staff";
        ResultSet resultSet= statement.executeQuery(query);
        resultSet.next();

        System.out.println(resultSet.getString("name"));
        resultSet.next();
        System.out.println(resultSet.getString("name"));
        resultSet.next();
        System.out.println(resultSet.getString("name"));



        resultSet.close();



    }
}
