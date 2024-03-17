package PlataformaEdu.servicee;

import PlataformaEdu.domain.Profesor;
import java.util.List;

public interface ProfesorService {
  
    // Se obtiene un listado de categorias en un List
    public List<Profesor> getProfesores(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un categoria
    public Profesor getProfesor(Profesor profesor);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Profesor profesor);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Profesor profesor);
}
