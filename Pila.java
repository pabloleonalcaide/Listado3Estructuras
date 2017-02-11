package listadoEstructuras3;

import java.util.ArrayList;

/**
 * Crea una clase generica Pila (debe de aceptar cualquier tipo de objeto concreto, utiliza generics). Recuerda 
 * que has de evitar la interacci�n con el usuario dentro de Pila.
 *Implementa las operaciones basicas de una estructura de datos pila. Una pila es una estructura LIFO donde el 
 *ultimo elemento en entrar es el primero en salir. Un ejemplo basico de pila es la forma de almacenamiento de procesos 
 *en la memoria. Las operaciones a implementar son:
 *a. Crear una pila.
 *b. Introducir elemento en la pila (apilar o push)
 *c. Sacar elemento de la pila (extraer o pop)
 *d. Cima de la pila (devuelve el elemento de la cima de la pila o top)
 *Implementa los metodos necesarios, y recuerda hacer las pruebas precisas.
 *Para ello, crea una clase TestPila donde se anadan muchos elementos de una clase creada en el mismo fichero 
 *(Persona, Paciente, Cartas...) y se invoquen a todos los
 *metodos. Al final, vac�a la pila con un bucle de este estilo:
 *while (!pila.IsEmpty())
 *System.out.println("Desapilo de la pila: " + p.pop());
 * @author pablo leon alcaide
 * @version 1.0
 */
public class Pila<E> {
	private ArrayList<E> pila;
/**
 * Constructor de Pila con lista por parámetro
 * @param pila
 */
	public Pila(ArrayList<E> pila) {
		setPila(pila);
	}
/**
 * Constructor de Pila sin la lista por parámetro	
 */
	public Pila(){
		this.pila = new ArrayList<E>();
	}

	/**
	 * introduce un elemento en la pila
	 * @param e
	 */
	 boolean push(E e){
		pila.add(e);
		return true;
	}
	 
	/**
	 * Elimina el ultimo elemento de la pila
	 * @return true /false
	 */
	 boolean pop(){
		if(pila.size()==0){
			return false;}
			else{
				pila.remove(pila.size()-1);
				return true;}
	}
	 
	/**
	 * Muestra el ultimo elemento de la pila 
	 * @return ultimo elemento
	 */
	 E top(){
		if(pila.size()==0){
			return null;}
			else
				return pila.get(pila.size()-1);	
			}
	 
	 
	 ArrayList<E> getPila() {
		return pila;
	}
	 
	
	private void setPila(ArrayList<E> pila) {
		this.pila = pila;
	}
	
	/**
	 * Elimina todos los elementos de la lista en cascada
	 */
	 void removeAll() {
		while (!getPila().isEmpty())   
			pop();	
		
	}
@Override
public String toString() {
	return "Pila " + pila;
}

	
}
