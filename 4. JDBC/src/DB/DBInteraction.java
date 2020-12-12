package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBInteraction implements DBInterface {

    @Override
    public int allCountCity() {

        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

        try{
            Class.forName(JDBC_DRIVER);
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC","root","alex");
            PreparedStatement pstmt = null;
            String sql = "SELECT * FROM world.city";
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            rs.close();
            pstmt.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public int popGreaterThen5X() {

        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

        try{
            Class.forName(JDBC_DRIVER);
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC","root","alex");
            PreparedStatement pstmt = null;
            String sql = "SELECT * FROM world.city WHERE Population > 5000000";
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            rs.close();
            pstmt.close();
        }catch(Exception e){
            System.out.println(e);
        }

        return 0;
    }
}
