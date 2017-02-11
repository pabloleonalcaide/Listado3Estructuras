package listadoEstructuras3;

import java.util.ArrayList;

/**
 * Crea una clase generica Cola (debe de aceptar cualquier tipo de objeto concreto, utiliza generics). 
 * Recuerda que has de evitar la interacción con el usuario dentro de Cola. Utilizando generics, implementa las 
 * operaciones basicas de una estructura de datos cola. Recuerda que una cola es una estructura FIFO donde el primer
 *  elemento en entrar es el primero en salir. Un ejemplo básico de cola es la de la taquilla de un cine.
 * Las operaciones a implementar son:
* a. Crear una cola.
* b. Introducir elemento en la cola (anadir/enqueue)
* c. Sacar elemento de la cola (extraer/dequeue)
* d. Cabeza de la cola. (devuelve el primer elemento de la cola, cabeza o front)
* Implementa los metodos necesarios, y recuerda hacer las pruebas precisas. Para ello, crea una clase TestCola donde se 
* anadan muchos elementos de una clase creada en el mismo fichero (Persona, Paciente, Cartas...) y se invoquen a todos los
* metodos. Al final, vacia la cola con un bucle while que extraiga de la cola hasta que se vacíe
 * @author pablo
 * @version 1.0
 */
public class Cola<E> {
	
	private ArrayList<E> lista;

	/**
	 * Constructor con lista por parámetro
	 * @param lista
	 */
	public Cola(ArrayList<E> lista) {
		this.lista = lista;
	}

	/**
	 * Constructor sin lista por parámetro
	 */
	public Cola(){
		lista = new ArrayList<E>();
	}
	
	/**
	 * Introduce un elemento al final de la cola
	 * @param e
	 */
	public void enqueue(E e){
		lista.add(e);
	}
	
	/**
	 * Elimina el primer elemento de la cola
	 */
	public void dequeue(){
		lista.remove(0);
	}
	
	/**
	 * @return primer elemento de la cola
	 */
	public Object getFront(){
		return lista.get(0);
	}
	
	/**
	 * @return lista genérica
	 */
	ArrayList<E> getLista() {
		return lista;
	}
	
	/**
	 * introduce un ArrayList de tipo E
	 * @param lista
	 */
	private void setLista(ArrayList<E> lista) {
		this.lista = lista;
	}
	
	/**
	 * Elimina todos los elementos de la lista en cascada
	 */
	void removeAll(){
		while(!getLista().isEmpty()){
			dequeue();
		}
	}

	@Override
	public String toString() {
		return "Cola [lista=" + lista + "]";
	}	
}
