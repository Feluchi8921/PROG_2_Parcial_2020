public class CondicionOr extends CondicionBusqueda{

    //Atributo
    private CondicionBusqueda c1;
    private CondicionBusqueda c2;

    //Constructor
    public CondicionOr(CondicionBusqueda c1, CondicionBusqueda c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    //Getters and Setters
    public CondicionBusqueda getC1() {
        return c1;
    }

    public void setC1(CondicionBusqueda c1) {
        this.c1 = c1;
    }

    public CondicionBusqueda getC2() {
        return c2;
    }

    public void setC2(CondicionBusqueda c2) {
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Paciente paciente){
        return (c1.cumple(paciente) || c2.cumple(paciente));
    }
}
