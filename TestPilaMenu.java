package listadoEstructuras3;

import utiles.*;

public class TestPilaMenu {
	static Menu menu;
	static Pila<Persona> pile;
	int opcion;

	public static void main(String[] args) {
		pile = new Pila<Persona>();
		menu = new Menu("Pila con Menu", new String[] {"Mostrar ultimo elemento", "Introducir elemento","Eliminar elemento", 
				"Borrar Todo" });
		do {
			switch (menu.gestionar()) {
			case 1:
				mostrarElemento();
				break;
			case 2:
				push();
				break;
			case 3:
				borrarElemento();
				break;
			case 4:
				vaciado();
				break;
			}
		} while (Teclado.deseaContinuar("Desea continuar? S - N"));
	}

	private static void push() {
		pile.push(new Persona(Teclado.leerEntero("introduce edad"),
				Teclado.leerCadena("introduce nombre"), Teclado.leerCadena("introduce apellido1"), 
				Teclado.leerCadena("introduce apellido2")));
	}

	private static void vaciado() {
		while (!pile.getPila().isEmpty()) {
			System.out.println("Desapilo de la pila: "
					+ pile.getPila().get(pile.getPila().size() - 1));
			pile.pop();
		}

	}

	private static void borrarElemento() {
		System.out.println("Elemento borrado: "
				+ pile.getPila().get(pile.getPila().size() - 1));
		pile.pop();
	}

	private static void mostrarElemento() {
		if (!pile.getPila().isEmpty())

			pile.top();
		else
			System.out.println("no hay elementos en la lista");

	}

}
