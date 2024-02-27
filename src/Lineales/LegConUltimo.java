package Lineales;
import Modelos.I_ListaConUltimo;

public class LegConUltimo <E> implements I_ListaConUltimo<E>{

    private NodoLeg<E> primero, ultimo;

    @Override
    public void insertar(E x) {
    primero = new NodoLeg<E>(x, primero);

    if(ultimo == null){
        ultimo = primero;
    }

    }

    @Override
    public void insertarFinal(E x) {

        NodoLeg<E> nuevo = new NodoLeg<E>(x);
        if(ultimo != null){
            ultimo.sig = nuevo;
        }else{
            ultimo = primero = nuevo;
        }

    }

    @Override
    public boolean borrar(E x) {

        NodoLeg<E> p = primero, ant = null;
        while(p != null && !p.dato.equals(x)){
            ant = p;
            p = p.sig;
        }
        if(p == null){
            return false;
        }
        if(p == primero){
            primero = primero.sig;
        }else{
            ant.sig = p.sig;
        }
        if(p == ultimo){
            ultimo = ant;
        }
        return true;

    }

    @Override
    public int talla() {
        int cont = 0;
        for(NodoLeg<E> p = primero; p != null; p = p.sig){
            cont++;
        }
        return cont;
    }

    public String toStringIterativo(){
        String res = "";
        for(NodoLeg<E> p = primero; p != null; p = p.sig){
            res += p.dato + " ";
        }
        return res;
    }

    public void toStringRecursivo(){

    }
}
