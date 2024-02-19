public class Deportista extends Persona{
    private String deporte;

    public Deportista(){
        super("Juan", 9);
        deporte="Futbol";
    }

    public Deportista(String deporte_) {
        super("Juan", 9);
        this.deporte=deporte_;
    }

    public java.lang.String getDeporte() {
        return deporte;
    }

    public void setDeporte(java.lang.String deporte) {
        this.deporte = deporte;
    }

}
