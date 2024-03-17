package PlataformaEdu.service.impl;

import PlataformaEdu.dao.SeccionDao;
import PlataformaEdu.domain.Seccion;
import PlataformaEdu.servicee.SeccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeccionServiceImpl implements SeccionService{
    
    @Autowired
    private SeccionDao seccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Seccion> getSecciones(boolean activos) {
        var lista = seccionDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Seccion getSeccion(Seccion seccion) {
        return seccionDao.findById(seccion.getIdSeccion()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Seccion seccion) {
        seccionDao.save(seccion);
    }
    
    @Override
    @Transactional
    public void delete(Seccion seccion) {
        seccionDao.delete(seccion);
    }
}
