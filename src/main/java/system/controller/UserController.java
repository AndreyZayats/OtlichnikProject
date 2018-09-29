package system.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/registration")
    public ModelAndView registrationForm(ModelAndView modelAndView) {
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("register_user");
        return modelAndView;
    }

    @PostMapping(value = "/registration")
    public String registerUser(@ModelAttribute("userFromServer") User user, BindingResult result) {
        userService.saveUser(user);
        return "register_user";
    }
}
