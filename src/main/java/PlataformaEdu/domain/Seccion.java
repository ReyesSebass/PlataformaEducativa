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
@Table(name = "seccion")
public class Seccion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seccion")
    private Long idSeccion;
    private String numeroSeccion;
    private int grado;
    private int cantidadEstudiantes;
    private boolean activo;

    public Seccion() {
    }

    public Seccion(String numeroSeccion, int grado, int cantidadEstudiantes, boolean activo) {
        this.numeroSeccion = numeroSeccion;
        this.grado = grado;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.activo = activo;
    }
    
    
    
}
