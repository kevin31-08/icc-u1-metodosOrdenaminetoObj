package controllers;

import models.Persona;

public class PersonaControllers {

    // Metodo que ordena un arreglo de perosna 
    // por su edad (age) con metodo de insercicion

    public void sortPersonByAge(Persona[] personas){
        for (int i = 0; i < personas.length ; i++) {
            Persona aux = personas[i];
            int j = i - 1;
            while(j >= 0 && (personas[j].getEdad())> aux.getEdad() ){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1 ]= aux;
        }
     
    }
        //metodo ordena las personas segun el promedio de sus notas con seleccion

    public void sortPersonByAvrNotas(Persona[] personas){
            for(int i = 0 ; i < personas.length; i++){
                int numMenor = i;

                for(int j = i + 1; j< personas.length; j++){
                    // comparacion para actualizar el indice
                    if (personas[j].getPromedio()< personas[numMenor].getPromedio()){
                        numMenor = j;
                        
                    }

                }
                // pregunto si en nuMenor es != de i
                // entonces cambio de posciciones 
                if (i!= numMenor) {
                    Persona aux = personas[i];
                    personas[i] = personas[numMenor];
                    personas[numMenor]= aux;
                    
                }
            }
        }


        // ordenar el arreglo de personas por un valor de su nombre 
        // el valor del nombre sera la coantidad de letras
        // donde las vocales valen 5
        // consonantes valen el valor de la edad 
        // ejemplo : juan 20        ejemplo: Ana 80
        //20+5+5+520 = 50           5+80+5= 90
    public void sortPersonByAvrName(Persona[] personas){
            for(int i = 0 ; i < personas.length; i++){
                int numMenor = i;

                for(int j = i + 1; j< personas.length; j++){
                    // comparacion para actualizar el indice
                    if (personas[j].getPromedio()< personas[numMenor].getPromedio()){
                        numMenor = j;
                        
                    }

                }
                // pregunto si en nuMenor es != de i
                // entonces cambio de posciciones 
                if (i!= numMenor) {
                    Persona aux = personas[i];
                    personas[i] = personas[numMenor];
                    personas[numMenor]= aux;
                    
                }
            }
        }



    
}
