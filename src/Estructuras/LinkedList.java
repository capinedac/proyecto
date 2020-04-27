/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Mendoza
 * @param <T>
 */
public class LinkedList<T> {
    public Nodo<T> top;
    public Nodo<T> tail;
    private int size;

    public LinkedList (LinkedList<T> lista){
        this.top = lista.top;
        this.tail = lista.tail;
        this.size = lista.size;
    }

    public LinkedList (){
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return this.top == null;
    }
    
    public void pushFront(T key) {
        Nodo<T> nodo = new Nodo(key, this.top, null);
        if(!this.isEmpty()){ 
            this.top = nodo;  
        }else{
            this.top = nodo;
            this.tail = nodo;
        }
        this.size++;
    }
    
    public void pushBack(T key) {
        Nodo<T> nodo = new Nodo<>(key, null, this.tail); 
        if(!this.isEmpty()){
            this.tail.next=nodo;  //esto no estaba
            this.tail = nodo; 
        } else{
            this.tail = nodo;
            this.top = nodo;
        }
        this.size++; 
    }
    
    public T popFront() {
        T temp;
        if(isEmpty()) {
            return null;
        } else {
            temp = top.key;
            top = top.next; 
            size--;
            if(top==null){
                tail=null;
            }
            return temp;
        }
    }
    
    public T popBack() {
        T temp;
        if(isEmpty()) {
            return null;
        } else {
            temp = tail.key;
            tail = tail.last; 
            size--;
            return temp;
        }
    }

    public T topFront() {
        if(isEmpty()) {
            return null;
        } else {
            return top.key;
        }
    }
    
    public T topBack() {
        if(isEmpty()) {
            return null;
        } else {
            return tail.key;
        }
    }    
    public T Eliminar(T sacar){
        Nodo<T> sentinela= new Nodo<>();
        sentinela=top;
        
        while(sentinela.next!=null){
            //System.out.println("Dentro del while de eliiminar");
            if(sentinela.key==sacar){
                if(sentinela==top){
                    popFront();
                }
                else if(sentinela==tail){
                    popBack();
                }
                else{
                sentinela.last.next=sentinela.next;
                //System.out.println("Problema");
                sentinela.next.last=sentinela.last;
                size=size-1;
                return sentinela.key;
                }
            }
            sentinela=sentinela.next;
        }
        return null;
    }
    public T valueAtPosition(int position){
        T value = null; 
        Nodo<T> nodo = this.top;
        if (position>this.size){
            System.out.println("La posision que se busca es mayor a la longitud de la lista");
            return null;
        }else{
            for(int i=0; i<position; i++){
                value = nodo.key;
                nodo = nodo.next;
            }
        }
        return value;    
    }
}