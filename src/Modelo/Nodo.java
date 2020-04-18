/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Santiago Mendoza
 * @param <T>
 */
public class Nodo<T> {
    public T key;
    public Nodo next;
    public Nodo last;
    
    public Nodo(T key, Nodo next, Nodo last){
        this.key = key;
        this.next = next;
        this.last = last;
    }
    
    public Nodo(T key, Nodo next){
        this.key = key;
        this.next = next;
        this.last = null;
    }
    
    public Nodo(){
        this.next = null;
        this.last = null;
    }
}
