

package codigo;

public class Principal {

	public static void main(String[] args) {
		// Crear objetos
		// NombreClase objeto = new Constructor ();
		cuenta cuentaUno = new cuenta();
		// Invocamos al metodo verCuenta
		cuentaUno.verCuenta();

		cuenta cuentaDos = new cuenta("jose", "Hdz", 145, "sdy6", 2133);
		
		//cuentaDOS.verCuenta();
		System.out.println("usando los get");
		System.out.println("cuenta:" +cuentaDos.getNumero_Cuenta());
		System.out.println("nombre: " +cuentaDos.getCliente_Nombre());
		
		cuentaDos.setCliente_Apellido("Hernandez");
		System.out.println("Apellido: "+cuentaDos.getcliente_apellido());
		cuentaDos.setSaldo(24000.35);
		System.out.println("Saldo: "+ cuentaDos.getSaldo());
		
		cuentaDos.retirar(20000);
		System.out.println("Saldo:" + cuentaDos.getSaldo());
		cuentaDos.retirar(4398899);
		
		
	
		cuentaDos.depositar(100.00);
		System.out.println("saldo:" + cuentaDos.getSaldo());
		cuentaDos.depositar(-100);
	
	    }
	}