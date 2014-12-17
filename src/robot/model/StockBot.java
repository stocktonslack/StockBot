package robot.model;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.Sound;

public class StockBot 
{
	private UltrasonicSensor dolphinSensor;
	private TouchSensor frontToaster;
	private TouchSensor backToaster;
	private SoundSensor speakToMe;
	
	public StockBot()
	{
		dolphinSensor = new UltrasonicSensor(SensorPort.S1);
		frontToaster = new TouchSensor(SensorPort.S2);
		backToaster = new TouchSensor(SensorPort.S3);
		speakToMe = new SoundSensor(SensorPort.S4);
	}
	
	public void iDanceInTheRain()
	{
		
	}
	
	public void touchSensorTouched()
	{
		
	}
	
	public void whenIHearSound()
	{
		SensorPort.S4.callListeners()
	}
	
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.setSpeed(750);
				Motor.C.setSpeed(750);
				Motor.C.forward();
				Motor.B.forward();
				Thread.sleep(length*1000);
				Motor.C.stop();
				Motor.B.stop();
				Motor.C.rotate(-angle, true);
				Motor.B.rotate(angle, true);
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	private int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 1080/vertexCount;
		}
		
		return currentAngle;
	}
}
