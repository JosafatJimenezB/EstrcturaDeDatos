package com.example.arboles;

public class MainArbol {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar("A");
        arbol.insertar("B");
        arbol.insertar("D");
        arbol.insertar("E");
        arbol.insertar("C");
        arbol.insertar("F");
        arbol.insertar("H");
        arbol.insertar("I");
        arbol.insertar("G");
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
    }
}
