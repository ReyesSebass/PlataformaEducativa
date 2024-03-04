
package PlataformaEdu.dao;



import PlataformaEdu.domain.Nota;



import org.springframework.data.jpa.repository.JpaRepository;
 
public interface NotaDao extends JpaRepository<Nota, Long> {
    
}
