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
    @Override
    public Componente copiar() {
        Sector copiaCarpeta = new Sector();
        for (Componente elemento : componentes) {
            Componente copiaElemento = elemento.copiar();
            copiaCarpeta.addComponente(copiaElemento);
        }
        return copiaCarpeta;
    }

    @Override
    public Componente copiar(CondicionBusqueda condicion, Paciente paciente) {
        Sector copiaCarpeta = new Sector();
        for (Componente elemento : componentes) {
            Componente copiaElemento = elemento.copiar();
            if (copiaElemento != null) {
                copiaCarpeta.addComponente(copiaElemento);
            }
        }
        return copiaCarpeta;
    }

   }

