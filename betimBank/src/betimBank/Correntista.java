package betimBank;

public class Correntista {

    private int codigo;
    private String nome;
    private int numeroConta;
    private double saldoConta = 0;
    private double limiteConta = 1000;
    private static int geraCodigo = 2024;
    private static int geraContaNumero = 1;
    private static int qntCorrentista = 0;

    // Construtor
    // public Correntista(String nome) {
    // this.codigo = (geraCodigo++);
    // this.numeroConta = (geraContaNumero++);
    // this.nome = nome;
    // Correntista.qntCorrentista += 1;
    // }

    public int getCodigo() {
    	return codigo;
    }
    
    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Deposito
    public void opDeposito(double valor) {
        this.saldoConta += valor;
    }

    // Saque
    public void opSaque(double valor) {
        this.saldoConta -= valor;
    }

    // Transferencia
    public void opTranferencia(Correntista destino, double valor) {
        destino.saldoConta += valor;
        this.saldoConta -= valor;
    }

    // Relatorio Saldo
    public void opRelSaldo() {
        System.out.println("Numero Conta: " + this.numeroConta);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$ " + this.saldoConta);
    }

    @Override
    public String toString() {
        return "Correntista{"
                + "codigo=" + codigo + ", nome=" + nome +
                ", numeroConta=" + numeroConta + ", saldoConta=" + saldoConta +
                ", limiteConta=" + limiteConta + '}';
    }
}