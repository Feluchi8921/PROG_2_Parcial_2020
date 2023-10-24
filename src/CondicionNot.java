public class CondicionNot extends CondicionBusqueda{

    //Atributo
    private CondicionBusqueda c1;


    //Constructor
    public CondicionNot(CondicionBusqueda c1) {
        this.c1 = c1;
    }

    //Getters and Setters
    public CondicionBusqueda getC1() {
        return c1;
    }

    public void setC1(CondicionBusqueda c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Paciente paciente){
        return !(c1.cumple(paciente));
    }
}
