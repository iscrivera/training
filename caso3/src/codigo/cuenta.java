package codigo;

public class cuenta {
	// Atributos de la clase
	// aceso tipDeDato nombreAtributo
	private String cliente_nombre;
	private int numeroCuenta;
	private String cliente_apellido;
	private String rfc;
	private double saldo;

	/*
	 * Constructor de la clase sin parametros acceso nombreclase()
	 */
	public cuenta() {
		// Darle valor inicial a los atributos
		this.cliente_nombre = "Vania";
		this.setCliente_Apellido("ledezma");
		this.numeroCuenta = 1156863;
		this.rfc = "BFE2138947HFI";
		this.saldo = 321834908.095;
	}// Fin del constructor
	/*
	 * contructor de la clase con parametros
	 */

	public cuenta(String _cliente_nombre, String _cliente_apellido, int _numeroCuenta, String _rfc, double _saldo) {
		// Asignamos el parametro al atributo
		// Atributo = parametro
		this.cliente_nombre = _cliente_nombre;
		this.setCliente_Apellido(_cliente_apellido);
		this.numeroCuenta = _numeroCuenta;
		this.rfc = _rfc;
		this.saldo = _saldo;
	}// Fin del constructor

	// Metodos GET
	public String getCliente_Nombre() {
		return this.cliente_nombre;
	}

	public String getcliente_apellido() {
		return this.cliente_apellido;
	}

	public int getNumero_Cuenta() {
		return this.numeroCuenta;
	}

	public String getRFC() {
		return this.rfc;
	}

	public double getSaldo() {
		return this.saldo;
	}

	// Metodo SET
	public void setCliente_Nombre(String cliente_nombre) {
		this.cliente_nombre = cliente_nombre;
	}

	public void setCliente_Apellido(String cliente_apellido) {
		this.cliente_apellido = cliente_apellido;
	}

	public void setNumero_Cuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setRFC(String rfc) {
		this.rfc = rfc;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/*
	 * Metodo para visualizar los datos de la cuenta
	 */
	public void verCuenta() {
		// System.out.println es para imprimir pantalla
		// El simbolo de + es para concatenar (unir)
		System.out.println("cliente: " + this.cliente_nombre + "apellido: " + this.cliente_nombre + "rfc: " + this.rfc
				+ "numero: " + this.numeroCuenta + "saldo: " + this.saldo);
	}

	// Metodo retirar
	public void retirar(double cantidad) {
		// Le resto la cantidad a retirar al saldo
		// Condicion
		if (saldo >= cantidad) {
			this.saldo = this.saldo - cantidad;
			System.out.println("Cantidad insuficiente sorry!");
		}
	}

	public void depositar(double cantidad) {
		if (cantidad >= 0) {
			this.saldo = this.saldo + cantidad;
		} else {
			System.out.println("Cantidad negativas no permitidas!");
		}
	}
}// Fin de la clase
