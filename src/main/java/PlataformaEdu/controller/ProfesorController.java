package PlataformaEdu.controller;

import PlataformaEdu.domain.Profesor;
import PlataformaEdu.servicee.ProfesorService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/profesor")
public class ProfesorController {
    
    @Autowired
    private ProfesorService profesorService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Profesor> lista  = profesorService.getProfesores(false);
        model.addAttribute("profesor", lista);
        model.addAttribute("totalProfesores", lista.size());
        return "/profesor/listado";
    }
    
    @GetMapping("/nuevo")
    public String profesorNuevo(Profesor profesor) {
        return "/profesor/modifica";
    }
    
    @PostMapping("/guardar")
    public String profesorGuardar(Profesor profesor){
        profesorService.save(profesor);
        return "redirect:/profesor/listado";
    }
    
    @GetMapping("/eliminar/{idProfesor}")
    public String profesorEliminar(Profesor profesor) {
        profesorService.delete(profesor);
        return "redirect:/profesor/listado";
    }

    @GetMapping("/modificar/{idProfesor}")
    public String profesorModificar(Profesor profesor, Model model) {
        profesor = profesorService.getProfesor(profesor);
        model.addAttribute("profesor", profesor);
        return "/profesor/modifica";
    }
    
}
