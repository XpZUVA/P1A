package Modelos;

public interface I_ListaConUltimo <E>{

    public void insertar(E x);
    public void insertarFinal(E x);
    public boolean borrar(E x);
    public int talla();
}
