/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.d.busqueda.d.enteros;

/**
 *
 * @author Abner V
 */
public class ArbolDBusquedaDEnteros {

    public static void main(String[] args) {
        System.out.println("Hola Abner");
        
   private NodoArbol raiz;

	//contruir un arbol vacio
	public Arbol()
	{
		raiz = null;
	}

	//insertar un nuevo nodo en el arbol de busqueda binaria
	public synchronized void insertarNodo(int valorInsertar)
	{
		if(raiz == null)
			raiz = new NodoArbol(valorInsertar); //crea nodo raiz

		else
			raiz.insertar(valorInsertar); // llama al metodo insertar
	}

	//**************EMPESAR EL RECORRIDO EN PREORDEN++++++++++++
	public synchronized void recorridoPreorden()
	{
		ayudantePreorden(raiz);
	}
	//metodo recursivo para recorrido en preorden

	private void ayudantePreorden(NodoArbol nodo)
	{
		if (nodo == null)
			return;

		System.out.print(nodo.datos + " "); // mostrar datos del nodo
		ayudantePreorden(nodo.nodoizquierdo); //recorre subarbol izquierdo
		ayudantePreorden(nodo.nododerecho); //recorre subarbol derecho
	}
   //++++++++++++++EMPEZAR RECORRIDO INORDEN+++++++++++++++
	public synchronized void recorridoInorden()
	{
		ayudanteInorden(raiz);
	}

	// metodo recursivo para recorrido inorden

	private void ayudanteInorden(NodoArbol nodo)
	{
		if (nodo == null)
			return;

		ayudanteInorden(nodo.nodoizquierdo);
		System.out.print(nodo.datos + " ");
		ayudanteInorden(nodo.nododerecho);
	}

	//*********EMPEZAR RECORRIDO POSORDEN*********
	public synchronized void recorridoPosorden()
	{
		ayudantePosorden(raiz);
	}

	//metodo recursivo para recorrido posorden

	private void ayudantePosorden(NodoArbol nodo)
	{
		if (nodo == null)
			return;

		ayudantePosorden(nodo.nodoizquierdo);
		ayudantePosorden(nodo.nododerecho);
		System.out.print(nodo.datos + " ");
	}

}//fin clase arbol
    }
    
}
