package cursojava.classes;

import java.util.Arrays;

public class Disciplina {
	
	
	/* Classe Disciplina servirá para todos objetos e instancia de disciplina*/
	
	private double [] nota = new double [4]; /*No mundo real podemos ter para cada disciplina, 4 notas durante ano .*/
	private String disciplina;
	
	
	
	
	
	/* Metodos set , get , hash , equals ,  to string */
	
	
	
	public String getDisciplina() {
		return disciplina;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for ( int pos = 0; pos < nota.length ; pos ++) {
			somaTotal = somaTotal + nota[pos];
			
		}
		return somaTotal / 4;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	

}

