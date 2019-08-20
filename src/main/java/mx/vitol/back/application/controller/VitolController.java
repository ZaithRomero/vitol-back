package mx.vitol.back.application.controller;

import mx.vitol.back.application.model.Usrs;
import mx.vitol.back.application.repository.VitolRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("*")
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class VitolController {

    @Autowired
    private VitolRepositoryImpl vitolRepository;

    @GetMapping("/prueba")
    public String prueba()
    {
    return "Prueba";
    }

    @PostMapping("/registro")
    public boolean saveUsers(@RequestBody Usrs users) {
    boolean respuesta;
       respuesta = vitolRepository.save(users);

       if(respuesta != true)
       {
           return false;
       } else
       {
           return true;
       }
    }
}
