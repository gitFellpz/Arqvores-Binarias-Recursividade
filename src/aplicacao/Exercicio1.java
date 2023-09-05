package aplicacao;

import arvores.ABBint;

public class Exercicio1 {

	public static void main(String[] args) {
		
		ABBint abb = new ABBint();
		
		System.out.println("\nQuantidade de nos da ABB "+ abb.contaNos(abb.root,0));
		abb.root = abb.inserir(abb.root, 30);
		abb.root = abb.inserir(abb.root, 20);
		abb.root = abb.inserir(abb.root, 25);
		abb.root = abb.inserir(abb.root, 40);
		
		System.out.println("Apresentando os elementos da ABB");
		abb.listaEmOrdem(abb.root);
		
		System.out.println("\nQuantidade de nos da ABB "+ abb.contaNos(abb.root,0));
		
		
	}

}
