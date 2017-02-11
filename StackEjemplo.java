package listadoEstructuras3;
/**
 * 9. Busca en la API de Java la collection Stack. Indica su nombre completo, explica su utilidad y entrega un 
 * código donde demuestres su uso.
 * 
 * Respuesta --> java.util.Stack<E> Se trata de una clase que era de Vector y sigue un orden de tipo lifo, por lo que resulta
 * de utilidad si deseamos hacer uso de una pila en la cual no queramos implementar nuevos metodos. 
 * @author pablo
 * @version 1.0
 */
import java.util.*;
public class StackEjemplo {

	public static void main(String[] args) {
		   // creating stack
		   Stack<Object> st = new Stack<Object>();
		      
		   //inserta elementos en el stack
		   st.push("elemento1");
		   st.push("elemento2");
		   st.push("elemento3");
		      
		   // relimina el ultimo elemento
		   System.out.println("Removed object is: "+st.pop());
		      
		   System.out.println("Elements after remove: "+st);
		   }    

	}
	

 