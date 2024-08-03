package Testing;

import com.software.dao.TaiKhoanDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestLogin {

    TaiKhoanDAO Dao = new TaiKhoanDAO();

    @Test
    public void checkLogin1() {
        String user = "";
        String password = "";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Error null> " + e);
        }
    }

    @Test
    public void checkLogin2() {
        String user = "";
        String password = "abc";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Error null username> " + e);
        }
    }

    @Test
    public void checkLogin3() {
        String user = "abc";
        String password = "";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Error null password> " + e);
        }
    }

    @Test
    public void checkLogin4() {
        String user = "abc";
        String password = "12312312";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Error wrong username, password > " + e);
        }
    }

    @Test
    public void checkLogin5() {
        String user = "abc";
        String password = "0379967723";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("Error wrong username, correct password > " + e);
        }
    }

    @Test
    public void checkLogin6() {
        String user = "0379967723";
        String password = "312312";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("correct username, wrong password > " + e);
        }
    }

    @Test
    public void checkLogin7() {
        String user = "0379967723";
        String password = "0379967723";
        boolean expected = false;
        boolean actual = Dao.checkLogin(user, password) != null;
        try {
            Assertions.assertEquals(expected, actual);
        } catch (Throwable e) {
            System.out.println("correct username, passsword > " + e);
        }
    }
}
