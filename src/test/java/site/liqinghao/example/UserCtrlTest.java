package site.liqinghao.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserCtrlTest {

    @Resource
    private UserCtrl ctrl;

    @Test
    void add() {
        var u = new User(10L, "白金之星", 1);
        var ru = ctrl.add(u);
        assertEquals(u, ru);
    }

    @Test
    void get() {
        var ru = ctrl.get(1L);
        var u = new User(1L, "JOJO", 18);
        assertEquals(ru, u);
    }
}