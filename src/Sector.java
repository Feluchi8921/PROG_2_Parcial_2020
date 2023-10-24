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

    public Componente getComponente(int posicion){
        for(int i=0; i<componentes.size();i++){
            componentes.get(posicion);
            return componentes.get(i);
        }
        return null;
    }

}
