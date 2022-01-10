public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
	        metodo1();
	    } catch(ArithmeticException | NullPointerException | MinhaException ex) {
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
    	System.out.println("Inicio método 2");
    	metodo2();
    	System.out.println("Fim método 2");
    }
}