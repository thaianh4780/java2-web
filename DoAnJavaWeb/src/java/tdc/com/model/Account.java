/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.model;

/**
 *
 * @author DELL
 */
public class Account {
    private Integer ma;
    private String ten;
    private String email;
    private String matKhau;
    private int quyen;

    public Account(String ten, String email, String matKhau, int quyen) {
        this.ten = ten;
        this.email = email;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }

    @Override
    public String toString() {
        return "Account{" + "ma=" + ma + ", ten=" + ten + ", email=" + email + ", matKhau=" + matKhau + ", quyen=" + quyen + '}';
    }

    public Account(Integer ma, String ten, String email, String matKhau, int quyen) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.matKhau = matKhau;
        this.quyen = 1;
    }

    public Account() {
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }
    
}
