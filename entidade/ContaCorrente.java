package entidade;

public class ContaCorrente {
	public double limite;
    public double saldo;
    public String titular;
    public int numeroconta;
    
	





	public ContaCorrente(double limite, double saldo, String titular, int numeroconta) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.titular = titular;
		this.numeroconta = numeroconta;
	}







	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", saldo=" + saldo + ", titular=" + titular + ", numeroconta="
				+ numeroconta + "]";
	}
    
}
    