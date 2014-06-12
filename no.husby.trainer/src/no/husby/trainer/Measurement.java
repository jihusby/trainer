package no.husby.trainer;

public class Measurement {

	protected double weight;
	protected double bmiResult;
	protected int age;

	public Measurement(MeasurementData data, Athlete athlete) {
		age = data.getAge();
		weight = data.getWeight();
		bmiResult = calculateBMIResult(athlete, weight);
	}

	public double getWeight() {
		return weight;		
	}

	public double getBMI() {
		return bmiResult;		
	}

	protected double calculateBMIResult(Athlete athlete, double weight) {
		double height = athlete.getHeight()/100.0;
		return weight / Math.pow(height, 2);
	}

}