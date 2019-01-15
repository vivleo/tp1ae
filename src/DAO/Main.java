package DAO;

public class Main {
    public static void main(String[] args) {
        //DAO dao=new DAO("root","root");
        DepartmentDAO dDA=new DepartmentDAO("root","root");
        String resu=dDA.DepartmentfindByID("1");
    }
}
