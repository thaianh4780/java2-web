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
public class CategoryDAO {

    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;

    public List<Category> getAll() {
        List<Category> list = null;
        Category dm = null;
        try {
            list = new ArrayList<Category>();
            String sql = "SELECT * FROM category";
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                dm = new Category();
                dm.setMa(resultSet.getInt("ma"));
                dm.setTen(resultSet.getString("ten"));
                dm.setGhiChu(resultSet.getString("ghichu"));

                list.add(dm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public Category get(int ma) {
        Category dm = null;
        try {
            dm = new Category();
            String sql = "SELECT * FROM category where ma=" + ma;
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                dm.setMa(resultSet.getInt("ma"));
                dm.setTen(resultSet.getString("ten"));
                dm.setGhiChu(resultSet.getString("ghichu"));
            }
        } catch (SQLException q) {
            q.printStackTrace();
        }
        return dm;
    }

    public boolean save(Category dm) {
        boolean flag = false;
        try {
            String sql = "INSERT INTO category(ten, ghichu)VALUES(?, ?)";

            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dm.getTen());
            preparedStatement.setString(2, dm.getGhiChu());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return flag;

    }

    public boolean delete(int ma) {
        boolean flag = false;
        try {
            String sql = "DELETE FROM category where ma=" + ma;
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }

    public boolean update(Category dm) {
        boolean flag = false;
        try {
            String sql = "UPDATE category SET ten = ?, ghichu = ? where ma=" + dm.getMa();
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dm.getTen());
            preparedStatement.setString(2, dm.getGhiChu());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }
}
