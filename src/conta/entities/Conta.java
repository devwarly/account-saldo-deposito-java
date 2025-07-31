package conta.entities;

public class Conta {
	private int numAccount;
	private String nomeTitular;
	private double saldoAccount;

	 public Conta(int numAccount, String nomeTitular) {
		this.numAccount = numAccount;
		this.nomeTitular = nomeTitular;
	}
	 
	 public Conta(int numAccount, String nomeTitular, double initDeposit) {
			this.numAccount = numAccount;
			this.nomeTitular = nomeTitular;
			deposito(initDeposit);
		}
	 
	 public int getNumAccount() {
		 return numAccount;
	 }
	 
	 public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	 }
	 
	 public String getNomeTitular() {
			return nomeTitular;
	 }
	 
	 public double getSaldoAccount() {
		 return saldoAccount;
	 }
	 
	 public void deposito(double amount) {
		 this.saldoAccount += amount;
	 }
	 
	 public void saque(double amount) {
		 this.saldoAccount -= amount + 5.0;
	 }
	 
	 public String toString() {
		 return String.format("Nome: %s%nConta: %d%nSaldo: R$ %.2f%n", getNomeTitular(), getNumAccount(), getSaldoAccount());
	 }
}

