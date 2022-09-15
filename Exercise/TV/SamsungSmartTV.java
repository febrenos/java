package test;

public class SamsungSmartTV extends TV implements IRemoteControl {

	//final ins constant(inalteravel)
	public final String MODEL = "TV001";
	
	public SamsungSmartTV(int s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increaseVol(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseVol(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean powerOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean powerOff() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
