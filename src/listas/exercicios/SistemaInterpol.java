package listas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	private List<String> procurados;
	
	public SistemaInterpol() {
		this.procurados = new ArrayList<String>();
	}
	
	public void adicionarProcurado(String nome) {
		this.procurados.add(nome);
	}
	
	public boolean ehProcurado(String nome) {
		for(String procurado : this.procurados) {
			if(procurado.equals(nome))
				return true;
		}
		return false;
	}
	
//	public boolean ehProcurado(String nome) {
//		//contains só vai funcionar se o equals estiver sobrescrito
//		//em String, o **equals** já é naturalmente sobrescrito
//		return this.procurados.contains(nome);
//	}
	
	public static void main(String[] args) {
		SistemaInterpol interpol = new SistemaInterpol();
		interpol.adicionarProcurado("Eduardo");
		interpol.adicionarProcurado("Raquel");
		interpol.adicionarProcurado("Niverton");
		interpol.adicionarProcurado("Pedro");
		
		System.out.println("Eduardo eh procurado? "+interpol.ehProcurado("Eduardo"));
		System.out.println("Barbara eh procurada? "+interpol.ehProcurado("Barbara"));
	}

}
