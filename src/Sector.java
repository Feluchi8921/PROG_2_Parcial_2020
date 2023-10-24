import java.util.ArrayList;

public class Sector extends Componente{
    //Atributo
    ArrayList<Componente> componentes;

    //Constructor
    public Sector() {
        this.componentes = new ArrayList<>();
    }

    //Metodos
    public void addComponente(Componente componente){
        componentes.add(componente);
    }

    public void deleteComponente(Componente componente){
        componentes.remove(componente);
    }

   @Override
   public ArrayList<Cama> listarCamasDisponibles(Paciente paciente){
        ArrayList<Cama> listarCamas = new ArrayList<>();
        for(Componente c : componentes){
                listarCamas.addAll(c.listarCamasDisponibles(paciente));
            }
        return listarCamas;
        }
   }

