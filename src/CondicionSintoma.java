public class CondicionSintoma extends CondicionBusqueda{
    //Atributo
    private String sintoma;

    //Constructor
    public CondicionSintoma(String sintoma){
        this.sintoma=sintoma;
    }

    //Getters and Setters
    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean cumple(Paciente paciente){
        return paciente.tieneSintoma(sintoma);
    }
}
