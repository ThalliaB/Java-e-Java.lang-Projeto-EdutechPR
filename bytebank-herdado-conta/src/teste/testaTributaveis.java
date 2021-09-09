package teste;

public class testaTributaveis {

	public static void main(String[] args) {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		modelo.seguroDeVida seguro = new modelo.seguroDeVida();
		
		modelo.calculadorDeImposto calc = new modelo.calculadorDeImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}
	
}
