package DAO;

import java.util.ArrayList;

public class POJODepartment {
    public String idD;
    public String nameD;
    public String adressD;
    public ArrayList<POJOEmployee> listEmp=new ArrayList<>();

    public POJODepartment(String idD, String nameD, String adressD) {
        this.idD = idD;
        this.nameD = nameD;
        this.adressD = adressD;
    }

    public String getIdD() {
        return idD;
    }

    public void setIdD(String idD) {
        this.idD = idD;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getAdressD() {
        return adressD;
    }

    public void setAdressD(String adressD) {
        this.adressD = adressD;
    }
}
