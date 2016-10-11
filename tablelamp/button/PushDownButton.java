package button;

import lightbulb.LightBulb;

public class PushDownButton implements Buttons {
     
private LightBulb lb;
	
	public PushDownButton(LightBulb lb){
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
	  
	  boolean isSwitchOn =true;
	  public void PushButton() {
		 
		  
		  if (isSwitchOn)
		  {
			  switchOn();
			  isSwitchOn=false;
			  
		  }else if(!isSwitchOn)
		  {
			  switchOff();
			  isSwitchOn=true;		  
		  }  	  
	  } 

}
