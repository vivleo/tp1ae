package DAO;

public class POJOEmployee {
    public String idE;
    public String firstNameE;
    public String lastNameE;
    public String roleE;
    public POJODepartment dpmt;

    public POJOEmployee(String idE, String firstNameE, String lastNameE, String roleE) {
        this.idE = idE;
        this.firstNameE = firstNameE;
        this.lastNameE = lastNameE;
        this.roleE = roleE;
    }

    public String getIdE() {
        return idE;
    }

    public void setIdE(String idE) {
        this.idE = idE;
    }

    public String getFirstNameE() {
        return firstNameE;
    }

    public void setFirstNameE(String firstNameE) {
        this.firstNameE = firstNameE;
    }

    public String getLastNameE() {
        return lastNameE;
    }

    public void setLastNameE(String lastNameE) {
        this.lastNameE = lastNameE;
    }

    public String getRoleE() {
        return roleE;
    }

    public void setRoleE(String roleE) {
        this.roleE = roleE;
    }
}
