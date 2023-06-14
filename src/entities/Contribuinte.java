package entities;

public abstract class Contribuinte {
	private String name;
	private Double rendimentAnual;

	public Contribuinte() {
	}

	public Contribuinte(String name, Double rendimentAnual) {
		this.name = name;
		this.rendimentAnual = rendimentAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendimentAnual() {
		return rendimentAnual;
	}

	public void setRendimentAnual(Double rendimentAnual) {
		this.rendimentAnual = rendimentAnual;
	}
	
	public abstract double taxa();

}
