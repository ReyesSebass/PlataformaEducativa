package PlataformaEdu.controller;

import PlataformaEdu.domain.Usuario;
import PlataformaEdu.servicee.UsuarioService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventanaEst")
public class VentanaEstController {

    @GetMapping("/listado")
    public String inicio(Model model) {
        return "/ventanaEst/listado";
    }

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/calendario")
    public String mostrarCalendario(Model model) {
        return "/ventanaEst/calendario";
    }

    @GetMapping("/cursos")
    public String mostrarCursos(Model model) {
        return "/ventanaEst/cursos";
    }

    @GetMapping("/calificaciones")
    public String mostrarCalificaciones(Model model) {
        return "/ventanaEst/calificaciones";
    }
}
