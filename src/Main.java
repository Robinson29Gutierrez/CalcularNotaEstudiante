import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // desarrollar un sistema de notas para un estudiante que desea saber su nota final 8de cada materia)
        // el sistema debe pedir el nombre del estudiante , el documento  y el programa  al que esta matriculado
        //(menu de opciones : Desarollo de software, Diseño grafico, Gastronomia)
        // de permitir selecionar la materia (menu opciones: desarrollo: logica, metodologias, Introduccion ,diseño:
        // tipografia ,iconografia , semantica.
        // gastronomia: costos , panaderia dulce, cocina internacional)
        // El calculo de notas es de la siguiente manera :
        // para cada materia hay un examen paracial que equivale  al 20% de la nota , un taller que equivale
        // el 30% de la nota y un examen fianl que equivale el 50% de la nota)
        //una vez calculada la nota final tener en cuenta que:
        // si la nota esta entre 0 y 2 el estudiante pierde definitivamente
        // si la nota esta entre 2.1 y 2.9 tiene derecho a plan de mojoramiento.
        // si el estudiante tiene un plan de mejoramiento la nota maxima sera 3
        // el sistema debe describir la informacion general del estudiante
        // Nombre, documento y Nota de la materia.

Scanner sc = new Scanner(System.in);
System.out.println("ingrese el nombre del estudiante");
String nombreEstudiante = sc.nextLine();
System.out.println("ingrese el documento del estudiante: ");
String documentoEstudiante = sc.nextLine();
System.out.println("Seleccione el programa: \nDesarrollo de software\nDiseño Gráfico\nGastronomia");
String programa = sc.nextLine();
switch (programa) {
    case "1":
        System.out.println("Programa de desarrollo de software");
        System.out.println("Seleccione la materia.\n1 - logica de programacion\n2 - metodologias agiles\n3- Introduccion a ala programacion");
        String materia = sc.nextLine();
        switch (materia) {
            case "1":
                System.out.println("Nota de logica de programacion");
                break;
            case "2":
                System.out.println("Nota de metodologias agiles");
                break;
            case "3":
                System.out.println("Nota de metodologias agiles ");
                break;
        }
        break;
    case "2":
        System.out.println("Programa de diseño Gráfico");
        break;
    case "3":
        System.out.println("Programa de Gastronomia");
        break;
}

    }
}