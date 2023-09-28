package com.msf.IA.EnemyStates;

import com.msf.Entity.Enemy;
import com.msf.IA.StateType;
import com.msf.IA.Abstract.EnemyStateImpl;

public class Chase extends EnemyStateImpl{

    public Chase() {
        super(StateType.CHASE);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void execute(Enemy enemy) {
        if(enemy.nearbyPlayer()){
            enemy.chase();
        }
        else if(enemy.nearbyPatrol()){
            enemy.chageState(new Patrol());
        }
        else{
            enemy.chageState(new BackToPatrol());
        }
    }
}
