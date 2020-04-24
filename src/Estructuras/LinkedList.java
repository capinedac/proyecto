/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.Nodo;

/**
 *
 * @author Santiago Mendoza
 * @param <T>
 */
public class LinkedList<T> {
    Nodo<T> top;
    Nodo<T> tail;
    private int size;

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
}