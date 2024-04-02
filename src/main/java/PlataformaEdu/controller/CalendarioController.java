package PlataformaEdu.controller;

import PlataformaEdu.domain.Calendario;
import PlataformaEdu.servicee.CalendarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



@Controller
@RequestMapping("/calendario")
public class CalendarioController {
    
    @Autowired
    CalendarioService calendarioService;
    
    @GetMapping("/listado")
    public String page(Model model) {
        List<Calendario> lista = calendarioService.getCalendarios(false);
        model.addAttribute("calendarios", lista);
        model.addAttribute("totalCalendarios, lista.size()");
        return "/calendario/listado";
    }
     @GetMapping("/nuevo")
    public String calendarioNuevo(Calendario calendario) {
        return "/calendario/modifica";
    }
    
    
    @PostMapping("/guardar")
    public String calendarioGuardar(Calendario calendario,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        
        calendarioService.save(calendario);
        return "redirect:/calendario/listado";
    }

    @GetMapping("/eliminar/{idCalendario}")
    public String calendarioEliminar(Calendario calendario) {
        calendarioService.delete(calendario);
        return "redirect:/calendario/listado";
    }

    @GetMapping("/modificar/{idCalendario}")
    public String calendarioModificar(Calendario calendario, Model model) {
        calendario = calendarioService.getCalendario(calendario);
        model.addAttribute("calendario", calendario);
        return "/calendario/modifica";
    }
}

