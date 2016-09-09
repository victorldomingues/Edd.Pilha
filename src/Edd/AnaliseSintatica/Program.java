/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edd.AnaliseSintatica;
import Edd.Pilha.Pilha;
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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe uma expressão");
        String empressao  =  entrada.next();
        Pilha pilha  = new Pilha(empressao.length());
        for(char c : empressao.toCharArray()){
            char atual;
            switch (c) {
                case '[':
                    pilha.push(c);
                    break;  
                case '{':
                    pilha.push(c);
                    break;
                case '(':
                    pilha.push(c);
                    break;
                case ']':
                   atual  = pilha.pop();
                    if('[' != atual){
                        erroOrdem(atual);
                    };
                    break;
                case '}':
                    atual  = pilha.pop();
                    if('{' != atual){
                        erroOrdem(atual);
                    };
                    break;
                case ')':
                    atual  = pilha.pop();
                    if('(' != atual){
                        erroOrdem(atual);
                    };
                    pilha.pop();
                    break;
            }
        }
        if(!pilha.isEmpty()){
            System.out.println("Incorreto, falta parenteses");
        };
    }
    public static void erroOrdem(char e){
        System.out.println("Incorreto ordem errada : " + e );
    }
    
}
