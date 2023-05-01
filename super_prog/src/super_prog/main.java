package super_prog;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        char option = ' ';
        
        do {
            System.out.println("Bienvenido al programa");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("#. Salir");
            System.out.print("Ingrese una opción: ");
            
            option = scan.next().charAt(0);
            
            switch (option) {
                case '1':
                    System.out.println("Ha seleccionado la opción 1");
                    int n=0;
          		  try {
          			do {

          	        System.out.print("Ingrese el número de alumnos: ");
          	         n = scan.nextInt();
          			}
          			while(n<=0);
          	        String[] nombres = new String[n];
          	        double[][] calificaciones = new double[n][5];

          	        for (int i = 0; i < n; i++) {
          	            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
          	            nombres[i] = scan.next();

          	            System.out.print("Ingrese la calificación en matemáticas: ");
          	            calificaciones[i][0] = scan.nextDouble();

          	            System.out.print("Ingrese la calificación en inglés: ");
          	            calificaciones[i][1] = scan.nextDouble();

          	            System.out.print("Ingrese la calificación en español: ");
          	            calificaciones[i][2] = scan.nextDouble();

          	            System.out.print("Ingrese la calificación en filosofía: ");
          	            calificaciones[i][3] = scan.nextDouble();

          	            double promedio = (calificaciones[i][0] + calificaciones[i][1] + calificaciones[i][2] + calificaciones[i][3]) / 4.0;
          	            calificaciones[i][4] = promedio;
          	        }

          	        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Nombre", "Matemáticas", "Inglés", "Español", "Filosofía", "Promedio");
          	        for (int i = 0; i < n; i++) {
          	            System.out.printf("%-15s", nombres[i]);
          	            for (int j = 0; j < 5; j++) {
          	                System.out.printf("%-15.2f", calificaciones[i][j]);
          	            }
          	            System.out.println();
          	        }

          	       
          		  }
          		  catch(Exception e)
          		  {
          			  System.out.println("Ingrese algo valido(El numero de estudiantes!) ");
          		  }
                    break;
                case '2':
                    System.out.println("Ha seleccionado la opción 2");
                    break;
                case '3':
                    System.out.println("Ha seleccionado la opción 3");
                    break;
                case '#':
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        } while (option != '#');
        
        scan.close();
	}

}
