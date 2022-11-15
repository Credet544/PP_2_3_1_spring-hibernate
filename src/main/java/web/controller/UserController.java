package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/")
    public String showAllUsers(Model model){
        List<User> users = userDao.getAllUsers();
        model.addAttribute("allUsers", users);
        return "all-users";
    }
}
