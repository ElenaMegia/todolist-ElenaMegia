package madstodolist.controller;

import madstodolist.controller.exception.UsuarioNoLogeadoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import madstodolist.model.Usuario;
import madstodolist.service.UsuarioService;
import madstodolist.authentication.ManagerUserSession;

import javax.servlet.http.HttpSession;
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
    @GetMapping("/usuarios")
    public String usuarios(Model model){
        List<Usuario> listadototalusuarios= usuarioService.listadoDeUsuarios();
        model.addAttribute("usuarios", listadototalusuarios);
        return "usuarios";
    }

    @GetMapping("/usuarios/{id}")
    public String desciprcionUsuario(@PathVariable(value = "id") Long idUser, Model model, HttpSession httpSession){
        Usuario usuario=usuarioService.findById(idUser);
        if(usuario==null){
            throw new UsuarioNoLogeadoException();
        }else{
            model.addAttribute("usuario", usuario);
        }
        return "desciprcionUsuario";
    }

}