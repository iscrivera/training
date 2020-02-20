package codigo;

public class pricipal {
	public static void main(String[] args) {
		
		Reloj r = new Reloj();
		r.imprimirHora(); // Imprimir hora por defaul
		r.imprimirHora();  //Subir 1 hora
		r.incrementarMinutos(); //Subir 1 minuto
		r.incrementarMinutos(); //Subir 1 hora
		r.setHora(23);
		r.imprimirHora();
		r.incrementarHora();
		r.imprimirHora();
		r.setHora(32);//Envia error
		r.setMinutos(80);//Envia error
		r.setSegundos(-1); //Envia error

	}

}
