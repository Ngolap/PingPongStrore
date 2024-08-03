/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.software.dao;

import com.software.entity.TaiKhoan;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author larry
 */
public class TaiKhoanDAOTest {
    
    public TaiKhoanDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkLogin method, of class TaiKhoanDAO.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String user = "";
        String password = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.checkLogin(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class TaiKhoanDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        TaiKhoan entity = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TaiKhoanDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        TaiKhoan entity = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class TaiKhoanDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String ID = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.delete(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectByID method, of class TaiKhoanDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("SelectByID");
        String ID = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.SelectByID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectAll method, of class TaiKhoanDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("SelectAll");
        TaiKhoanDAO instance = new TaiKhoanDAO();
        List<TaiKhoan> expResult = null;
        List<TaiKhoan> result = instance.SelectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectBySQL method, of class TaiKhoanDAO.
     */
    @Test
    public void testSelectBySQL() {
        System.out.println("SelectBySQL");
        String sql = "";
        Object[] args = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        List<TaiKhoan> expResult = null;
        List<TaiKhoan> result = instance.SelectBySQL(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePass method, of class TaiKhoanDAO.
     */
    @Test
    public void testUpdatePass() {
        System.out.println("updatePass");
        String pass = "";
        String soDienThoai = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.updatePass(pass, soDienThoai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
