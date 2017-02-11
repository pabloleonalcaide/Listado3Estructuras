package listadoEstructuras3;

import java.util.ArrayList;

/**
 * Reproduce una clase con Generics. Llamala ClaseConGenerics. Entrega su esqueleto donde:
 *a. Definas una variable de objeto. Ha de ser una coleccion homogonea (del tipo
 *parametrizado de la clase)
 *b. Definas un constructor donde instancies el atributo anterior
 *c. Definas un metodo metodo1 cuyo parametro sea del tipo parametrizado
 *d. Definas un metodo metodo2 cuyo valor devuelto sea del tipo parametrizado
 * @author pablo leon alcaide
 * @version 1.0
 */
public class ClaseConGenerics<E> {
	private ArrayList generic;
	
	/**
	 * Constructor que instancia el atributo
	 */
	public <E>ClaseConGenerics(){
		this.generic = new ArrayList<E>();
	}
/**
 * introduce un elemento de tipo E
 * @param e
 */
	void metodo1(E e){
		generic.add(e);
	}
	/**
	 * Devuelve el elemento de tipo E en la posicion "index"
	 * @param index
	 * @return e
	 */
	Object metodo2(int index){
		return generic.get(index);
	}
	/**
	 * @return Lista
	 */
	public ArrayList<E> getLista() {
		return generic;
	}
	/**
	 * @param lista
	 */
	public void setLista(ArrayList<E> lista) {
		generic = lista;
	}
	
}
