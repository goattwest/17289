package mx.uv.listi._9.Saludar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; 

@CrossOrigin(origins = "*")
@RestController
public class SaludarControlador{
    Saludador s;
    @RequestMapping("/")
    public String home(){
        return "<ul><li><a href='/altas'>altas</li><li><a href='/baja'>baja</li><li><a href='/consulta'>consulta</li><li><a href='/cambio'>cambio</li><ul>";
    }


    @RequestMapping("/alta")
    public String altas(){
        return  "Altaaaaaa";
    }

    @RequestMapping("/baja")
    public String bajas(){
        return "BajaA";
    }

    @RequestMapping("/consulta")
    public String consultas(){
        return "COnsulta";
    }

    @RequestMapping("/cambio")
    public String cambios(){
        return "cambio";
    }
    
    //buenos

    @RequestMapping(value = "/altas", method = RequestMethod.POST)
    public String altasREST(){
        return  "Alta";
    }

    @RequestMapping(value = "/bajas", method = RequestMethod.DELETE)
    public String bajasREST(){
        return "Baja";
    }

    @RequestMapping(value = "/consultas", method = RequestMethod.PUT)
    public String consultasREST(){
        return "COnsulta";
    }

    @RequestMapping(value = "/cambios", method = RequestMethod.GET)
    public String cambiosREST(){
        return "cambio";
    }

    //otros
    @GetMapping(value = {"/saludar1", "/saludar1/{nombre}"})
    public Saludador saludarPath1(@PathVariable(required = false) String nombre){
        if (nombre != null){
            return new Saludador(nombre);
        }
        else {
            return new Saludador("Valor por default");
        }
    }

    // recepción de parametros estructurados 
    @PostMapping("/CrearSaludo")
    public String crearSaludo(@RequestBody Saludador parametro){
        Saludador saludador = new Saludador(null);
        return "";
    }

    // Recepción de parametros estructurados
    @PostMapping("/crearsaludo")
    public String saludoCrear(@RequestBody Saludador parametro){
        //Saludador saludador = new Saludador (null);
        s = parametro;
        System.out.println(parametro.getContenido());
        return "éxito";
    }

    @GetMapping("/obtenersaludo")
    public Saludador saludoObtener(){
        return s;
    }   

    /** 
    @GetMapping("/saludar1")
    public String saludarPath1(){
        return "xxx";
    }
    */

   //Recepción de parametros de tipo query string

   /*
    * EL STRING QUERY SE REFIERE A LOS DATOS QUE VIENEN EN LA URL
    TIPO "http://localhost:8080/query?nombre=papu"
    */
   @GetMapping("/query")
   public void saludarQuery(@RequestParam String nombre){
    System.out.println(nombre);
   }
}