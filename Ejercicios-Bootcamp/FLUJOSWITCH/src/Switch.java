
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * Switch () {
		 * case 1:
		 * codigo
		 * codigo 
		 * codigo
		 * break;
		 * case 2:
		 * codigo
		 * codigo 
		 * codigo
		 * break;
		 * default: codigo por defecto
		 * */
		
		int día = 1;
		String mensaje = "";
		
		switch(día) {
		case 1:
			mensaje="lunes";
			break;
		case 2:
			mensaje="martes";
			break;
		case 3:
			mensaje="miercoles";
			break;
		case 4:
			mensaje="jueves";
			break;
		case 5: 
			mensaje="viernes";
			break;
		case 6:
			mensaje="sabado";
			break;
		case 7:
		//case "a"
			mensaje="domingo";
			break;
		default: 
			mensaje="invalido";
			break;
			
		}
		System.out.println(mensaje);
	}
	

}
