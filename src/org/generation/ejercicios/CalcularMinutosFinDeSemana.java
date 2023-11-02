package org.generation.ejercicios;

import java.util.Scanner;

public class CalcularMinutosFinDeSemana {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Array con los nombres de los días de la semana
	        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};

	        // Obtener el día de la semana
	        String diaSemana;
	        int diaIndex;
	        do {
	            System.out.print("Ingrese un día de la semana (lunes a viernes): ");
	            diaSemana = scanner.nextLine().toLowerCase();
	            diaIndex = -1;

	            // Verificar si el día ingresado es válido
	            for (int i = 0; i < diasSemana.length; i++) {
	                if (diaSemana.equals(diasSemana[i])) {
	                    diaIndex = i;
	                    break;
	                }
	            }

	            if (diaIndex == -1) {
	                System.out.println("Día de la semana no válido. Intente de nuevo.");
	            }

	        } while (diaIndex == -1);

	        // Obtener la hora y los minutos
	        int hora, minutos;
	        do {
	            System.out.print("Ingrese la hora (0-23): ");
	            hora = scanner.nextInt();
	            System.out.print("Ingrese los minutos (0-59): ");
	            minutos = scanner.nextInt();

	            if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
	                System.out.println("Hora o minutos no válidos. Intente de nuevo.");
	            }

	        } while (hora < 0 || hora > 23 || minutos < 0 || minutos > 59);

	        scanner.close();

	        // Calcular minutos hasta el fin de semana (viernes 15:00)
	        int minutosHastaFinDeSemana = 0;
	        if (diaIndex < 4) {  // Si es lunes a jueves
	            minutosHastaFinDeSemana = ((4 - diaIndex) * 24 * 60) - (hora * 60 + minutos);
	        } else if (diaIndex == 4) {  // Si es viernes
	            if (hora < 15) {
	                minutosHastaFinDeSemana = ((4 - diaIndex) * 24 * 60) - (hora * 60 + minutos);
	            } else {
	            	 System.out.println("YA INICIO EL FIN DE SEMANA! :D ");
	            }
	        }

	        // Mostrar el resultado
	        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana);
	    }
	}



