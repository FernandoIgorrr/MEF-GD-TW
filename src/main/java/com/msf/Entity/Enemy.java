package com.msf.Entity;

import com.msf.Entity.Abstract.EntityImpl;
import com.msf.IA.StateType;
import com.msf.Map.Coordinates;

public class Enemy extends EntityImpl{

    public Enemy(Coordinates coordinates, Integer speed) {
        super(coordinates, speed);
        //TODO Auto-generated constructor stub
    }

    public void updateState(StateType currenState) {
       switch(currenState){
            case PATROL:

       }
    }
    
    public void patrol(){
        
    }
}
