package test;

public class TestTV {
	public static void main(String[] args) {
		SamsungX tv1 = new SamsungX(0);
		SamsungSmartTV tv2 = new SamsungSmartTV(0);
		
		tv1.powerOn();
		tv2.changeChannel(5);
		
		tv2.powerOn();
		tv1.changeChannel(5);
	}
}
