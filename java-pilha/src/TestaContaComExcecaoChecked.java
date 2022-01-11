public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

    	//Instanciando a class Conta
        Conta c = new Conta(); 
        
        try { //Testando o método abaixo
            c.deposita(); //Chamando o método deposita da class Conta
        } catch(MinhaException ex) { //Tratando em caso da minha execeção
            System.out.println("tratamento ....");
        }

    }
}