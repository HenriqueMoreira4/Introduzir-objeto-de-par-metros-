package metodo_introduzir;
import java.util.Scanner;
import java.util.Scanner;


public class principal {
	
	public static void main(String[] args) {
		String nomeAluno;
		int idadeAluno;
		Scanner entrada = new Scanner(System.in);
		
		enviaMensagem oi = new enviaMensagem();
		
		System.out.println("Qual seu nome? ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Qual sua idade? ");
		idadeAluno = entrada.nextInt();
		
		oi.boasVindas(nomeAluno, idadeAluno);
		
		entrada.close();
		oi.enviaMensagem(); 
	}

}
