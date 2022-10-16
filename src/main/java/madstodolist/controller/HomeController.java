package madstodolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import madstodolist.model.Usuario;
import madstodolist.service.UsuarioService;
import madstodolist.authentication.ManagerUserSession;
import madstodolist.controller.exception.UsuarioNotFoundException;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

    //Añadimos el listado de usuario añadido antes en la clase de usuarioService
    @GetMapping("/listausuarios")
    public String listausuarios(Model model){
        List<Usuario> listadototalusuarios= usuarioService.listadoDeUsuarios();
        model.addAttribute("listausuarios", listadototalusuarios);
        return "listausuarios";
    }

}