package org.example;

public class Arbol {
    Nodo head;
    Arbol(int valor){
        head = new Nodo(valor);
    }

    void getNodo(Nodo nodo, int valorRequerido){

        if(nodo == null)return;

        if(nodo.valor == valorRequerido){
            System.out.println("Nodo solicitado: "+nodo.valor);
            return;
        }
        getNodo(nodo.izquierda,valorRequerido);
        getNodo(nodo.centro,valorRequerido);
        getNodo(nodo.derecha,valorRequerido);

    }
}
