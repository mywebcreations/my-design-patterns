package observerDesignPattern;

public class Observer2 implements ObserverInterface {
	public String update(String topic1, String topic2) {
		return "To Observer2: The Subject has been changed from " + topic1 + " to " + topic2 + '.';
	}
}
