package PlataformaEdu.dao;

import PlataformaEdu.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorDao extends JpaRepository<Profesor, Long>{
    
}
