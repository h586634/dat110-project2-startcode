package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		
		Client clientDevice = new Client(Common.TEMPTOPIC, Common.BROKERHOST,Common.BROKERPORT);
		clientDevice.connect();
		
		for (int i=0; i<COUNT; i++) {
			
			clientDevice.publish(Common.TEMPTOPIC, sn.read() + " ") ;
			
		}
		
			clientDevice.disconnect();
		System.out.println("Temperature device stopping ... ");


	}
}
