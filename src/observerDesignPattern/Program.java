package observerDesignPattern;

public class Program {
	public static void main(String[] args) {
		//create the observer objects
		ObserverInterface obs1 = new Observer1();
		ObserverInterface obs2 = new Observer2();
		
		//create the subject object
		Subject subj = new Subject();
		
		//register observers
		subj.registerObserver(obs1);
		subj.registerObserver(obs2);
		
		//Set the topic
		subj.setTopic("Physics");
		
		//get the topic 
		String topic = subj.getTopic();
		
		//manually change topic
		subj.setTopic("Chemistry");
		
		//get the new topic
		String topic_new = subj.getTopic();
		
		//check if topics are different
		if ( !topic.equals(topic_new) ) {
			//now notify observers of change in topic
			System.out.println( subj.notifyObservers(topic, topic_new) );
		}		
	}

}
