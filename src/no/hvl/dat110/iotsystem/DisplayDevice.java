package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		Client clientDisplay = new Client("Display",Common.BROKERHOST,Common.BROKERPORT);
		clientDisplay.connect();
		clientDisplay.createTopic(Common.TEMPTOPIC);
		clientDisplay.subscribe(Common.TEMPTOPIC);
		
		for(int i=0; i<COUNT; i++) {
			


		PublishMsg	msg = (PublishMsg) clientDisplay.receive();
		String message = msg.getMessage();

		System.out.println("Display " + message);
			
		}
		
		clientDisplay.unsubscribe(Common.TEMPTOPIC);
		clientDisplay.disconnect();
		
		
		System.out.println("Display stopping ... ");
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
