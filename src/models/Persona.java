package models;

public class Persona {
    private String nombre;
    private int edad;
    private int[] notas;



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(String nombre, int edad, int[] nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas= notas;
    }
    public Persona() {
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] nota) {
        this.notas = nota;
    }   
    public int getPromedio(){
        // calcular el promedio , sumo todas las notas y divido para la cantidad de notas
        int suma= 0;
        for(int nota : notas){
            suma += nota;

        }
        return suma/notas.length;
    }

    public int valueName(){
        int value = 0 ; 
        for(int i = 0 ; i < name.length(); i++){
            char letra = name.toLowerCase().charAr(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u' ) {
                value += 5;
                
                
            }else{
                value += edad;
            }

        }
        return value;
    }
}
