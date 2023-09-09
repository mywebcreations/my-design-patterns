package observerDesignPattern;

public class Observer1 implements ObserverInterface{
	public String update(String topic1, String topic2) {
		return "To Observer1: The Subject has been changed from " + topic1 + " to " + topic2 + '.';
	}
}
