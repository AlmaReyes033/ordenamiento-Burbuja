/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbuja;
import java.util.Arrays;

/**
 *
 * @author Alma Reyes
 */
    public class MetodoBurbuja {

        public static void main(String[] args) {
        
        // prueba con arreglo desordenado
        
        int[] desordenado = {5, 2, 4, 1};//arreglo original
        
        // copias para poder hacer las pruebas
        int[] copiaTradicional1 = desordenado.clone();
        int[] copiaMejorado1 = desordenado.clone();
        
        System.out.println(" Prueba de arreglo desordenado ");
        //muestra como estaba ordenado el arreglo original
        System.out.println("Estado inicial: " + Arrays.toString(desordenado));
        
        //llamada al ordenamiento
        ordenamientoBurbuja(copiaTradicional1);
        //imprime los resultados
        System.out.println("Resultado de burbuja tradicional: " + Arrays.toString(copiaTradicional1));
        //llamada al ordenamiento
        ordenamientoBurbujaMejorado(copiaMejorado1);
        //imprime los resultados
        System.out.println("Resultado de burbuja mejorado: " + Arrays.toString(copiaMejorado1));


        // prueba con arreglo ordenado
        int[] ordenado = {1, 2, 5, 4, 3};//arreglo original
        
        // copias para hacer las pruebas
        int[] copiaTradicional2 = ordenado.clone();
        int[] copiaMejorado2 = ordenado.clone();
        
        System.out.println(" arreglo ordenado ");
        //muestra como estaba el arreglo original
        System.out.println("Estado inicial: " + Arrays.toString(ordenado));
        //llamada al ordenamiento
        ordenamientoBurbuja(copiaTradicional2);
        //imprime los resultados
        System.out.println("Resultado de burbuja tradicional: " + Arrays.toString(copiaTradicional2));
        //llamada al ordenamiento
        ordenamientoBurbujaMejorado(copiaMejorado2);
        //imprime los resultados
        System.out.println("Resultado de burbuja mejorado:    " + Arrays.toString(copiaMejorado2));
    }

        //Método de Burbuja Tradicional
        // Recorre el arreglo
        public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length; // obtiene el tamaño del arreglo
        for (int i = 0; i < n - 1; i++) { // controla las pasadas necesarias que se realizara
            for (int j = 0; j < n - 1; j++) { // compara si la izquierda es mayor
                //compara los elementos
                if (arreglo[j] > arreglo[j + 1]) {
                    //intercambio
                    // guarda el primer valor
                    int temp = arreglo[j];
                    //se coloca el segundo valor en la primera posicion
                    arreglo[j] = arreglo[j + 1];
                    //se coloca el valor guardado en la segunda posicion
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método de Burbuja Mejorado
    // Optimización con bandera para interrumpir si el arreglo ya está ordenado
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;//guarda los elementos de arreglo en n
        boolean huboIntercambio;//ayudara a detectar si habra cambios

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
                
            for (int j = 0; j < n - 1 - i; j++) {
                //compara los numeros
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambio de elementos
                    int temp = arreglo[j];
                    //copia el valor del elemento menor
                    arreglo[j] = arreglo[j + 1];
                    //realiza el intercambio de numero
                    arreglo[j + 1] = temp;
                    // si ocurre el intercambio
                    huboIntercambio = true; 
                }
            }

            // Si en toda la pasada no hubo intercambios, el arreglo está ya ordenado
            if (!huboIntercambio) {
                break; // Se interrumpe el ciclo
            }
        }
    }
}
