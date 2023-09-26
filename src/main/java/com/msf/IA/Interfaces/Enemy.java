package com.msf.IA.Interfaces;

import com.msf.IA.StateType;
import com.msf.IA.State.Patrol;

public class Enemy {
    State state;

    public Enemy(){
        this.state = new Patrol();
    }

    public void UpdateState(State currentState){
        
    }
}
