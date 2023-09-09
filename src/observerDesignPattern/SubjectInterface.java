package observerDesignPattern;

public interface SubjectInterface {
	public boolean registerObserver(ObserverInterface obs);
	public boolean removeObserver(ObserverInterface obs);
	public String notifyObservers(String topic1, String topic2);
}