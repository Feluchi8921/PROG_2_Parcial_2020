import java.util.ArrayList;

public class Paciente {

    //Atributos
    private String nombre;
    private int edad;
    private ArrayList<String> sintomas;
    private ArrayList<String> equipamientos;

    //Constructor
    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas=new ArrayList<>();
        this.equipamientos=new ArrayList<>();
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean precisaEquipamiento(String equipamiento){
        for (String e: equipamientos) {
            return e.equals(equipamiento);

        }
        return false;
    }

    public boolean tieneSintoma(String sintoma){
        for (String s: sintomas) {
            return s.equals(sintoma);
        }
        return false;
    }

    public boolean cumpleRequerimientos(Cama cama){
        if(cama.isOcupada()==false){
            for (String e: equipamientos) {
                return cama.cumpleRequerimientos(this);
            }
        }
        return false;
    }

    //Metodo agregar sintoma
    public void addSintoma(String sintoma){
        sintomas.add(sintoma);
    }

    //Metodo agregar equipamiento
    public void addEquipamiento(String equipamiento){
        equipamientos.add(equipamiento);
    }
}
