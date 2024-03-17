package PlataformaEdu.dao;

import PlataformaEdu.domain.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaDao extends JpaRepository<Materia, Long>{
    
}
