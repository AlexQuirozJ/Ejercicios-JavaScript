
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal animal = new Animal();
		//System.out.println("Super Clase Animal:" + animal.comer());
		
		Perro canelo = new Perro();
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		
		Gato pulgas = new Gato();
		System.out.println(pulgas.comer());
	}

}
