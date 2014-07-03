package pl.altkom.jpr.advanced.mod01.reservation;

import java.util.Date;

public class AbroadTrip extends Trip {
	int inssurance;

	public AbroadTrip (Date start, Date end, String destination) {
		super(start, end, destination);
	}

	public int getPrice() {
		return super.getPrice()+inssurance;
	}

	public void setInssurance(int inssurance) {
		this.inssurance = inssurance;
	}
}
