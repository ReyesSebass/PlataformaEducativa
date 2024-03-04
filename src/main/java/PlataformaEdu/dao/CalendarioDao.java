
package PlataformaEdu.dao;



import PlataformaEdu.domain.Calendario;




import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CalendarioDao extends JpaRepository<Calendario, Long> {
    
}
