package listadoEstructuras3;

import utiles.*;

public class TestColaMenu {
	static Menu menu;
	static Cola<Persona> queue;

	public static void main(String[] args) {
		menu = new Menu("Menu Cola", new String[] { "insertar elemento",
				"mostrar primer elemento", "sacar primer elemento",
				"mostrar todo", "eliminar todo" });
		queue = new Cola<Persona>();
		do {
			switch (menu.gestionar()) {
			case 1:
				insert();
				break;
			case 2:
				getFront();
				break;
			case 3:
				queue.dequeue();
				break;
			case 4:
				queue.toString();
				break;
			case 5:
				removeAll();
				break;
			}
		} while (Teclado.deseaContinuar("Continuar S-N"));
	}

	private static void getFront() {
		System.out.println(queue.getFront());
	}

	/**
	 * Introduce un elemento de tipo Persona, extraído del menú para despejar su
	 * contenido.
	 */
	private static void insert() {
		queue.enqueue(new Persona(Teclado.leerEntero("introduce edad"), Teclado
				.leerCadena("introduce nombre"), Teclado
				.leerCadena("introduce apellido 1"), Teclado
				.leerCadena("introduce apellido 2")));
	}

	/**
	 * Elimina todos los elementos de la Cola, extaído del menú para despejar su
	 * contenido.
	 */
	private static void removeAll() {
		while (!queue.getLista().isEmpty()) {
			System.out.println("Elemento eliminado:" + queue.getFront());
			queue.dequeue();
		}
	}

}
