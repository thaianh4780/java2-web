/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tdc.com.model.Category;
import tdc.com.model.Product;
import tdc.com.util.DBConnectionUtil;

/**
 *
 * @author DELL
 */
public class ProductDAO {

    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    private int noOfRecords =0;

    public List<Product> getAll() {
        List<Product> list = null;
        Product product = null;

        try {
            list = new ArrayList<Product>();
            String sql = "SELECT * FROM product";
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                product = new Product();
                product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> get(int start, int sachPerPage) {
        List<Product> list = null;
        Product product = null;

        try {
            list = new ArrayList<Product>();
            String sql = "SELECT * FROM product LIMIT ?, ?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, sachPerPage);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                 product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
                list.add(product);
            }
            resultSet.close();
            resultSet = connection.createStatement().executeQuery("select * from product");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select FOUND_ROWS()");
            if (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

   public List<Product> getSearch(String key) {
         List<Product> list = null;
        Product product = null;

        try {
            list = new ArrayList<Product>();
            String sql = "SELECT * FROM product where ten like ?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%"+key+"%");
           
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Product get(int id) {
        Product product = null;
        try {
            product = new Product();
            String sql = "SELECT * FROM product where ma=" + id;
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
            }
        } catch (SQLException q) {
            q.printStackTrace();
        }
        return product;
    }

    public boolean save(Product p) {
        boolean flag = false;
        try {
            String sql = "INSERT INTO product(ten, gia, hinh, mota, madanhmuc) VALUES(?, ?, ?, ?,?)";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, p.getTen());
            preparedStatement.setInt(2, p.getGia());
            preparedStatement.setString(3, p.getHinh());
            preparedStatement.setString(4, p.getMoTa());
            preparedStatement.setInt(5, p.getMaDanhMuc());
             preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public boolean delete(int id) {
        boolean flag = false;
        try {
            String sql = "DELETE FROM product where ma=" + id;
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }

    public boolean update(Product p) {
        boolean flag = false;
        try {
             String sql = "UPDATE product SET ten = ?, gia = ?, hinh = ?, mota = ?, madanhmuc = ? WHERE ma = ?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, p.getTen());
            preparedStatement.setInt(2, p.getGia());
            preparedStatement.setString(3, p.getHinh());
            preparedStatement.setString(4, p.getMoTa());
            preparedStatement.setInt(5, p.getMaDanhMuc());
            preparedStatement.setInt(6, p.getMa());
             preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
//
    }
     public List<Product> getProductByCategory(int ma ,int start, int sachPerPage) {
        List<Product> list = null;
        Product product = null;

        try {
            list = new ArrayList<Product>();
            String sql = "SELECT * FROM product where madanhmuc = ? LIMIT ?, ?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ma);
            preparedStatement.setInt(2, start);
            preparedStatement.setInt(3, sachPerPage);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                 product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
                list.add(product);
            }
            resultSet.close();
            resultSet = connection.createStatement().executeQuery("select * from product");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select FOUND_ROWS()");
            if (resultSet.next()) {
                noOfRecords = resultSet.getInt(1);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> getByCategory(int ma) {
        List<Product> list = null;
        Product product = null;

        try {
            list = new ArrayList<Product>();
            String sql = "SELECT * FROM product where madanhmuc=" + ma;
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                product = new Product();
                 product.setMa(resultSet.getInt("ma"));
                product.setTen(resultSet.getString("ten"));
                product.setGia(resultSet.getInt("gia"));
                product.setHinh(resultSet.getString("hinh"));
                product.setMoTa(resultSet.getString("mota"));
                product.setMaDanhMuc(resultSet.getInt("madanhmuc"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }

    public void setNoOfRecords(int noOfRecords) {
        this.noOfRecords = noOfRecords;
    }
    
}
