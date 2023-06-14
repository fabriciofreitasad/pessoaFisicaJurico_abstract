package entities;

public class Fisico extends Contribuinte {
	private Double gastoSaude;

	public Fisico() {
		super();
	}

	public Fisico(String name, Double rendimentAnual, Double gastoSaude) {
		super(name, rendimentAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double taxa() {
		double taxaBasica;
		if (getRendimentAnual() < 20000.00) {
			taxaBasica = getRendimentAnual() * 0.15;
		} else {
			taxaBasica = getRendimentAnual() * 0.25;
		}
		taxaBasica -= getGastoSaude() * 0.5;
		if (taxaBasica < 0.0) {
			taxaBasica = 0.0;
		}
		return taxaBasica;
	}

}
