package button;

import lightbulb.LightBulb;

/**
 * 
 * @author xionglei
 *
 */

public class Button implements Buttons {
		
	private LightBulb lb;

	public Button(LightBulb lb){
		this.lb=lb;
	}
	
	
  
 @Override   
  public void switchOn() {
	 
	  System.out.println("Button switched to ON");
	  lb.on();
  }
  
 @Override
  public void switchOff() {
	 
	  System.out.println("Button switched to OFF");
	  lb.off();
  }
  

}
