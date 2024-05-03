package at_1;

public class Despesa{
	
	private int meses;
	
	public Despesa() {
		this.meses = meses;
	}
	
	public int getMeses() {
		return meses;
	}
	
	public void SetMeses(int meses) {
		this.meses = meses;	
	}
	
	@Override
	public String toString() {	
			return  "" + getMeses();
	}
} 
