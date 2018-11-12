package projeto;

public class PassagemValorParametro {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-5678","contato@gmail.com"); //Instancia o objeto contato do tipo Contato
		int valor = 10; //Variável local
		
		System.out.println("******|Valores Originais|******");
		System.out.println(contato);
		System.out.println(valor);
		
	
		System.out.println("******|Teste 1|******");
	
		testePassagemValorReferencia(valor, contato); //Chama o método 1
		
		System.out.println(contato);
		System.out.println(valor);
		
		
		System.out.println("******|Teste 2|******");
		
		testePassagemValorReferencia2(valor, contato); //Chama o método 2
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	//Método 1
	private static void testePassagemValorReferencia(int valor, Contato contato) //Cria uma cópia dos valores e variáveis "valor" e "contato" com o escopo do método
	{
			int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-6789", "contato2@gmail.com");
	}
	
	//Método 2
	private static void testePassagemValorReferencia2(int valor, Contato contato) //Aloca novamente com um novo endereço de memória, permitindo a alteração do dado dento do objeto
	{
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato"+novoValor);
	}

}
