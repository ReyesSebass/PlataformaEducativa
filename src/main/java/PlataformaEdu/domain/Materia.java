package PlataformaEdu.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "materia")
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Long idMateria;
    private String nombre;
    private int grado;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor idProfesor;

    public Materia() {
    }

    public Materia(String nombre, int grado, boolean activo) {
        this.nombre = nombre;
        this.grado = grado;
        this.activo = activo;
    }
}
