package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void washCar() {}
	
	public void startCar() {
	System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
	System.out.println("시동을 끕니다.");
	}
	
	public final void run() { // final을 선언하면 하위클래스에서는 메서드를 재정의할수 없다. = 템플릿 메서드
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
