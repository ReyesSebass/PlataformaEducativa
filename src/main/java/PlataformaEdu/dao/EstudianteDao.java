package PlataformaEdu.dao;

import PlataformaEdu.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDao extends JpaRepository<Estudiante, Long>{
    
}
