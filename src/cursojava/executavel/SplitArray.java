package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	
	public static void main(String[] args) {
		
		String texto = "odair,java,80,70,60,40";
		
		String[]valoresArray = texto.split(",");
		
		System.out.println("nome : "+ valoresArray[0]);
		System.out.println("curso : "+ valoresArray[1]);
		System.out.println("nota1 : "+ valoresArray[2]);
		System.out.println("nota2 : "+ valoresArray[3]);
		System.out.println("nota3 : "+ valoresArray[4]);
		System.out.println("nota4 : "+ valoresArray[5]);
		
		/* Convertendo um array em uma lista*/
		
		List<String> lista = Arrays.asList(valoresArray);
		
		for (String valorString : lista) {
			System.out.println(valorString);
			
		}
		/* Converter uma lista para Array*/
		
		String[] conversaoArray = lista.toArray(new String[6]);
		

		
		for(int pos = 0; pos < conversaoArray.length ; pos++) {
			
			System.out.println("Percorrendo array na posição  " + pos + "  = " + conversaoArray[pos]);
			
		}
		
		
		
		
	}

}

