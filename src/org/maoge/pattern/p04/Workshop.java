package org.maoge.pattern.p04;

/**
 * 车间类
 */
public class Workshop {
	public static IMeter produceMeter(MeterTypeEnum meterTypeEnum) {
		switch (meterTypeEnum) {
		case WATER_METER:
			return new WaterMeter("吨", 0.5);
		case GAS_METER:
			return new GasMeter("m³", 0);
		}
		return null;
	}
}
