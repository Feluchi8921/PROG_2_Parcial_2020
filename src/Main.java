import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creo pacientes
        Paciente p1= new Paciente("juan", 22);
        Paciente p2= new Paciente("juan", 22);

        //Agrego sintomas
        p1.addSintoma("Fiebre");
        p2.addSintoma("Tos");

        //Agrego equipamiento
        p1.addEquipamiento("Respirador artificial");
        p2.addEquipamiento("Elevación hidráulica");

        //Crear camas
        Cama c1 = new Cama(false);
        Cama c2 = new Cama(false);

        //Agrego equipamientos a las camas
        c1.addEquipamiento("Respirador artificial");
        c1.addEquipamiento("Elevación hidráulica");
        c2.addEquipamiento("Respirador artificial");

        //Condiciones e busqueda
        CondicionEquipamiento condicion1 = new CondicionEquipamiento("Respirador Artificial");
        //Listo las camas disponibles
        System.out.println(c1.listarCamasDisponibles(p1));
    }
}