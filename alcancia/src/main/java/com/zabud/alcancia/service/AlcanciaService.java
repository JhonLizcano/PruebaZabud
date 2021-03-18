package com.zabud.alcancia.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlcanciaService {
	
	private Map<Integer, Long> monedasAgrupadas;
	
	public void agruparMonedas(List<Integer> alcancia) {
		this.monedasAgrupadas = alcancia.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	public long cantidadMonedaPorDenominacion(int denominacion) {
		return monedasAgrupadas.get(denominacion);
	}
	
	public long dineroPorMonedaDenominacion(int denominacion, long cantidad) {
		return denominacion * cantidad;
	}
	
	public long retornarTotalAhorrado(List<Integer> alcancia) {
		long resultado = 0L;
		for (int moneda : alcancia) {
			resultado += moneda;
		}
		return resultado;
    }
	
	public Integer cantidadMonedas(List<Integer> alcancia) {
		return alcancia.size();
	}
}