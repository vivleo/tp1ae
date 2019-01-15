package DAO;

import com.mysql.jdbc.Connection;

import java.sql.*;
import java.util.Properties;

public class DAO {
    private String url;
    private String login;
    private String password;
    protected Connection cn;

    public DAO(String login, String password) {
        this.login = login;
        this.password = password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de charger le pilote com.mysql.jdbc.Driver");
        }
        Properties connectionProp=new Properties();
        connectionProp.put("user",login);
        connectionProp.put("password",password);
        ResultSet res=null;
        String req="SELECT * FROM department";
        try {
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_jdbc", connectionProp);
            Statement stm=cn.createStatement();
            res=stm.executeQuery(req);
            ResultSetMetaData rs=res.getMetaData();
            int nbC=rs.getColumnCount();
            while (res.next()){
                for (int i=1;i<=nbC;i++) {
                    System.out.println(res.getString(i)+"   ");
                }
                System.out.println();
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println(e.getSQLState());
        }
    }

}
