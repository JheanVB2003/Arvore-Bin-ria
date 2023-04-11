
public class AVL {
	//variávei raiz do tipo nodo
	private Nodo raiz;
	//metodo inserir verifica se a raiz é nula
	public Boolean inserir(int num) {
		if(raiz == null) { // se a raiz for nula
			raiz = new Nodo(num); //o primeiro numero digitado pelo usuário sera á raiz

		}else { //senão
			Nodo pai = null;
			Nodo noAtual = raiz; //instancia uma variavel noAtual do tipo Nodo recebendo Raiz
			
			while(noAtual != null) { //loop para noAtual diferente de nulo
				//verificando se o numero inserido é menor ou maior que o valor do nó existente
				if(num < noAtual.getNum()) { 
					//se for menor irá buscar nó para add ao lado esquerdo
					pai = noAtual; 
					noAtual = noAtual.getEsquerda();
				}else if(num > noAtual.getNum()) {
					//se for maior irá buscar o nó para add ao lado direito
					pai = noAtual;
					noAtual = noAtual.getDireita();
				}else {
					//caso o usuário digite um valor já presente no nó
					System.out.println("Um nó com esse valor foi encontrado!");
					return false;
				}

			}
			if(num < pai.getNum()) {
				//add nó a esquerda caso for menor
				pai.setEsquerda(new Nodo(num));
			}else {
				//add nó a direita caso for maior
				pai.setDireita(new Nodo(num));
			}
		}
		return true;

	}
	
	public  void imprimirEmOrdem() {
		imprimirEmOrdem(raiz);
	}

	// Função recursiva para imprimir a árvore em ordem crescente
	public static void imprimirEmOrdem(Nodo raiz) {
		if (raiz == null) {
			return;
		}
		imprimirEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNum() + " ");
		imprimirEmOrdem(raiz.getDireita());
	}
	public  void imprimirPreOrdem() {
		imprimirPreOrdem(raiz);
	}
	
	// Função recursiva para imprimir a árvore pre ordem
	public static void imprimirPreOrdem(Nodo raiz) {
		if (raiz != null) {
			System.out.print(raiz.getNum() + " ");
			imprimirPreOrdem(raiz.getEsquerda());
			imprimirPreOrdem(raiz.getDireita());
		}
		
	}
	public  void imprimirPosOrdem() {
		imprimirPosOrdem(raiz);
	}
	
	// Função recursiva para imprimir a árvore pos ordem
	public static void imprimirPosOrdem(Nodo raiz) {
		if (raiz != null) {
			imprimirPosOrdem(raiz.getEsquerda());
			imprimirPosOrdem(raiz.getDireita());
			System.out.print(raiz.getNum() + " ");
		}
		
		
	}

	

}
