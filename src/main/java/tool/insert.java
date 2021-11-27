package tool;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class insert {
    private int id;
    private String name = null;
    private  int sex;

    public void in(Connection con){
        try {
            String str2 = "insert into stuinfo values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(str2);
            pst.setInt(1,getId());
            pst.setString(2,getName());
            pst.setInt(3, getSex());
            pst.executeUpdate();
        }catch (Exception e) {
            System.out.print("Error loading Mysql Driver!");
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
