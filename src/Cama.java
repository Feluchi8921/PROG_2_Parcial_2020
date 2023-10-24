import java.util.ArrayList;

public class Cama extends Componente {

    //Atributos
    private int idCama;
    private boolean ocupada = false;
    private ArrayList<String> equipamientos;

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
}