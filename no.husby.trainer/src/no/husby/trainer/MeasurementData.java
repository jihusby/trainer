package no.husby.trainer;

import java.util.Date;

public class MeasurementData {
	private Date date;
	private double pulse;
	private int time;
	private int weight;
	private int age;

	public MeasurementData(Date date, double pulse, int time, int weight, int age) {
		this.date = date;
		this.pulse = pulse;
		this.time = time;
		this.weight = weight;
		this.age = age;
	}

	public Date getDate() {
		return date;
	}
	
	public double getPulse() {
		return pulse;
	}

	public int getTime() {
		return time;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
}
