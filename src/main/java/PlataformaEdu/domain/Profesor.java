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
@Table(name = "profesor")
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long idProfesor;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private int edad;
    private String correo;
    private int telefono;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    Materia materia;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, int edad, String correo, int telefono, boolean activo, Materia materia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
        this.materia = materia;
    }
}
