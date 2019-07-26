package com.db1.contacorrente;

import java.util.ArrayList;
import java.util.List;

import com.db1.contacorrente.infra.Verificadora;

// Comportamentos
// depositar
// sacar
// criar a conta

// saldo

public class ContaCorrente {

	private String agencia;

	private String numero;

	private String cliente;

	private Double saldo;

	private List<String> historico;

	public ContaCorrente(String agencia, String numero, String cliente) {
		Verificadora.verificaStringValida(agencia, "Deve ser informada uma  ag�ncia v�lida");
		Verificadora.verificaStringValida(numero, "Deve ser informada um n�mero de conta v�lido");
		Verificadora.verificaStringValida(cliente, "Deve ser informada um cliente v�lido");
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.0;
		this.historico = new ArrayList<String>();
	}
	
	public void depositar(Double valor) {		
		Verificadora.valorMaiorQueZero(valor, "Valor a ser depositado deve ser maior que zero");
		this.saldo += valor;
		this.historico.add("Depositado: R$ " + valor);
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public List<String> getHistorico() {
		return historico;
	}
}
