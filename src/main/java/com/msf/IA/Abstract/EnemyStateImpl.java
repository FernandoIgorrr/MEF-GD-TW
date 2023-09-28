package com.msf.IA.Abstract;

import com.msf.Entity.Enemy;
import com.msf.IA.StateType;
import com.msf.IA.Interfaces.State;

public abstract class EnemyStateImpl implements State<Enemy>{
    
    private final StateType state;

    public EnemyStateImpl(StateType state){
        this.state = state;
    }

    public StateType getState(){
        return state;
    }
}
