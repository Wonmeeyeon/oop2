package oop1;

public class TvDemo {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power();
		tv.channelDown();
		tv.channelUp();
		
		
		CaptionTv captionTv = new CaptionTv();
		captionTv.power();
		captionTv.caption =true;
		captionTv.displayCaption("시각장애우를 위한 자막을 표시합니다.");
		
		
		
		IPTv iptv = new IPTv();
		iptv.power();						//Tv,			부모클래스의 속성 및 기능 사용
		iptv.channelDown();					//Tv			부모클래스의 속성 및 기능 사용
		iptv.channelUp();					//Tv			부모클래스의 속성 및 기능 사용
		iptv.ip = "211.163.24.123";			//IPTv
		iptv.internet("www.daum.net");		//IPTv
		
		
		NetflixTv netflixTv = new NetflixTv();
		netflixTv.power();					//Tv			부모클래스의 속성 및 기능 사용
		netflixTv.channelDown();			//Tv			부모클래스의 속성 및 기능 사용
		netflixTv.channelUp();				//Tv			부모클래스의 속성 및 기능 사용
		netflixTv.ip = "211.163.24.123";	//IPTv			부모클래스의 속성 및 기능 사용
		netflixTv.internet("www.daum.net");	//IPTv			부모클래스의 속성 및 기능 사용
		netflixTv.membership="standerd";	//NetflixTv		
		netflixTv.watchMovie("더블타켓");		//NetflixTv
		
	}

}
