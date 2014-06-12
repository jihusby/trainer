package no.husby.trainer;

public class OxygenMeasurement extends Measurement {

	private final double START_VALUE_MEN = 184.9;
	private double oxygenResult;
	public OxygenMeasurement(MeasurementData data, Athlete athlete) {
		super(data, athlete);
		oxygenResult = calculateOxygenResult(data);
	}

	public double getOxygenResult() {
		return oxygenResult;		
	}

	private double calculateOxygenResult(MeasurementData data) {
		return START_VALUE_MEN 
				- (data.getTime() * 4.65)
				- (data.getPulse() * 0.22)
				- (age * 0.26)
				- (bmiResult * 1.05);
	}
	
}
