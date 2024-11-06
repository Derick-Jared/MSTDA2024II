package TDB2024ii.MsSecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB2024ii.MsSecurity.models.UsuarioModel;
import TDB2024ii.MsSecurity.services.UsuarioService;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@RestController
@RequestMapping("usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/getAll")
    public List<UsuarioModel> getAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/getById/{id}")
    public UsuarioModel getById(@PathVariable int id) {
        return usuarioService.findById(id);
    }
    
    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model) {
        return usuarioService.add(model);
    }

    @PutMapping("/update/{id}")
    public UsuarioModel update(@PathVariable int id, @RequestBody UsuarioModel model) {
        return usuarioService.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        boolean deleted = usuarioService.delete(id);
        if (deleted) {
            return "Usuario eliminado exitosamente.";
        } else {
            return "No se pudo eliminar el usuario.";
        }
    }


}
