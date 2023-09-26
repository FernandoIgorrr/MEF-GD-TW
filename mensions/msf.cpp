enum StateType{RunAway, Patrol, Attack};

class Agent{

    void Agent::UpdateState(StateType CurrentState){

        switch(CurrentState){
            
        case state_RunAway:
            EvadeEnemy();
            if (Safe()){
                ChangeState(state_Patrol);
            }
            break;
        case state_Patrol:
        FollowPatrolPath();
        if (Threatened())
        {
        if (StrongerThanEnemy())
        {
        ChangeState(state_Attack);
        }
        else
        {
        ChangeState(state_RunAway);
        }
        }
        break;
        case state_Attack:
        if (WeakerThanEnemy())
        {
        ChangeState(state_RunAway);
        }
        else
        {
        BashEnemyOverHead();
        }
        break;
        }//end switch
    }
}