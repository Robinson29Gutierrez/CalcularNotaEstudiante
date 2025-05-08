import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Caso 2: Parque Acuático Contextualización:
        // El parque AquaLand ofrece diferentes accesos y servicios. Según la elección
        // del visitante, se deben
        // aplicar condiciones específicas.
        //menu de opciones:
        //1 Entrada genera.
        //2 acceso a atracion extremas
        // 3 solicitar menbrecia.

        Scanner sc = new Scanner(System.in);
        double notaExamenparcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        System.out.println("ingrese su edad");
        String nombreEstudiante = sc.nextLine();
        System.out.println("ingrese el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \nDesarrollo de software\nDiseño Gráfico\nGastronomia");
        String programa = sc.nextLine();
        switch (programa) {
            case "1":
                System.out.println("Programa de desarrollo de softwar");
                System.out.println(
                        "Seleccione la materia.\n1 - logica de programacion\n2 - metodologias agiles\n3- Introduccion a ala programacion");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de logica de programacion");
                        System.out.println("Nota exámen parcial");
                        notaExamenparcial = sc.nextDouble();
                        System.out.println("Nota taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenparcial * 0.2) + (notaTaller * 0.3) * (notaFinal * 0.5);
                        System.out.println("La nota final de la materia es:");
                        System.out.println("El estudiante " + nombreEstudiante
                                + "tiene la siguiente nota en la materia de Lógica:" + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de metodologias agiles");
                        System.out.println("Nota exámen parcial");
                        notaExamenparcial = sc.nextDouble();
                        System.out.println("Nota taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenparcial * 0.2) + (notaTaller * 0.3) * (notaFinal * 0.5);
                        System.out.println("La nota final de la materia es:");
                        System.out.println("El estudiante " + nombreEstudiante
                                + "tiene la siguiente nota en la materia de metodologias agiles: " + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota introduccion a la programacion");
                        System.out.println("Nota exámen parcial");
                        notaExamenparcial = sc.nextDouble();
                        System.out.println("Nota taller");
                        notaTaller = sc.nextDouble();
                        System.out.println("Nota final");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenparcial * 0.2) + (notaTaller * 0.3) * (notaFinal * 0.5);
                        System.out.println("La nota final de la materia es:");
                        System.out.println("El estudiante " + nombreEstudiante
                                + "tiene la siguiente nota en la materia de introduccion a la progrmacion: "
                                + notaMateria);
                        if (notaMateria < 2) {
                            System.out.println("Perdió definitivamente");
                        } else if (notaMateria < 2.9) {
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
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