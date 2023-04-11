import java.util.Scanner;

public class Program{

	public static void main(String[] args) {


		Scanner scan =  new Scanner(System.in);
		AVL avl = new AVL();
		
		Boolean repeat = true;
		
		while (repeat) {
			//menu
			System.out.println("1 ----- Inserir");
			System.out.println("2 ----- Em ordem");
			System.out.println("3 ----- Pré ordem");
			System.out.println("4 ----- Pos ordem");
			System.out.println("5 ----- Sair");
			int opcion = scan.nextInt();

			if(opcion == 1) {
				System.out.println("Digite um número inteiro para inserir na árvore :");
				int num = scan.nextInt(); 

				if(!avl.inserir(num)) { //verifica se o numero que o usuário digitou é igual a algum nó da arvore
					System.out.println("Não foi possível inserir o valor "+ num
							+" pois já existe um elemento com esse valor");
				}
			}else if(opcion == 2) {

				// Imprime a árvore em ordem 
				System.out.println("\nÁrvore em ordem crescente:");
				avl.imprimirEmOrdem();
				System.out.println("\n");
				
			}else if(opcion == 3) {

				// Imprime a árvore pre ordem 
				System.out.println("\nÁrvore pre ordem:");
				avl.imprimirPreOrdem();
				System.out.println("\n");
			}else if(opcion == 4) {

				// Imprime a árvore pos ordem 
				System.out.println("\nÁrvore pos ordem:");
				avl.imprimirPosOrdem();
				System.out.println("\n");
				
			}else if(opcion == 5) {
				//para o loop
				repeat = false;
			}
			else {
				System.out.println("Opção inválida");
			}



		}



	}



}