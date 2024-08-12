package org.example;

public class Main {
    public static void main(String[] args) {

        Arbol arbolPrueba= new Arbol(20);

        arbolPrueba.head.izquierda= new Nodo(23);
        arbolPrueba.head.izquierda.centro= new Nodo(57);

        arbolPrueba.head.centro = new Nodo(19);
        arbolPrueba.head.centro.izquierda= new Nodo(67);
        arbolPrueba.head.centro.izquierda.centro= new Nodo(99);

        arbolPrueba.getNodo(arbolPrueba.head,57);
        arbolPrueba.getNodo(arbolPrueba.head,99);






    }
}