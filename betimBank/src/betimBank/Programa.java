package betimBank;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Correntista[] c = new Correntista[10];
        
        Scanner scan = new Scanner(System.in);

        int op = 1;
        int cod = 1;
        String nome = "";

        try {
            while (op != 0) {
                System.out.println("1 => Adicionar"
                        + "\n2 => Localizar"
                        + "\n3 => Excluir"
                        + "\n4 => Listar"
                        + "\n5 => Depositar"
                        + "\n6 => Sacar"
                        + "\n7 => Transferir"
                        + "\n8 => Exportar Arquivo"
                        + "\n9 => Importar Arquivo"
                        + "\n0 => Sair"
                        + "\n==> ");
                op = scan.nextInt();
                switch (op) {
                    case 1:
                    	c[0] = new Correntista();
                    	
                    	for (int i = 0; i < c.length; i++) {
                    		c[i].setCodigo(cod++);
                        	
                            System.out.println("Nome => ");
                            nome = scan.next();
                            c[i].setNome(nome);
                    	}    	
                        break;
                        
                    case 2:
                    	System.out.println("Digite o codigo => ");
                    	cod = scan.nextInt();
                    	
                    	for (int i = 0; i < c.length; i++) {
                    		if (cod == c[i].getCodigo()) 
                        		System.out.println(c.toString());
                        	else 
                        		System.out.println("Inexistente");
                    	} 	
                }
            }
        } catch (Exception e) {
            System.err.println("Error! Operacao Invalida");
        }
        scan.close();
    }
}
