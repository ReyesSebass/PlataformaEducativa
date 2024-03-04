package PlataformaEdu.controller;

import PlataformaEdu.domain.Nota;
import PlataformaEdu.servicee.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;



@Controller
@RequestMapping("/nota")
public class NotaController {
    
    @Autowired
    NotaService notaService;
     @GetMapping("/listado")
    public String listado(Model model) {
        List<Nota> lista = notaService.getNotas(false);
        model.addAttribute("notas", lista);
        model.addAttribute("totalNotas", lista.size());
        return "/nota/listado";
    }
 
     @GetMapping("/nuevo")
    public String notaNuevo(Nota nota) {
        return "/nota/modifica";
    }

  
    
    @PostMapping("/guardar")
   public String notaGuardar(Nota nota) {
        notaService.save(nota);
        return "redirect:/nota/listado";
    }
  
  

    @GetMapping("/modificar/{idNota}")
    public String notaModificar(Nota nota, Model model) {
        nota = notaService.getNota(nota);
        model.addAttribute("nota", nota);
        return "/nota/modifica";
    }
}

