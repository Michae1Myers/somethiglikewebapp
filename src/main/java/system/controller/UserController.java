package system.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //-- спринг на основе этой аннотации создаст контест (объект, к которому через контекст будет обращаться спринг
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody //responce что то даем клиенту на чего часть
    List<User> getAllUsers() { //название метода можно задать какое угодно, ничего общего с getAllUsers UserService & UserDao нет
        return userService.getAllUsers();// а возвращаем то, что возвращает userService
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("userspage");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody
    String checkUser(@ModelAttribute("userFromServer") User user) {
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())) {
            return "valid admin";
        } else return "not admin";

    }

}
