package lightbulb;

import org.junit.Test;

public class TestLightBulb {
   
	private LightBulb lb=new LightBulb();
	
	@Test
   public void testOn(){
	    lb.on();
   }
	
   
	@Test
   public void testOff(){
    	lb.off();
    }
}
