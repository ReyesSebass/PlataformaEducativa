package PlataformaEdu.servicee;

import PlataformaEdu.domain.Materia;
import java.util.List;

public interface MateriaService {
   
    // Se obtiene un listado de categorias en un List
    public List<Materia> getMaterias(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un categoria
    public Materia getMateria(Materia materia);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Materia materia);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Materia materia);
    
}
