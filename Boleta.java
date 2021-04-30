import java.util.Scanner;
public class Calificaciones {

    public String Nombre_Estudiante;

    //Método para calcular el promedio.
    public double getPromedio(){
        double total = 0;
        double promedio = total / 5;
        return promedio;
    }
    //Método para calificar.
    public char getCalificar(){
        char calif_final = 0;
        double promedio = getPromedio();
        char F = promedio >= 50;
        char E = promedio < 50;
        char D = promedio > 50;
        char C = promedio > 50;
        char B = promedio > 50;
        char A = promedio > 50;
        return
    }
}


public class Boleta {

    public static void main(String[] args) {
        double Calif1=0, Calif2=0, Calif3=0, Calif4=0, Calif5=0;
        Scanner calif = new Scanner(System.in);
	String[] Calif = {"Calif1", "Calif2", "Calif3", "Calif4", "Calif5"};

	    System.out.println("Ingresa la primera calificación:");
	    Calif1 = calif.nextDouble();
        System.out.println("Ingresa la segunda calificación:");
        Calif2 = calif.nextDouble();
        System.out.println("Ingresa la tercera calificación:");
        Calif3 = calif.nextDouble();
        System.out.println("Ingresa la cuarta calificación:");
        Calif4 = calif.nextDouble();
        System.out.println("Ingresa la quinta calificación:");
        Calif5 = calif.nextDouble();

        double total = Calif1 + Calif2 + Calif3 + Calif4 + Calif5;

        System.out.println(calif.getPromedio(total));
    }
}
