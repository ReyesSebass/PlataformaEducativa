package PlataformaEdu.controller;

import PlataformaEdu.domain.Materia;
import PlataformaEdu.servicee.MateriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/materia")
public class MateriaController {
    
    @Autowired
    private MateriaService materiaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var materias = materiaService.getMaterias(false);
        model.addAttribute("materias", materias);
        model.addAttribute("totalMateriaes", materias.size());
        return "/materia/listado";
    }
    
    @GetMapping("/nuevo")
    public String materiaNuevo(Materia materia) {
        return "/materia/modifica";
    }
    
    @PostMapping("/guardar")
    public String materiaGuardar(Materia materia){
        materiaService.save(materia);
        return "redirect:/materia/listado";
    }
    
    @GetMapping("/eliminar/{idMateria}")
    public String materiaEliminar(Materia materia) {
        materiaService.delete(materia);
        return "redirect:/materia/listado";
    }

    @GetMapping("/modificar/{idMateria}")
    public String materiaModificar(Materia materia, Model model) {
        materia = materiaService.getMateria(materia);
        model.addAttribute("materia", materia);
        return "/materia/modifica";
    }
    
}
