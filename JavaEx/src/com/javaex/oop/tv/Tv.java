package com.javaex.oop.tv;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;

	public Tv(int channel, int volume, boolean power)
	{
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel()
	{
		return channel;
	}
	public int getVolueme()
	{
		return volume;
	}
	public void power(boolean power)
	{
		this.power = power;
	}
	public void channel( int channel )
	{
		this.channel = channel;
	}
	
	public void channel( boolean up)
	{
		if(up && channel < 255)
			channel++;
	}
	public void volume( int voluem)
	{
		this.volume = voluem;
	}
	public void volume( boolean up)
	{
		if(up && volume < 100)
			volume++;
	}
	public void status()
	{
		String powerStatus = "";
		if(power)
			powerStatus = "켜져";
		else
			powerStatus = "꺼져";
		System.out.printf("현재 채널은 %d번이고 소리는 %d며, 전원은 %s있습니다.%n", channel, volume, powerStatus);
	}
}
