public class Poo {
  String nombre;
  String apellidos;
  String poblacion;
  int edad;

public Poo(String nombre, String apellidos, String poblacion, int edad){

    this.nombre= nombre;
    this.apellidos= apellidos;
    this.poblacion=poblacion;
    this.edad= edad;
}

    public String getNombre(){
     return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos= apellidos;
    }
    public String getPoblacion(){
        return poblacion;
    }
    public void setPoblacion(String poblacion){
        this.poblacion= poblacion;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }


public String toString(){
    return "Mi nombre es "  +nombre+". Tengo " +edad+ " años y vivo en " + poblacion;
}



}


