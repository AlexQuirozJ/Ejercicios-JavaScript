
public class Figuras {

	public static void main(String[] args) {
		//la figura: es donde vienen los metodos a llamar, osea solo llamas
		//la principal: es donde viene el main y colocas los objetos, area
		//las clases: colocas los metodos
		
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado ();
		Rectangulo rectangulo = new Rectangulo ();
		Circulo circulo = new Circulo ();
		
		Cuadrado areacuadrado = new Cuadrado ();
		System.out.println("El areal del cuadrado es:" + cuadrado.area);
		
		Rectangulo arearectangulo = new Rectangulo ();
		System.out.println("El area del rectangulo es: " + rectangulo.areaRec);
		
		Circulo areacirculo = new Circulo ();
		System.out.println("El area del circulo es: " + circulo.areaC);
	}

}
