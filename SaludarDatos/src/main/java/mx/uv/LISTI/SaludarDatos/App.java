package mx.uv.LISTI.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@RestController
public class App {
    
    @Autowired
    Isaludadores isaludadores;

    // RUTA GET: /saludos
    @RequestMapping(value ="/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> dameSaludados() {
        return isaludadores.findAll();
    }

    // RUTA POST: /saludos (Corregido: agregado la 's')
    @RequestMapping(value ="/saludos", method = RequestMethod.POST)
    public String crearSaludos(@RequestBody Saludadores nuevoSaludo) {
        isaludadores.save(nuevoSaludo);
        return "¡Guardado con éxito!";
    }
}