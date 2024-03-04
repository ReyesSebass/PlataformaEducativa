
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
@Table(name="nota")
public class Nota implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNota")
    
    private Long idNota;
    private String Nombre;
    private double tareas; 
    private double proyecto; 
    private double examen; 
    private double notaFinal;
  
    
    
    public Nota(){
    
        
    } 

    public Nota(String Nombre, double tareas, double proyecto, double examen, double notaFinal) {
        this.Nombre = Nombre;
        this.tareas = tareas;
        this.proyecto = proyecto;
        this.examen = examen;
        this.notaFinal = notaFinal;
    } }    

   

