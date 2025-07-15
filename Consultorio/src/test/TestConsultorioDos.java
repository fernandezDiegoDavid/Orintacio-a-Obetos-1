package test;
import consultorio.Medico;
import consultorio.Paciente;

public class TestConsultorioDos {

	public static void main(String[] args) {
		Medico medico1= new Medico("Daniel", "Lopez", "Clinica Medica");
		Paciente paciente1 = new Paciente("José", "Pérez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernández", 1.60f, 90);
		
		System.out.println(medico1.toString());
		System.out.println(paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente1) );
		System.out.println(paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente2) );
		
		paciente1.setPeso(90);
		paciente2.setPeso(85);
		
		System.out.println(medico1.toString());
		System.out.println(paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente1) );
		System.out.println(paciente1.traerNombreCompleto()+": IMC "+medico1.calcularIMC(paciente2));
		
		
	}

}
