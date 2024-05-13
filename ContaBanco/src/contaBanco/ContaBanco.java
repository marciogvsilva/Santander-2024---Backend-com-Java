package contaBanco;

import java.math.BigDecimal;

public class ContaBanco {
  private int numeroConta;
  private String agencia;
  private String nomeCliente;
  private BigDecimal saldo;

  public ContaBanco(int numeroConta, String agencia, String nomeCliente, Float saldo){
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldo = new BigDecimal(saldo);
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }
  
  public int getNumeroConta() {
    return numeroConta;
  }

  public String getAgencia() {
    return agencia;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }
}
