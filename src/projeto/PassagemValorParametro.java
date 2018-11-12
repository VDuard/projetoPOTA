package projeto;

public class PassagemValorParametro {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-5678","contato@gmail.com"); //Instancia o objeto contato do tipo Contato
		int valor = 10; //Vari�vel local
		
		System.out.println("******|Valores Originais|******");
		System.out.println(contato);
		System.out.println(valor);
		
	
		System.out.println("******|Teste 1|******");
	
		testePassagemValorReferencia(valor, contato); //Chama o m�todo 1
		
		System.out.println(contato);
		System.out.println(valor);
		
		
		System.out.println("******|Teste 2|******");
		
		testePassagemValorReferencia2(valor, contato); //Chama o m�todo 2
		
		System.out.println(contato);
		System.out.println(valor);
		
	}
	
	//M�todo 1
	private static void testePassagemValorReferencia(int valor, Contato contato) //Cria uma c�pia dos valores e vari�veis "valor" e "contato" com o escopo do m�todo
	{
			int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-6789", "contato2@gmail.com");
	}
	
	//M�todo 2
	private static void testePassagemValorReferencia2(int valor, Contato contato) //Aloca novamente com um novo endere�o de mem�ria, permitindo a altera��o do dado dento do objeto
	{
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato"+novoValor);
	}

}
