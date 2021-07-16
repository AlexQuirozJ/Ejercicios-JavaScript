
public class Principal {

	public static int numerador=10;
	public static Integer divisor=null;
	public static float division;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("Antes de la division");
		try {
			division=numerador/divisor;
			//esta linea lo que te dice es que, si recibes el error Arithmetic
			//entonces almacenalo en ex, e imprimelo abajo, concatenalo con getMessage
			// si tu pones en vez de Arithmetic, pones solo exception, te traes todo los errores
			//catch(Exception ex) 
		} catch (ArithmeticException ex) {
			division=0;
			System.out.println("Error" + ex.getMessage());
		} catch (NullPointerException ex2) {
			division=0;
			System.out.println("Error" + ex2.getMessage());
			
		}finally {
			System.out.println("despues de la division");
		}*/
	
		String frutas [] = {"Mango", "Pera", "Uva", "Fresa"};
		
		for (String fruta:frutas) {
			System.out.println(fruta);
			
		}
	
	}
	
}
