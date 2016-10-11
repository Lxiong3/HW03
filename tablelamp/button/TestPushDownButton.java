package button;

import org.junit.Test;

import lightbulb.LightBulb;

public class TestPushDownButton {
 
	private LightBulb lb = new LightBulb(); 
	private PushDownButton pb= new PushDownButton(lb);
	
    @Test
    
    public void testPushButton(){
    	for(int i=0;i<=5;i++){
    		pb.PushButton();
    	}
    }
 
 
}
