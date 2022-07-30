import java.util.Scanner;

public class CalculadoraSimples {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("\n+...Calculadora...+\n");

		System.out.print("Digite o primeiro valor: ");
		Double valorProduto1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		Double valorProduto2 = scanner.nextDouble();
		
		System.out.println("\nInforme a opção desejada: \n1-Soma \n2-Subtração \n3-Divisão \n4-Multiplicação \n");
		System.out.print("Escolha o calculo: ");
		int calculo = scanner.nextInt();
		
		System.out.print("RESULTADO: ");
		if(calculo == 1) {
			System.out.println(valorProduto1 + valorProduto2);
		} else if (calculo == 2) {
				 System.out.println(valorProduto1 - valorProduto2);
			} else if (calculo == 3) {
				 System.out.println(valorProduto1 / valorProduto2);
			} else if (calculo == 4) {
				 System.out.println(valorProduto1 * valorProduto2);
			} 
		
			System.out.println("\n+........fim.......+");
			
			scanner.close();
		
	
	}
		
		
		
	
}
