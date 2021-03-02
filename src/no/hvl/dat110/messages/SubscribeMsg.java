package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	
	private String topic;
	
	
	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.setTopic(topic);
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	public String toString() {
		return "SubscribeMsg [topic = " + topic + "]";
	}
	
}
