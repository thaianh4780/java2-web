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
public class Category {
    private Integer ma;
    private String ten;
    private String ghiChu;

    public Category(Integer ma, String ten, String ghiChu) {
        this.ma = ma;
        this.ten = ten;
        this.ghiChu = ghiChu;
    }

    public Category(String ten, String ghiChu) {
        this.ten = ten;
        this.ghiChu = ghiChu;
    }

    public Category() {
    }

    @Override
    public String toString() {
        return "Category{" + "ma=" + ma + ", ten=" + ten + ", ghiChu=" + ghiChu + '}';
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

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
   
    
}
