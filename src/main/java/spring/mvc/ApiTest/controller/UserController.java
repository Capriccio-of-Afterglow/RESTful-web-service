package spring.mvc.ApiTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.mvc.ApiTest.model.entity.User;

@RestController
public class UserController {
    
	@GetMapping("/main/user")
    public User getUser() {
        // 创建一个虚拟的用户对象
        User user = new User();
        user.setId(1);
        user.setName("John Doe");
        return user;
    }
	   @RequestMapping("/")
	    @ResponseBody
	    public String hello() {
	        return "向全世界說聲Spring Boot 很高興認識你!";
	    }
}
