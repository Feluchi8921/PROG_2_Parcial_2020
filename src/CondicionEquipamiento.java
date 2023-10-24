public class CondicionEquipamiento extends CondicionBusqueda{

    //Atributo
    private String equipamiento;

    //Constructor
    public CondicionEquipamiento(String equipamiento){
        this.equipamiento=equipamiento;
    }

    //Getters and setters
    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    @Override
    public boolean cumple(Paciente paciente){
        return paciente.precisaEquipamiento(equipamiento);
    }
}
