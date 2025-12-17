/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double produccion[][] = new double[5][12];
        String nombres[] = new String[5];
        String estacion[] = new String[5];
        String reporte = "";
        double suma[] = new double[5];
        for (int i = 0; i < produccion.length; i++) {
            System.out.printf("Ingrese el nombre de la estacion %s:\n", i + 1);
            estacion[i] = entrada.nextLine();
            System.out.println("Ingrese el nombre del encargado de la estacion:");
            nombres[i] = entrada.nextLine();
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.printf("Ingrese la produccion del mes %s:\n", j + 1);
                produccion[i][j] = entrada.nextDouble();
                entrada.nextLine();
                suma[i] = suma[i] + produccion[i][j];
            }
            reporte = String.format("%s%s Estación %s - Total Produccion: $%s\n",
                    reporte, estacion[i], i + 1, suma[i]);
        }
        double posicion = suma[0];
        int mayor = 0;
        for (int i = 0; i < suma.length; i++) {
            if (suma[i] > posicion) {
                mayor = i;
            }
        }
        reporte = String.format("%s\n"
                + "Estación más productiva: %s Estación %s\n"
                + "Encargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $%s\n",
                reporte, estacion[mayor], mayor + 1, nombres[mayor],
                suma[mayor]);
        System.out.printf("Análisis de Producción\n"
                + "Estacion\n"
                + "%s\n", reporte);
    }
}
