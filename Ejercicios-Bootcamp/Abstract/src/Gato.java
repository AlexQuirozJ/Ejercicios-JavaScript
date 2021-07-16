
public class Gato extends Animal implements Mascota{
	int num_bigotes;
	String color;
	int vidas_disponibles=9;
	
	@Override
	public String comer() {
		return"comiendo atun";
	}
	
	

}
