package at_1;

public class Despesa_total {
	Despesa[] despesa = new Despesa[3];
		
	private int total_despesa;
	
	/*public Despesa_total() {
		this.total_despesa = total_despesa;
	}*/
	
	public void despesa_total() {		
		for (int i = 0; i < despesa.length; i++) {
			despesa[i] =  new Despesa();

			this.total_despesa += despesa[i].getMeses(); 
		}
	}
	
	public void mostrar_total() {
		System.out.println("TOTAL => " + this.total_despesa);
	}
}
