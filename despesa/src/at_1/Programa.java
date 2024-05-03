package at_1;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws Exception{

		Despesa despesa[] = new Despesa[3]; // Cria um array do objeto
		//Despesa desp = new Despesa();
		Despesa_total total = new Despesa_total();
		
		Scanner scan = new Scanner(System.in);
		
		String array[] = {"Janeiro", "Fevereiro", "Marco"}; // Os meses referentes
		
		int input; // Recebe os valores do usuário
		
		try { // Tratemento de erros
			System.out.println("Despesas referente ao primeiro trimestre");
			for (int i = 0; i < despesa.length; i++) {
				
				despesa[i] = new Despesa(); // Inicializa o array do objeto 
				
				System.out.println(array[i] + " => "); // Mostra o mês referente
				input = scan.nextInt();
				despesa[i].SetMeses(input); // Armazena o valor no array		
			}	 
		} catch (Exception e){ // Pega um erro se houver
			e.printStackTrace();
		}
		
		// Imprime a despesa de cada mês 
		System.out.println("Despesas de cada mes");
		for (int i=0; i < despesa.length; i++) {
			System.out.println(array[i] + " => " );
			System.out.println(despesa[i].toString()); 
		}
		scan.close();
		
		total.despesa_total();
		total.mostrar_total();
	}
}
