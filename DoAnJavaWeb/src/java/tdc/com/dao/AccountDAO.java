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
import tdc.com.model.Account;

import tdc.com.util.DBConnectionUtil;

/**
 *
 * @author DELL
 */
public class AccountDAO {

    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;

    public List<Account> getAll() {
        List<Account> list = null;
        Account account = null;
        try {
            list = new ArrayList<Account>();
            String sql = "SELECT * FROM account";
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                account = new Account();
                account.setMa(resultSet.getInt("ma"));
                account.setTen(resultSet.getString("ten"));
                account.setEmail(resultSet.getString("email"));
                account.setMatKhau(resultSet.getString("matkhau"));
                account.setQuyen(resultSet.getInt("quyen"));
                list.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public List<Account> getLimit(int start, int accountPerPage) {
        List<Account> list = null;
        Account account = null;
        try {
            list = new ArrayList<Account>();
            String sql = "SELECT * FROM account LIMIT ?, ?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, accountPerPage);
          
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                account = new Account();
                account.setMa(resultSet.getInt("ma"));
                account.setTen(resultSet.getString("ten"));
                account.setEmail(resultSet.getString("email"));
                account.setMatKhau(resultSet.getString("matkhau"));
                account.setQuyen(resultSet.getInt("quyen"));
                list.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    public Account get(int ma) {
        Account account = null;
        try {
            account = new Account();
            String sql = "SELECT * FROM account where ma=" + ma;
            connection = DBConnectionUtil.openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {

                account.setMa(resultSet.getInt("ma"));
                account.setTen(resultSet.getString("ten"));
                account.setEmail(resultSet.getString("email"));
                account.setMatKhau(resultSet.getString("matkhau"));
                account.setQuyen(resultSet.getInt("quyen"));
            }
        } catch (SQLException q) {
            q.printStackTrace();
        }
        return account;
    }

    public boolean delete(int ma) {
        boolean flag = false;
        try {
            String sql = "DELETE FROM account where ma=" + ma;
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }

    public boolean update(Account account) {
        boolean flag = false;
        try {
            String sql = "UPDATE account SET ten = ?, email = ?, matkhau = ? where ma=" + account.getMa();
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getTen());
            preparedStatement.setString(2, account.getEmail());
            preparedStatement.setString(3, account.getMatKhau());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }

    public Account login(String username, String password) {
        Account account = null;
        try {
            String sql = "SELECT * FROM `account` WHERE ten = ? AND matkhau =?";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                account = new Account();
                account.setMa(resultSet.getInt("ma"));
                account.setTen(resultSet.getString("ten"));
                account.setEmail(resultSet.getString("email"));
                account.setMatKhau(resultSet.getString("matkhau"));
                account.setQuyen(resultSet.getInt("quyen"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public Boolean singUp(String username, String password, String email) {
        boolean flag = false;
        try {
            String sql = "INSERT INTO account(ten,email,matkhau,quyen) VALUES(?, ?,?,'1')";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean checkUserNameAccount(String username) {
        boolean flag = false;
        try {
            String sql = "SELECT * FROM `account` WHERE ten = ? ";
            connection = DBConnectionUtil.openConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }
}
