public class SamsungX extends TV implements IRemoteControl{

	public SamsungX(int s) {
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
			System.out.println("SamsungX");
			this.setOn(true);
		}
		return isOn();
	}

	@Override
	public boolean powerOff() {
		if(this.isOn()) {
			System.out.println("SamsungX");
			this.setOn(false);
		}
		return isOn();
	}
}
