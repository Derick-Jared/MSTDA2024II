package TDB2024ii.MsSecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB2024ii.MsSecurity.models.UsuarioModel;
import TDB2024ii.MsSecurity.repositories.IUsuarioRepository;
@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    IUsuarioRepository repository;
    
    @Override
    public List<UsuarioModel> findAll() {
        return (List<UsuarioModel>) repository.findAll();
    }
    
    @Override
    public UsuarioModel findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public UsuarioModel add (UsuarioModel model) {
        return repository.save(model);
    }

    //la diferencia con el add es que el update recibe un id
    //UsuarioModel
    //nombre,apellido se manda solo estos dos
    //id,nombre,apellido se manda el id del usuario que se desea modificar y el nombre y apellido
    @Override
    public UsuarioModel update(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
         repository.deleteById(id);
         return true;
    }
    
    
}
