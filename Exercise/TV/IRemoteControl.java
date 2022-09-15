package test;

public interface IRemoteControl {
	
	//define methods from interface
	public void changeChannel(int channel);
	public void increaseVol(int volume);
	public void decreaseVol(int volume);
	public boolean powerOn();
	public boolean powerOff();
}
