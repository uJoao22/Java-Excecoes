public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	
	//Criando a referencia para o objeto Cliente
	private Cliente titular;
	
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) { //Se o saldo for menor do que o valor solicitado para sacar, faça
			//Lance a exceção criada com uma mensagem com os dados do saldo e valor 
			throw new SaldoInsuficienteException("Seu saldo é de: "+this.saldo+", Valor desejado para sacar: "+valor); 
		}
		
		this.saldo -= valor; 
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); //Se este método funcionar e retirar o valor da conta, ele irá seguir para a proxima linha de código, se não ele lançara uma execeção
		destino.deposita(valor); //Se for possivel retirar o dinheiro do remetente, deposite na conta do destinatario, usando o método deposita
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Agencia não pode ser menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("O número da conta não pode ser menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}