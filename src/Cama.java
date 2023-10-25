import java.util.ArrayList;

public class Cama extends Componente {

    //Atributos
    private int idCama;
    private boolean ocupada = false;
    private ArrayList<String> equipamientos;
    //Atributo filtro Strategy
    private CondicionBusqueda condicion;

    //Constructor
    public Cama(boolean ocupada) {
        int cont = 0;
        this.idCama = cont++;
        this.ocupada = ocupada;
        this.equipamientos = new ArrayList<>();
    }

    //Getters and Setters
    public int getIdCama() {
        return idCama;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public CondicionBusqueda getCondicion() {
        return condicion;
    }

    public void setCondicion(CondicionBusqueda condicion) {
        this.condicion = condicion;
    }

    public void addEquipamiento(String equipamiento) {
        equipamientos.add(equipamiento);
    }

        public boolean tieneEquipamiento(String equipamiento) {
        for (String e : equipamientos) {
            return e.equals(equipamiento);
        }
        return false;
    }

    public boolean cumpleRequerimientos(Paciente paciente){
        if(this.ocupada==false){
            for (String e: equipamientos) {
               return paciente.precisaEquipamiento(e);
            }
        }
        return false;
    }
    @Override
    public ArrayList<Cama> listarCamasDisponibles(Paciente paciente){
        //Creo una copia
        ArrayList<Cama> listaCamasDisponibles = new ArrayList<>();
        //Para que un paciente pueda ocupar una cama debe estar desocupada y el paciente debe cumplir la condicion
        if(this.isOcupada() && condicion.cumple(paciente)){
            listaCamasDisponibles.add(this);
        }
        return listaCamasDisponibles;
    }
    @Override
    public Componente copiar() {
        return new Cama(ocupada);
    }
    @Override
    public Componente copiar(CondicionBusqueda condicion, Paciente paciente){
        if (condicion.cumple(paciente)) {
            return new Cama(ocupada);
        }
        return null; // Devuelve null si no se permite copiar el elemento.
    }

}