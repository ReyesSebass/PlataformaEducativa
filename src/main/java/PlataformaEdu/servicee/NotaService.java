package PlataformaEdu.servicee;

import PlataformaEdu.domain.Nota;


import java.util.List;

public interface NotaService {
    
  // Se obtiene un listado de notas en un List
    public List<Nota> getNotas(boolean activos);
    
   // Se obtiene un Nota, a partir del id de un nota
    public Nota getNota(Nota nota);
    
    // Se inserta un nuevo nota si el id del nota esta vacío
    // Se actualiza un nota si el id del nota NO esta vacío
    public void save(Nota nota);
    
    // Se elimina el nota que tiene el id pasado por parámetro
    public void delete(Nota nota);

    
}