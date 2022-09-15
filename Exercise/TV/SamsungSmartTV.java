package test;

public class SamsungSmartTV extends TV implements IRemoteControl {

	//final ins constant(inalteravel)
	public final String MODEL = "SamsungSmartTV001";
		
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
		if(!this.isOn()) {
			this.setOn(true);
		}
		return isOn();
	}

	@Override
	public boolean powerOff() {
		if(this.isOn()) {
			this.setOn(false);
		}
		return isOn();
	}
}
