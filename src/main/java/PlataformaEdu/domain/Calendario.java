
package PlataformaEdu.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="calendario")
public class Calendario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCalendario")
    
    private Long idCalendario;
    private String titulo;
    private String fechaHoraInicio; 
    private String fechaHoraFin; 
    private String Comentario; 
 
  
    
    
    public Calendario(){
    
        
    } 

    public Calendario(String titulo, String fechaHoraInicio, String fechaHoraFin, String Comentario) {
        this.titulo = titulo;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.Comentario = Comentario;
    }

     }    

   

