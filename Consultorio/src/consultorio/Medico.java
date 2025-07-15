package consultorio;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	
	
	public Medico(String nombre, String apellido, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	@Override
	public String toString() {
		return "M�dico:" + nombre + apellido;
	}
	
	public float calcularIMC(Paciente paciente) {
		float imc=0;
		imc = paciente.getPeso()/(paciente.getEstatura()*paciente.getEstatura());
		return imc;
	}
	
	



}
