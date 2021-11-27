package tool;

import java.sql.*;

public class load {
    public Connection con;
    public  load(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/编程能力提升作业1","root","yyd2394824914");
            System.out.println("成功连接");
        }catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
    }
}
