package no.husby.trainer;

import java.util.ArrayList;
import java.util.List;

public class AthleteProgress {
	
	private Athlete athlete;
	private List<OxygenMeasurement> measurements;

	public AthleteProgress(Athlete athlete) {
		this.athlete = athlete;
		measurements = new ArrayList<OxygenMeasurement>();
	}

	public void addOxygenMeasurement(MeasurementData data){
		measurements.add(new OxygenMeasurement(data, athlete));
	}

	public List<OxygenMeasurement> getOxygenMeasurements() {
		return measurements;
	}
	
	public Athlete getAthlete() {
		return athlete;
	}
	
}
