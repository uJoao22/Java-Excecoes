public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		try {
			cc.transfere(10.0, cp);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}