package PlataformaEdu.service.impl;

import PlataformaEdu.dao.ProfesorDao;
import PlataformaEdu.domain.Profesor;
import PlataformaEdu.servicee.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProfesorServiceImpl implements ProfesorService{
    
    @Autowired
    private ProfesorDao profesorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Profesor> getProfesores(boolean activos) {
        var lista = profesorDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Profesor getProfesor(Profesor profesor) {
        return profesorDao.findById(profesor.getIdProfesor()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Profesor profesor) {
        profesorDao.save(profesor);
    }
    
    @Override
    @Transactional
    public void delete(Profesor profesor) {
        profesorDao.delete(profesor);
    }
}
