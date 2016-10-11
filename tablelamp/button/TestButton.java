package button;

import org.junit.Test;

import lightbulb.LightBulb;

public class TestButton {
   
	public LightBulb lb=new LightBulb();
	public Button bt=new Button(lb);
	
   @Test
	public void testSwtichOff() {
	  bt.switchOff();//Test method SwitchOff(),if works,prints "Button switched to OFF" to stdout
	}
   
  

   @Test
   public void testSwitchOn() {
	   bt.switchOn();//Test method SwitchOn(),if works,prints "Button switched to On" to stdout
   }
      
  
}
