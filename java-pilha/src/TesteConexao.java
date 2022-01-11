public class TesteConexao {

	public static void main(String[] args) {

		
		//Instanciando a conexão através do try, de tal forma ele precisa assinar o contrato, implementar a interface de 
		//AutoCloseable e após o teste do try ele já implementa o finally com o método close por debaixo dos panos
		try(Conexao con = new Conexao()){ 
			con.leDados(); //Testando o método leDados
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		// ---------------------------------------------- 
		
		/*
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		} finally {
			con.close();
		}
		
		*/
		
	}
	
}