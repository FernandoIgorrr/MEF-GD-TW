package com.msf.IA.EnemyStates;

import com.msf.Entity.Enemy;
import com.msf.IA.StateType;
import com.msf.IA.Abstract.EnemyStateImpl;

public class BackToPatrol extends EnemyStateImpl{

    public BackToPatrol() {
        super(StateType.BACK_TO_PATROL);
    }

    @Override
    public void execute(Enemy enemy) {
        if(enemy.nearbyPlayer()){
            enemy.chageState(new Chase());
        }
        else if(enemy.nearbyPatrol()){
            enemy.chageState(new Patrol());
        }
        else{
            enemy.backToPatrol();
        }
    }
}
