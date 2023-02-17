/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.dao;

import java.util.List;
import tdc.com.model.Account;
import tdc.com.model.Category;
import tdc.com.model.Product;

/**
 *
 * @author DELL
 */
public class TestChucNang {

    public static void main(String[] args) {
//        ProductDAO aO = new ProductDAO();
//
//        Product p = new Product(21, "sách văn lớp 10", 25000, "https://hieusach24h.com/wp-content/uploads/2021/09/Ngu-van-10-nang-cao-tap-1-1.jpg", "sách giáo khoa cấp 3", 1);
//
//        System.out.println(aO.update(p));

//        CategoryDAO categoryDAO = new CategoryDAO();
//        Category c = new Category("sách thiếu nhi", "sách cho trẻ em");
//        System.out.println(categoryDAO.save(c));
        
          AccountDAO accountDAO = new AccountDAO();
          Account a = new Account(10,"minha", "minh@mail", "123123", 0);
          System.out.println(accountDAO.getLimit(0, 4));
// System.out.println(accountDAO.getAll());
//
//          System.out.println(accountDAO.singUp("thanh", "thanh@ggg", "333"));
    }
}
