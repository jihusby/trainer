package no.husby.trainer.test;

import static org.junit.Assert.*;

import java.util.Date;

import no.husby.trainer.Athlete;
import no.husby.trainer.AthleteProgress;
import no.husby.trainer.MeasurementData;

import org.junit.Before;
import org.junit.Test;

public class AchievementCalculatorTest {

	private static final int CORRECT_HEIGHT = 192;
	private static final int CORRECT_WEIGHT = 96;
	private static final double CORRECT_BMI = 26.04;
	private AthleteProgress othleteProgess;
	private int age;
	private Athlete athlete;
	
	@Before
	public void setUp() {
		age = 42;
		athlete = new Athlete("Me", CORRECT_HEIGHT);
		othleteProgess = new AthleteProgress(athlete);
	}

	@Test
	public void testOxygenCalculatorResultExists() {
		assertNotNull(othleteProgess.getOxygenMeasurements());
	}

	@Test
	public void testOxygenCalculatorReturnsCorrectBMI() {
		MeasurementData data = new MeasurementData(new Date(), 96, 18, CORRECT_WEIGHT, age);
		othleteProgess.addOxygenMeasurement(data);
		assertEquals(CORRECT_BMI, othleteProgess.getOxygenMeasurements().get(0).getBMI(), 0.01);
	}

	@Test
	public void testOxygenCalculatorReturnsCorrectResult() {
		MeasurementData data = new MeasurementData(new Date(), 96, 18, CORRECT_WEIGHT, age);
		othleteProgess.addOxygenMeasurement(data);
		assertEquals(41.81, othleteProgess.getOxygenMeasurements().get(0).getOxygenResult(), 0.01);
	}

	@Test
	public void testOxygenCalculatorReturnImprovement() {
		MeasurementData data1 = new MeasurementData(new Date(), 150, 20, CORRECT_WEIGHT, age);
		MeasurementData data2 = new MeasurementData(new Date(), 140, 20, CORRECT_WEIGHT, age);
		othleteProgess.addOxygenMeasurement(data1);
		othleteProgess.addOxygenMeasurement(data2);
		assertEquals(2, othleteProgess.getOxygenMeasurements().size());
		assertTrue(othleteProgess.getOxygenMeasurements().get(1).getOxygenResult() > othleteProgess.getOxygenMeasurements().get(0).getOxygenResult());
	}
	
}
