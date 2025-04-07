package com.declercq.messagie.formulaire;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @GetMapping("/login")
    public String getUser(User user) {
        return "login";
    }


    @PostMapping("/loginSubmit")
    public String loginSubmit( User user, RedirectAttributes redirect) {
        System.out.println("/loginSubmit : " + user.getLogin() + " " + user.getPassword());

        try {
            if (user.getLogin().trim().isEmpty()) {
                throw new Exception("Login manquant");
            }
            //Cas qui marche
            redirect.addFlashAttribute("user", user);
            return "redirect:userRegister";// Redirection sur /userRegister
        } catch (Exception e) {
            e.printStackTrace();

            //Cas d'erreur
            redirect.addFlashAttribute("errorMessage", e.getMessage());
            redirect.addFlashAttribute("userBean", user);

            return "redirect:login"; //Redirige sur /login
        }
    }


    @GetMapping("/userRegister") //Affiche la page résultat
    public String userRegister(User User) {
        System.out.println("/userRegister");
        return "userRegister";  //Lance userRegister.html
    }
}
