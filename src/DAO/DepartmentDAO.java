package DAO;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.*;
import java.util.Properties;


public class DepartmentDAO extends DAO {
    private String login="";
    private String password="";
    public DepartmentDAO( String login, String password) {
        super(login, password);
        this.login=login;
        this.password=password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public String DepartmentfindByID(String id){
        String resu="";
        //DAO d=new DAO("root","root");
        ResultSet res=null;
        Properties connectionProp=new Properties();
        connectionProp.put("user",this.login);
        connectionProp.put("password",this.password);
        String req="SELECT * FROM department WHERE idD=?";
        try {
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_jdbc", connectionProp);
            PreparedStatement pstm= (PreparedStatement) cn.prepareStatement(req);
            pstm.setString(1,id);
            res=pstm.executeQuery(req);
            ResultSetMetaData rs=res.getMetaData();
            int nbC=rs.getColumnCount();
            while (res.next()){
                for (int i=1;i<=nbC;i++) {
                    System.out.println(res.getString(i)+"   ");
                }
                System.out.println();
            }
            res.close();
            cn.close();
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println(e.getSQLState());
        }
        return resu;
    }
}
