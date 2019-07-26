package com.db1.contacorrente.infra;

import org.junit.Assert;
import org.junit.Test;

public class VerificadoTest {
	
	@Test
	public void deveRetornarExceptionQuandoValorNull() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida(null, "Valor n�o pode ser nulo");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Valor n�o pode ser nulo", mensagem);
	}
	
	@Test
	public void deveRetornarExceptionQuandoValorVazio() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("   ", "Valor n�o pode ser vazio");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Valor n�o pode ser vazio", mensagem);	
	}
	
	@Test
	public void naoDeveRetornarExceptionQuandoValorValido() {
		String mensagem = null;
		try {
			Verificadora.verificaStringValida("DB1 Start", "Valor n�o pode ser vazio");
		} catch (RuntimeException e) {
			mensagem = e.getMessage();
		}
		Assert.assertNull(mensagem);
	}

}
