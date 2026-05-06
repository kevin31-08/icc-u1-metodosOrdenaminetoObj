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
        for (int i = 0; i < personas.length ; i++) {
            Persona aux = personas[i];
            int j = i - 1;
            while(j >= 0 && (personas[j].getNombre().compareTo(aux.getNombre()))){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1 ]= aux;
        }



    }
}
