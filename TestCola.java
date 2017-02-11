package listadoEstructuras3;
public class TestCola {
	
	
	public static void main(String[] args) {
		Cola<Persona> Stark = new Cola<Persona>();
		Stark.enqueue(new Persona(50,"Ned","Stark","de Invernalia"));
		Stark.enqueue(new Persona(45,"Catelyn","Stark","de Invernalia"));
		Stark.enqueue(new Persona(25,"Rob","Stark","de Invernalia"));
		Stark.enqueue(new Persona(23,"John","Nieve","no sabe nada"));
		
		System.out.println(Stark.toString());
		System.out.println("El primer elemento de la cola es: "+Stark.getFront());
		
		Stark.dequeue();
		
		System.out.println("Ahora el primer elemento es: "+Stark.getFront());
		
		while(!Stark.getLista().isEmpty()){
			System.out.println("D.E.P: "+Stark.getFront());
			Stark.dequeue();
		}
	}

}
