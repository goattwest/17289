package mx.uv.listi._9.Saludar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class SaludarPlantilla {
    
    @GetMapping("/plantilla")
    public String plantilla(Model m){
        m.addAttribute("persona", "Default Name");
        return "xxx";
    }

    /*
     * Aca se saca el valor de {nombre} desde la url, se le asigna un valor de nombre desde el PathVariable
     * se le asigna ese nombre al modelo "persona" y por ultimo se manda a llamar en el 'xxx.html'
     */
    @GetMapping("/plantilla/{nombre}")
    public String plantilla2(@PathVariable String nombre, Model m){
        m.addAttribute("persona", nombre);
        return "xxx";
    }
}
