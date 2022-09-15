package test;

public class TV {
	private int size;
	private int channel;
	private int volume;
	private boolean on;
	
	public TV(int s) {
		size = s;
		channel = 0;
		volume = 0;
		on = false;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}	
	
}
