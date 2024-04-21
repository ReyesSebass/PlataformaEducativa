package PlataformaEdu.service.impl;

import PlataformaEdu.dao.RolDAO;
import PlataformaEdu.dao.UsuarioDAO;
import PlataformaEdu.domain.Rol;
import PlataformaEdu.domain.Usuario;
import PlataformaEdu.servicee.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;
    @Autowired
    private RolDAO rolDAO;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> getUsuarios() {
        return usuarioDAO.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDAO.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario getUsuarioPorUsername(String username) {
        return usuarioDAO.findByUsername(username);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario getUsuarioPorUsernameYPassword(String username, String password) {
        return usuarioDAO.findByUsernameAndPassword(username, password);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo) {
        return usuarioDAO.findByUsernameOrCorreo(username, correo);
    }

    @Transactional(readOnly = true)
    @Override
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo) {
        return usuarioDAO.existsByUsernameOrCorreo(username, correo);
    }

    @Transactional
    @Override
    public void save(Usuario usuario, boolean crearRolUser) {
        usuario = usuarioDAO.save(usuario);
        if (crearRolUser) {  //Si se está creando el usuario, se crea el rol por defecto "USER"
            Rol rol = new Rol();
            rol.setNombre("ROLE_USER");
            rol.setIdUsuario(usuario.getIdUsuario());
            rolDAO.save(rol);
        }
    }

    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDAO.delete(usuario);
    }
}
