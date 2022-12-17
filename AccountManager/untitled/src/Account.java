import java.util.Scanner;

public class Account {
    private String stk;       // Attributes
    private String tenTK;
    private double soTien;

    public Account () {         // Constructor no parameters
    }
    public Account(String stk, String tenTK, double soTien) {    // Constructor have parameters
        this.stk = stk;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    //TODO getter and setter for class Account

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    //TODO add method toString


    @Override
    public String toString() {
        return "Account{" +
                "stk='" + stk + '\'' +
                ", tenTK='" + tenTK + '\'' +
                ", soTien=" + soTien +
                '}';
    }
}
