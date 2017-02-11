package listadoEstructuras3;
public class TestPila {

	public static void main(String[] args) {
		
		
		
		Pila <Persona>pile = new Pila<Persona>();
		System.out.println(pile.top()); //Aun no hay elementos en la pila, devuelve null
		pile.push(new Persona(28,"Pablo","Leon","Alcaide"));
		pile.push(new Persona(56,"Antonio","Leon","Tallero"));
		pile.push(new Persona(55,"Paqui","Alcaide","Holanda"));
		System.out.println(pile.top()); //Devuelve el ultimo elemento de la pila
		pile.push(new Persona(30,"Antonio","Leon","Alcaide"));
		pile.push(new Persona(26,"Sonia","Leon","Alcaide"));
		pile.pop(); //Saca al ultimo elemento de la pila
		pile.push(new Persona(26,"Nieves","Borrero","Barea"));
		System.out.println(pile.toString()); //Muestra la pila completa
		
		while (!pile.getPila().isEmpty()) // Elimina uno a uno los elementos de la lista hasta que queda vacia
			System.out.println("\n Desapilo de la pila: "+pile.getPila().get(pile.getPila().size()-1));  
			pile.pop();
	}

}
