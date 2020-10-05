/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentapalabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo Fac
 * Programa para leer las palabras y lineas totales a traves de un archivo de 
 * texto
 */
public class ContadorPalabras {

    static int palabrasTotal;
    static int lineasTotales;
    
    public static void main(String[] args) {
        
        palabrasTotal = 0;
        lineasTotales = 0;

        // Ruta del txt
        File archivo = new File("C:\\Users\\yerfa\\OneDrive\\Documentos\\NetBeansProjects\\CuentaPalabras\\lectura.txt");

        // LLAMADA AL METODO PARA CONTAR LAS PALABRAS Y LAS LINEAS
        contarPalabrasLineas(archivo);
    }

    // LEE EL ARCHIVO Y CUENTA LAS PALABRAS Y LAS LINEAS
    public static void contarPalabrasLineas(File archivo) {
        try {
            // SI EXISTE EL ARCHIVO
            if (archivo.exists()) {
                // ABRE LECTURA
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));

                String lineaLeida;

                // MIENTRAS LA LINEA LEIDA NO SEA NULL
                while ((lineaLeida = archivoLeer.readLine()) != null) {
                    System.out.println(lineaLeida);

                    // CONTAMOS LAS PALABRAS DE LA LINEA
                    StringTokenizer st = new StringTokenizer(lineaLeida);

                    // AUMENTA EL CONTADOR DE LINEAS Y DE PALABRAS
                    lineasTotales = lineasTotales + 1;
                    palabrasTotal = palabrasTotal + st.countTokens();
                }
                System.out.println("");
                System.out.println("Numero de palabras: " + palabrasTotal);
                System.out.println("Lineas totales: " + lineasTotales);

                // CIERRA LA LECTURA
                archivoLeer.close();
            } else {
                System.out.println("NO EXISTE EL ARCHIVO");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}





























