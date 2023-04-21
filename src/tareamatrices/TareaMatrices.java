/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareamatrices;

import java.util.Random;

/**
 *
 * @author XPC
 */
public class TareaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int size = 5; // tamaño de la matriz
        int[][] matriz = new int[size][size]; // crear matriz
        
        // generar valores aleatorios para la matriz
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matriz[i][j] = random.nextInt(10); // valores entre 0 y 9
            }
        }
        
        // sumar diagonales
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;
        for (int i = 0; i < size; i++) {
            diagonalPrincipal += matriz[i][i];
            diagonalSecundaria += matriz[i][size-1-i];
        }
        
        // mostrar resultados
        System.out.println("Matriz:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma diagonal principal: " + diagonalPrincipal);
        System.out.println("Suma diagonal secundaria: " + diagonalSecundaria);
    }
}
    
    

