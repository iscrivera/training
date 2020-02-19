package mx.ejercicio.gama;


import java.util.Calendar;
import java.util.Date;

public class ActaDeNacimiento {

	private String primerApellido;
	private String segundoApellido;
	private String nombre;
	private Date fechaNacimiento;
	private String lugarNacimiento;
	private String curp;


	/**
	 * 
	 */
	public ActaDeNacimiento() {
		super();
	}

	/**
	 * @param primerApellido
	 * @param segundoApellido
	 * @param nombre
	 * @param fechaNacimiento
	 * @param lugarNacimiento
	 * @param curp
	 */
	public ActaDeNacimiento(String primerApellido, String segundoApellido, String nombre, Date fechaNacimiento,
			String lugarNacimiento, String curp) {
		super();
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacimiento = lugarNacimiento;
		this.curp = curp;
	}
	
	public boolean isAdulto() {
		Calendar fechaActual = Calendar.getInstance();
		Calendar fechaNacimientoCalendar = Calendar.getInstance();
		fechaNacimientoCalendar.setTime(this.fechaNacimiento);
		
		// Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNacimientoCalendar.get(Calendar.YEAR);
		
		return years >= 18;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the lugarNacimiento
	 */
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	/**
	 * @param lugarNacimiento the lugarNacimiento to set
	 */
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public String getDetalles() {
		return "Nombre: " + this.nombre + "\n Primer";
	}

	@Override
	public String toString() {
		return "ActaDeNacimiento [primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", lugarNacimiento=" + lugarNacimiento
				+ ", curp=" + curp + "]";
	}
}
