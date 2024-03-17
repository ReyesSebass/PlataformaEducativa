package PlataformaEdu.servicee;

import PlataformaEdu.domain.Estudiante;
import java.util.List;

public interface EstudianteService {
   
    // Se obtiene un listado de categorias en un List
    public List<Estudiante> getEstudiantes(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un categoria
    public Estudiante getEstudiante(Estudiante estudiante);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Estudiante estudiante);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Estudiante estudiante);
}
