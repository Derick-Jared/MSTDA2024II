package TDB2024ii.MsSecurity.services;

import java.util.List;

import TDB2024ii.MsSecurity.models.UsuarioModel;

public interface IUsuarioService {

    public List<UsuarioModel> findAll ();
    public UsuarioModel findById (int id);
    public UsuarioModel add (UsuarioModel model);
    public UsuarioModel update (UsuarioModel model);
    public boolean delete (int id);
    

} 
