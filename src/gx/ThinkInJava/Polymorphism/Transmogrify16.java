package gx.ThinkInJava.Polymorphism;
/*
 * Polymorphism.16
 * 创建一个Starship类，包含一个AlertStatus引用，此引用可以指示三种不同的状态。
 * 纳入一些改变这些状态的方法。
 */
class AlertStatus{
	public void alert(){
	
	}
}

class NormalAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus Normal"); }
}  

class HighAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus High"); }
} 

class MaximumAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus Maximum"); }
}

class Starship{
	private AlertStatus alertStatus = new NormalAlert();
	public void normalAlert(){
		alertStatus = new NormalAlert();
	}
	public void highAlert(){
		alertStatus = new HighAlert();
	}
	public void maximumAlert(){
		alertStatus = new MaximumAlert();
	}
	public void checkAlertStatus(){
		alertStatus.alert();
	}
}

public class Transmogrify16 {

	public static void main(String[] args) {
		Starship ss = new Starship();
		ss.checkAlertStatus();
		ss.highAlert();
		ss.checkAlertStatus();
		ss.maximumAlert();
		ss.checkAlertStatus();
		ss.normalAlert();
		ss.checkAlertStatus();
	}

}
