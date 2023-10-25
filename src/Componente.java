import java.util.ArrayList;

public abstract class Componente {

    public abstract ArrayList<Cama> listarCamasDisponibles(Paciente paciente);
    //Copia
    public abstract Componente copiar();

    //Copia restringida
    public abstract Componente copiar(CondicionBusqueda condicion, Paciente paciente);
}
