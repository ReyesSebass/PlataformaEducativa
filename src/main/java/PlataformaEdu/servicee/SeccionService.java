package PlataformaEdu.servicee;

import PlataformaEdu.domain.Seccion;
import java.util.List;

public interface SeccionService {
    
    // Se obtiene un listado de categorias en un List
    public List<Seccion> getSecciones(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un categoria
    public Seccion getSeccion(Seccion seccion);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Seccion seccion);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Seccion seccion);
}
