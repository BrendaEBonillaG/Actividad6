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
        char E = promedio <= 51 && >= 60;
        char D = promedio <= 61 && >= 70;
        char C = promedio <= 71 && >= 80;
        char B = promedio <= 81 && >= 90;
        char A = promedio <= 91 && >= 100;
        return F;
        return E;
        return D;
        return C;
        return B;
        return A;
    }
}


public class Boleta {

    public static void main(String[] args) {
        double Calif1 = 0, Calif2 = 0, Calif3 = 0, Calif4 = 0, Calif5 = 0;
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
        System.out.println("Nombre del estudiante:" + Nombre_Estudiante);
        System.out.println("Calificación 1:"+Calif1);
        System.out.println("Calicicación 2:"+Calif2);
        System.out.println("Calificación 3:"+Calif3);
        System.out.println("Calificaión 4:"+Calif4);
        System.out.println("Calificación 5:"+Calif5);
        System.out.println("Promedio:"+Calif.getPromedio);
        System.out.println("Calificación:"+Calif_final);





    }
}
