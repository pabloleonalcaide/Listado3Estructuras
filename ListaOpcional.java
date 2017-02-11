package listadoEstructuras3;

import java.util.ArrayList;

/**
 * 11. (opcional) Crea una clase genérica Lista. Has de implementar los siguientes metodos:
a. anada al final de la lista
b. Inserte un elemento en una determinada posicion
c. Modifique un elemento reemplazándolo por otro
d. Conozca el tamaño de la lista
e. Elimine elementos de la lista
f. Busque elementos en la lista
g. Copie la lista
Utilízala en un ejemplo (por ejemplo, la alineación de un equipo de fútbol, con titulares y reservas) 
y entrégalo correctamente identificado y documentado,
incluyendo JavaDoc. Deberás implementar un menú con las opciones posibles para que el usuario lo utilice fácilmente.
 * @author pablo
 * @version 1.0
 */
public class ListaOpcional {

	private ArrayList<Object> lista;

public ListaOpcional(ArrayList<Object> lista) {
		this.lista = lista;
	}
/**
* inserta un elemento al final de la lista
* @param ArrayList
* @param Object
*/	
	 boolean add(Object o){
		 if (lista==null){
			 return false;
		 }else{
		 lista.add(o);
		 return true;}
	}
	/**
	* Inserta un elemento en una determinada posición
	* @param ArrayList
	* @param Object
	* @param index
	*/
	 String insertarEnIndice(Object o, int index){
		if(lista.isEmpty()){
			return "No hay elementos aun, añade elementos primero";
		}else if(lista.size()<=index || index<0){
			return"imposible situar en esa posición";
		}else{
			lista.add(index,o);
			return "insertado con exito";
		}
	}
	/**
	* Modifica un elemento reemplazandolo por otro
	* @param ArrayList
	* @param Object
	* @param index
	*/
	 String reemplazar( Object o, int index){
	if(lista.isEmpty()){
			return "No hay elementos aun, introduce elementos primero";
		}else if(lista.size()<=index || index<0){
			return "imposible situar en esa posicion";
		}else{
			lista.set(index,o);
			return "insertado con exito";
		}	
	}
	/**
	*Calcula el tamano de la lista
	* @param ArrayList
	*/
	 String calcularTamano(){
		if(lista.isEmpty()){
		return "No hay elementos aun, introduce elementos primero";
		}else{
			return ""+lista.size();}	
	}
	/**
	* Elimina un elemento de la lista segun indice
	* @param ArrayList
	* @param index
	*/
	 String eliminar(int index){
		if(lista.isEmpty()){
			return "No hay elementos aun, introduce elementos primero";
		}else if(lista.size()<=index || index<0){
			return "imposible encontrar esa posicion";
		}else{
			lista.remove(index);
			return "eliminado con exito";
		}
	}
	/**
	* Busca elementos en la lista segun indice
	* @param ArrayList
	* @param Index
	*/
	 String buscar ( int index){
		if(lista.isEmpty()){
			return "No hay elementos aun, introduce elementos primero";
		}else if(lista.size()<=index || index<0){
			return "imposible encontrar esa posicion";
		}else{
			return ""+lista.get(index);
		}
	}
	/**
	* Copia la lista
	* @param ArrayList
	*/
	 Object clonar(){
		if(lista.isEmpty()){
			return "No hay elementos aun, introduce elementos primero";
		}else{
			lista.clone();
			return "clonado con exito";
		}
	}
	
}
