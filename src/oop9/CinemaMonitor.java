package oop9;

public class CinemaMonitor extends AbstractMonitor implements Speakable{
	
	private String screenSize;
	private int volume;
	
	public CinemaMonitor() {
		this.screenSize = "100인치";
		this.volume =50;
	}
	
	public CinemaMonitor(String screenSize) {
		this.screenSize = screenSize;
		this.volume = 50;
	}
	@Override
	public void display() {
		if(!this.powerCheck()) {
			return;
		}
		System.out.println("["+screenSize+"] 크기 스크린으로 동영상을 재생합니다.");
		this.sound();
	}
	
	@Override
	public void sound() {
		if(!this.soundCheck()) {
			return;
		}
		System.out.println("["+screenSize+"] 크기 사운드로 영상을 재생합니다.");
		this.sound();
		

	}
	@Override
	public void volumeUp() {
		if(!this.powerCheck()) {
			return;
		}
		volume += 5;
		if (volume<Speakable.MIN_VOLUME) {
			volume = Speakable.MIN_VOLUME;
		}
		System.out.println("현재 볼륨: " + volume);
		

	}
	
	@Override
	public void volumeDown() {
		if(!this.powerCheck()) {
			return;
		}
		volume -= 5;
		if (volume<Speakable.MIN_VOLUME) {
			volume = Speakable.MIN_VOLUME;
		}
		System.out.println("현재 볼륨: " + volume);
		
	}
	
	// 내부에서만 사용하는 메소드
	private boolean powerCheck() {
		if (getPower()) {
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		return true;
	}
	
	private boolean soundCheck() {
		if (getPower()) {
			System.out.println("사운드가 꺼져있습니다.");
			return false;
		}
		return true;
	}
}
