import controllers.PersonaControllers;
import models.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] persona={new Persona(),
        new Persona("ana", 5,new int[] {10,15,20}),
        new Persona("ana", 23, new int[]{15,12,20}),
        new Persona("ana", 23,new  int[] {20,10,20}) };
        

   

    System.out.println("personas sin ordenar ....");        
    for(Persona person : persona){
        System.out.println(person);
    }
    
    // PersonaControllers PersonaControllers = new PersonaControllers();
    // PersonaControllers.sortPersonByAge(persona);
    // for(Persona person : personas)
    //     System.out.println(person);

    //  }

     PersonaControllers PersonaControllers2 = new PersonaControllers();
     PersonaControllers2.sortPersonByAge(persona); 

     for( Persona person : persona ){
        System.out.println(person);
     }

     PersonaControllers PersonaControllers3 = new PersonaControllers();
     PersonaControllers3.sortPersonByAvrNotas(persona);
     for(Persona person : persona){
        System.out.println(person);
     }
     PersonaControllers PersonaControllers4 = new PersonaControllers();
     PersonaControllers4.sortPersonByAvrName(persona);
      for( Persona person : persona ){
        System.out.println(person);
     }



     
     
    

    
}
