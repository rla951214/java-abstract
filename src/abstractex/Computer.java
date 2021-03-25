package abstractex;

public abstract class Computer {
	
	public abstract void display();  // 추상 메소드
	public abstract void typing();   // 추상 메소드
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}

}
