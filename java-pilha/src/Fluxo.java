public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
	        metodo1();
	    } catch(ArithmeticException | NullPointerException ex) {
	    	//Resgatando a mensagem de erro dada pela execeção
	    	String msg = ex.getMessage();
	    	System.out.println("Exception " + msg);
	    	
	    	//Resgatando o rastro da execeção, por onde ela passou
	    	ex.printStackTrace();
	    }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        //Criando uma execeção
        //Quando criada deve ser atribuida uma mensagem em seu constructor, se não será definida como null
        ArithmeticException ae = new ArithmeticException("Deu errado");
        //Lançando, jopgando a exeção no código
        throw ae;
        
//        System.out.println("Fim do metodo2");
    }
}