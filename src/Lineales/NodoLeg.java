package Lineales;

public class NodoLeg <E>{

    E dato;
    NodoLeg<E> sig;
    public NodoLeg(E dato){
        this(dato, null);
    }

    public NodoLeg(E dato, NodoLeg<E> sig){
        this.dato = dato;
        this.sig = sig;
    }

}
