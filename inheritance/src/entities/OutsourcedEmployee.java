package entities;

public class OutsourcedEmployee extends Employee {

	private Double addicionalCharge;
	
	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
		super(name, hours, valuePerHour);
		this.addicionalCharge = addicionalCharge;
	}

	public Double getAddicionalCharge() {
		return addicionalCharge;
	}

	public void setAddicionalCharge(Double addicionalCharge) {
		this.addicionalCharge = addicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + 1.1 * addicionalCharge;
	}

}
