package Tarea7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        Lugar l1 = new Lugar(1,"PAse de almeria","Almeria","Almeria");
        listaEmpleados.add(new Empleados("Antonio", "Sánchez","González", "jefe"));
        listaEmpleados.add(new Empleados("Dani", "Salazar","Bastardo", "secretario"));
        Empleados e1 = new Empleados("Javi", "Bailon","Faba", "secretario");
        proyecto p1 = new proyecto("03-03-2023","05-05-2023",listaEmpleados,l1);


    }
}