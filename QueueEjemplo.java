package listadoEstructuras3;
/**
 * Busca en la API de Java la collection Queue. Indica su nombre completo, explica su
 * utilidad y entrega un código donde demuestres su uso
 * Respuesta --> public interface Queue<E> esta clase permite almacenar objetos de un tipo y luego recuperarlos 
 * en el orden en el cual se insertaron
 * @author pablo leon alcaide
 * version 1.0
 */
import java.util.*;
public class QueueEjemplo {

	public static void main(String[] args) {
		 Queue <Object>queue = new LinkedList<Object>();
	        
		 	//con add puede saltar una excepción si algo falla al añadir un elemento
	        queue.add("item1");
	        queue.add("item2");
	        
	        //con offer nos devuelve un null si algo falla al añadir un elemento
	        queue.offer("Item3");
	        queue.offer("Item4");
	 
	        //Eliminar el primer elemento de la cola. si algo falla lanzará una excepcion 
	        System.out.println("remove: " + queue.remove());
	 
	        //Observar que elemento esta en el primer puesto de la fila sin eliminarlo.SI algo falla lanzará una excepcion
	        System.out.println("element: " + queue.element());
	        
	        //Eliminar el primer elemento de la cola.Si algo falla devuelve un false
	        System.out.println("poll: " + queue.poll());
	 
	        //Observar que elemento esta en el primer puesto de la fila sin eliminarlo. Si algo falla devuelve null
	        System.out.println("peek: " + queue.peek());
		
	}

}
