package org.example;

public class Nodo {
    int valor;
    Nodo izquierda;
    Nodo centro;
    Nodo derecha;

    Nodo(int valor){
        this.valor=valor;
        this.izquierda= null;
        this.centro= null;
        this.derecha=null;
    }
}
