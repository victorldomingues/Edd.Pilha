/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edd.Pilha;
import java.util.Scanner;
/**
 *
 * @author lab655
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        // TODO code application logic here
        Pilha pilha  = new Pilha(4);
        System.out.println("Esta vazio?");
        System.out.println(pilha.isEmpty());
        pilha.push('c');
        pilha.push('a');
        System.out.println("Esta cheio?");
        System.out.println(pilha.isFull());
        pilha.push('s');
        pilha.push('a');
        System.out.println("Esta cheio?");
        System.out.println(pilha.isFull());
        System.out.println("\n");
        System.out.print(pilha.pop());
        System.out.print("\t" + pilha.pop());
        System.out.print("\t" + pilha.pop());
        System.out.print("\t" + pilha.pop() + "\n");
        System.out.println("Esta vazio? \n");
        System.out.println(pilha.isEmpty());
        
    }
    
}
