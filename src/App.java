import controllers.PersonaControllers;
import models.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] persona={new Persona("ana", 5),
        new Persona("ana", 23),
        new Persona("ana", 23) };
        

   


    for(Persona person : persona){
        System.out.println(person);
    }
    PersonaControllers controllers = new PersonaControllers();
    controllers.sortPersonByAge(persona);


     }
     
    

    
}
