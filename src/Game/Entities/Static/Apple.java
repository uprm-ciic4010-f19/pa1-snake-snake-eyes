package Game.Entities.Static;

import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
    }
    
    public boolean goodapple(){
    	
    	if(handler.getWorld().player.moveCounter>=5) {
    		
    		return false;
    	
    	}
    	else {
    		
    		return true;
    	}
    	
    }
    public void rottenapple() {
    	
    	
    }


}
