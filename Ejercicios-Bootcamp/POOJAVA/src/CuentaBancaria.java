
public class CuentaBancaria {
	
//ATRIBUTOS	DE LA CLASSE
	String institucion="";
	String beneficiario="";
	float saldo=0;
	long cuenta=0;
	String producto="";
	String direccion="";
	String RFC="";

	//ESTO ES UN CONSTRUCTOR
	CuentaBancaria(String beneficiario, float saldo) {
		this.beneficiario = beneficiario; //haces referencia al atributo de la clase CuentaBancaria
		this.saldo= saldo;
	}
	
	
	
//METODOS DE LA CLASSE
	public void depositos(float monto) {
		this.saldo= this.saldo + monto;
	}

	public void retiros(float monto) {
		if(monto <this.saldo && monto > 0) {
			this.saldo=this.saldo - monto;
		}

	}

	public float consultarSaldo() {
		return this.saldo;

	}

	public String estadoDeCuenta() {
		return"";
	}

}