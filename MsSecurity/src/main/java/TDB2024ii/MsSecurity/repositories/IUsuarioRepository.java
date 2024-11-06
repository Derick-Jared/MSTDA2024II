package TDB2024ii.MsSecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TDB2024ii.MsSecurity.models.UsuarioModel;

@Repository                                                 // entidad,tipo de dato id
public interface IUsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
    
}

