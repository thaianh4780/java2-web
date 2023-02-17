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
public class Product {
    private Integer ma;
    private String ten;
    private int gia;
    private String hinh;
    private String moTa;
    private int maDanhMuc;

    public Product(String ten, int gia, String hinh, String moTa, int maDanhMuc) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.moTa = moTa;
        this.maDanhMuc = maDanhMuc;
    }

    public Product(Integer ma, String ten, int gia, String hinh, String moTa, int maDanhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.moTa = moTa;
        this.maDanhMuc = maDanhMuc;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", hinh=" + hinh + ", moTa=" + moTa + ", maDanhMuc=" + maDanhMuc + '}';
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    
    
}
