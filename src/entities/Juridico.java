package entities;

public class Juridico extends Contribuinte {

	private Integer numeroEmpregado;

	public Juridico() {
		super();
	}

	public Juridico(String name, Double rendimentAnual, Integer numeroEmpregado) {
		super(name, rendimentAnual);
		this.numeroEmpregado = numeroEmpregado;
	}

	public Integer getNumeroEmpregado() {
		return numeroEmpregado;
	}

	public void setNumeroEmpregado(Integer numeroEmpregado) {
		this.numeroEmpregado = numeroEmpregado;
	}

	@Override
	public double taxa() {
		if(numeroEmpregado > 10) {
			return getRendimentAnual() * 0.14;
		}else {
			return getRendimentAnual() * 0.16;
		}
		
		

	}

}
