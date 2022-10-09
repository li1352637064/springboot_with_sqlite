package site.liqinghao.example;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class UserCtrl {

    @Resource
    private  UserMapper userMp;

    @PutMapping("/")
    public User add(@RequestBody User user) {
        userMp.insert(user);
        return user;
    }
    @GetMapping("/")
    public User get(@RequestParam Long id) {
        return userMp.selectById(id);
    }
}
