package org.maoge.pattern.p05;

/**
 * ����Ա
 */
public class Customer {
	public static void main(String[] args) {
		IWorkshop workshop = new GasWorkshop();
		workshop.produceMeter();
	}
}
