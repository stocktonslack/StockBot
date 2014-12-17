package robot.controller;

import lejos.nxt.Button;
import robot.model.StockBot;

public class StockBotController
{
	private StockBot myBot;
	
	public StockBotController()
	{
		myBot = new StockBot();
	}
	
	public void start()
	{
		while( Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			myBot.drawShape(4, 1);
		}
		
	}
	
}
