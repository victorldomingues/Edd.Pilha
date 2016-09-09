/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edd.Pilha;
/**
 *
 * @author lab655
 */
public class Pilha {
    private char[] palavra;
    private int topo;
    public Pilha (int tamanho){
        this.topo = 0; 
        this.palavra = new char[tamanho];
    }
    public char pop (){
        if(this.topo > 0)
            this.topo--;
        char atual = palavra[this.topo];
        return atual;
    }
    public boolean push(char ps){
        boolean ret = false;
        if(this.topo < palavra.length){
            palavra[this.topo] = ps;
            this.topo ++;
            ret = true ;
        }
        return  ret;
    }
    public int size(){
        return palavra.length;
    }
    public boolean isEmpty(){
        boolean ret = true;
        if(this.topo > 0)
            ret = false;
            return ret;
    }
    public boolean isFull(){
       return (topo == palavra.length ? true : false);
    }
}
