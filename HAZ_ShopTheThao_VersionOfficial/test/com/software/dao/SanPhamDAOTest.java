/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.software.dao;

import com.software.entity.SanPham;
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
public class SanPhamDAOTest {
    
    public SanPhamDAOTest() {
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
     * Test of insert method, of class SanPhamDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        SanPham entity = null;
        SanPhamDAO instance = new SanPhamDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class SanPhamDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        SanPham entity = null;
        SanPhamDAO instance = new SanPhamDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SanPhamDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String ID = "";
        SanPhamDAO instance = new SanPhamDAO();
        instance.delete(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectByID method, of class SanPhamDAO.
     */
    @Test
    public void testSelectByID() {
        System.out.println("SelectByID");
        String ID = "";
        SanPhamDAO instance = new SanPhamDAO();
        SanPham expResult = null;
        SanPham result = instance.SelectByID(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectAll method, of class SanPhamDAO.
     */
    @Test
    public void testSelectAll() {
        System.out.println("SelectAll");
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.SelectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectBySQL method, of class SanPhamDAO.
     */
    @Test
    public void testSelectBySQL() {
        System.out.println("SelectBySQL");
        String sql = "";
        Object[] args = null;
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.SelectBySQL(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByKeyWord method, of class SanPhamDAO.
     */
    @Test
    public void testSelectByKeyWord() {
        System.out.println("selectByKeyWord");
        String keyword = "";
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.selectByKeyWord(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectByIDS method, of class SanPhamDAO.
     */
    @Test
    public void testSelectByIDS() {
        System.out.println("SelectByIDS");
        String ID = "";
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.SelectByIDS(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SelectSanPhamDangKinhDoanh method, of class SanPhamDAO.
     */
    @Test
    public void testSelectSanPhamDangKinhDoanh() {
        System.out.println("SelectSanPhamDangKinhDoanh");
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.SelectSanPhamDangKinhDoanh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectBySanPhamInHoaDon method, of class SanPhamDAO.
     */
    @Test
    public void testSelectBySanPhamInHoaDon() {
        System.out.println("selectBySanPhamInHoaDon");
        String maSP = "";
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.selectBySanPhamInHoaDon(maSP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
