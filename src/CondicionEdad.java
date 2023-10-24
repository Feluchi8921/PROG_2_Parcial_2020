public class CondicionEdad extends CondicionBusqueda{

    //Atributo
    private int edad;

    //Constructor
    public CondicionEdad(int edad){
        this.edad=edad;
    }

    //Getters and Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple (Paciente paciente){
        return paciente.getEdad()<edad;
    }
}
