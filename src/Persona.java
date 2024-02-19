public class Persona {
    //Atributos
    private java.lang.String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre_, int edad_) {
        this.nombre=nombre_;
        this.edad=edad_;
    }

    //Metodo getter
    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}