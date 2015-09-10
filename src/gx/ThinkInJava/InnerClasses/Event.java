package gx.ThinkInJava.InnerClasses;
/*
 * InnerClasses.24
 */
public abstract class Event{
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	public void start(){}
	public boolean ready(){
		return System.nanoTime() >= eventTime;
	}
	public abstract void action();
}