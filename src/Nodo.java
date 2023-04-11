
public class Nodo {
	
//Classe NODO utizinada para instaciar os nós da arvore e sua altura
	private int num;
	private int altura;
	private Nodo esquerda;
	private Nodo direita;
	
	//Contrutor recebendo int num como parametro
	
	public Nodo(int num) {
		
		this.num = num;
		this.altura = 1;
		this.esquerda = null;
		this.direita = null;
	}
	// Gets e Sets das variáveis
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Nodo getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}
	public Nodo getDireita() {
		return direita;
	}
	public void setDireita(Nodo direita) {
		this.direita = direita;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
