package org.maoge.pattern.p06;

/**
 * ¿Í»§
 */
public class Customer {
	public static void main(String[] args) {
		IWorkshop workshopCommon = new WorkshopCommon();
		workshopCommon.produceBasic();
		workshopCommon.produceBattery();

		IWorkshop workshopSenior = new WorkshopSenior();
		workshopSenior.produceBasic();
		workshopSenior.produceBattery();
	}
}
