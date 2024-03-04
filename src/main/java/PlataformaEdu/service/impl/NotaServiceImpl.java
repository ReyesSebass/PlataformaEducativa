package PlataformaEdu.service.impl;

import PlataformaEdu.dao.NotaDao;
import PlataformaEdu.domain.Nota;
import PlataformaEdu.servicee.NotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service


public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaDao notaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Nota> getNotas(boolean activos) {
        var lista = notaDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Nota getNota(Nota nota) {
        return notaDao.findById(nota.getIdNota()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Nota nota) {
        notaDao.save(nota);
    }

    @Override
    @Transactional
    public void delete(Nota nota) {
        notaDao.delete(nota);
    }
}