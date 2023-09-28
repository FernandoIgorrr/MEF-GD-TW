package com.msf.IA.EnemyStates;

import com.msf.Entity.Enemy;
import com.msf.Entity.Interfaces.Entity;
import com.msf.IA.StateType;
import com.msf.IA.Abstract.EnemyStateImpl;

public class Patrol extends EnemyStateImpl{

    public Patrol() {
        super(StateType.PATROL);
    }

    @Override
    public void execute(Enemy enemy) {
        if(enemy.nearbyPlayer()){
            enemy.chageState(new Chase());
        }
        else{
            enemy.patrol();
        }
    }
}
