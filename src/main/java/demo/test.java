package demo;

import tool.insert;
import org.junit.jupiter.api.Test;
import tool.load;

import java.sql.*;


public class test {
    load lo = new load();
    Connection con = lo.con;

    @Test
    public void insert(){
        insert in = new insert();
        in.setId(6);
        in.setName("小小丑");
        in.setSex(1);
        in.in(con);
        //这样可以吗
        //错了再来一次
        //？为什么不是另一个人
        //.....
    }
}
//这里是tianporangsuisusu查看的痕迹。