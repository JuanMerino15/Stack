/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class Stack {
    private ArrayList<Data>stack;
    private int top;
    
    // Crea una pila con espacio para t Data
    public Stack(){
        stack = new ArrayList(10);
        top = stack.size();
        
    }
    
    // Regresa true si la pila esta vacia
    public boolean isEmpty(){
        if(top == stack.size())
            return true;
        else
            return false;
        
    }
    //Refresa true si la pila ya esta llena
    public boolean isFull(){
        if(top == 0)
            return true;
        else
            return false;
    }
    
    //Inserta un elmento en la pila
    public boolean push(Data d){
        
    
         if( this.isFull()) //La pila esta llena y no se puede insertar más datos
            return false;
        this.top--;
        stack.add(top,d);
        return true;
        
    }
    
    //Saca un elemento de la pila
    public Data pop (){
        Data unDato  = null;
        //Si la pila NO está vacía, se pueden returar elementos
       if(!this.isEmpty()){
           unDato = stack.remove(this.top);
       this.top++;
    }
    return unDato;
}
    
    //Regresa el numero de elementos que estan en la pila 
    public int getSize(){
        return this.stack.size();
    }
        }