package PlataformaEdu.controller;

import PlataformaEdu.domain.Seccion;
import PlataformaEdu.servicee.SeccionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/seccion")
public class SeccionController {

    @Autowired
    private SeccionService seccionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var secciones = seccionService.getSecciones(false);
        model.addAttribute("secciones", secciones);
        model.addAttribute("totalSecciones", secciones.size());
        return "/seccion/listado";
    }

    @GetMapping("/nuevo")
    public String seccionNuevo(Seccion seccion) {
        return "/seccion/modifica";
    }

    @PostMapping("/guardar")
    public String seccionGuardar(Seccion seccion) {
        seccionService.save(seccion);
        return "redirect:/seccion/listado";
    }

    @GetMapping("/eliminar/{idSeccion}")
    public String seccionEliminar(Seccion seccion) {
        seccionService.delete(seccion);
        return "redirect:/seccion/listado";
    }

    @GetMapping("/modificar/{idSeccion}")
    public String seccionModificar(Seccion seccion, Model model) {
        seccion = seccionService.getSeccion(seccion);
        model.addAttribute("seccion", seccion);
        return "/seccion/modifica";
    }

}
