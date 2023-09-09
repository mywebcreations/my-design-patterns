package observerDesignPattern;

import java.util.List;
import java.util.ArrayList;


public class Subject implements SubjectInterface {
	private List<ObserverInterface> observers;
	private String topic;
	
	public Subject() {
		observers = new ArrayList<ObserverInterface>();
		topic = "";
	}
		
	public boolean registerObserver(ObserverInterface obs) {
		if ( !observers.add(obs) ) {
			System.err.println("An error occurred! Observer may not have been registed.");
			System.exit(1);
		}
		return true;
	}
	
	public boolean removeObserver(ObserverInterface obs) {
		if ( !observers.remove(obs) ) {
			System.err.println("An error occurred! Observer may not have been removed.");
			System.exit(2);
		}
		return true;
	}
	
	public String notifyObservers(String topic1, String topic2) {
		String message = "";
		for (ObserverInterface obs : observers) {
			message += obs.update(topic1, topic2) + "\n";
		}
		return message;
		
//		OR
//		for ( int i = 0; i < observers.size(); i++ ) {
//			 ObserverInterface observa = (ObserverInterface)observers.get(i); //get each element in observers array and set it to a variable.
//			 observa.update();
//		}
		
//		OR
//		for ( int i = 0; i < observers.size(); i++ ) {
//			 observers.get(i).update();
//		}	
	}
	
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
}
