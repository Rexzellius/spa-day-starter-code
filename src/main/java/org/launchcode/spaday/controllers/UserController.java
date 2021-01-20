package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/add")
    @GetMapping()
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("username", user.getUsername());
        if(user.getPassword().equals(verify)) {
            return "/user/index";
        }
        model.addAttribute("email", user.getEmail());
        model.addAttribute("error", "Passwords do not match");
        return "/user/add";
    }
}
