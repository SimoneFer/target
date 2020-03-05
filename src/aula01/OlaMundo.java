package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OlaMundo {
	
	static Boolean meuBoolean = false;
	
	public static void main(String[] args) {
		
		
		
		int codigoPedigree = 12232;
		Integer CodigoPedigree = 12232;
		float pesoAnimal = 50.5f;
		double precoAnimal = 1800.50d;
		short alturaAnimal = 95;
		long comprimentoAnimal = 120;
		byte idadeAnimal = 127;
		boolean temDono = true;
		Character letraInicialAnimal = 'D';
		
		Integer idade = 18;
		Double valor = 35.19;
		
		valor = Double.valueOf(idade);
		System.out.println(valor);
		
		
		String minhaString = "Target Trust";
		
	String	minhaString1 = "Target Trust";
		
		Double wrapper = 2.0;
		double primitivo = 2.0;
		
		byte b = 1;
		wrapper = (double) b;
		
		System.out.println(minhaString.substring(2));
		System.out.println(minhaString1.substring(9));
		System.out.println(wrapper);
		System.out.println(primitivo);
		System.out.println(minhaString.concat(" Trust"));
		
		System.out.println(codigoPedigree);
		System.out.println(pesoAnimal);
		System.out.println(precoAnimal);
		System.out.println(comprimentoAnimal);
		
		System.out.println(codigoPedigree + CodigoPedigree);
		
		BigDecimal valorCheio = new BigDecimal("150");
		BigDecimal dezPorCentoDoValor = valorCheio.multiply(new BigDecimal("0.1"));
		System.out.println(dezPorCentoDoValor);
		
		BigDecimal valorCheio1 = new BigDecimal("150.97");
		BigDecimal dezPorCentoDoValor1 = valorCheio1.multiply(new BigDecimal("0.1"));
		System.out.println(dezPorCentoDoValor1.setScale(2, RoundingMode.HALF_EVEN));
		
		System.out.println(!meuBoolean);
		
		OlaMundo mundo = new OlaMundo();
		double r = mundo.soma(1.0, 2.0);
		
	
		System.out.println(r);
		
		OlaMundo om = new OlaMundo();
		double resultado = om.subt(7.0, 2.0);
		
		System.out.println(" resultado da subtração="+resultado);
		
		OlaMundo olaMundo = new OlaMundo();
		double segundovalor = 1024.0;
		segundovalor = segundovalor - 100.0;
		double resulta = olaMundo.soma(1.0, segundovalor);
		System.out.println("O resultado da minha soma é " + resultado);
		
		om.imprimeNaTelaBoaNoite();
		System.out.println("Boa Noite");
		
		
	}
	
	public Double soma(Double d1, Double d2) {
		return d1 + d2;
	}
	
	public Double subt(Double d7, Double d2) {
		return d7 - d2;
	}
	
	private void imprimeNaTelaBoaNoite() {
		
	}
	
	

}



