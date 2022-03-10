import java.util.Scanner;

public class Principal {

    public static void main (String[]args){

 Poo poo1 = new Poo("Andres", "Olmedo", "Madrid", 27);

    Scanner scn = new Scanner(System.in);
    String nombre;
    String ciudad;
   System.out.println("¡Bienvenid@! ¿Cuál es tu nombre?");
   nombre = scn.nextLine();
    System.out.println("Encantado de conocerte " + nombre + " ^^");
   System.out.println(poo1.toString());
   System.out.println("¿De dónde eres?");
   ciudad = scn.nextLine();
        switch(ciudad){
            case "Barcelona" :{
                System.out.println("Me encanta Barcelona, sobre todo la Sagrada Familia");
                break;
            }
            case "Madrid": {
                System.out.println("¡Como yo! Que gran ciudad");
                break;
            }
            case "Sevilla": {
                System.out.println("¡Qué bonita la Giralda!");
                break;
            }
            case "Valencia": {
                System.out.println("Aquesta és la teva casa ^^");
                break;
            }
            default: {
                System.out.println("¡Muy bonita! ^^");
                break;
            }
            }
        
        }
    }