package com.msf.IA.State;

import com.msf.IA.Interfaces.State;

public class Patrol implements State{

    @Override
    public void enter() {
        System.out.println("Now in the Patrl State");
    }

    @Override
    public void update() {
        System.out.println("Now will update patrol state");
    }
    
}
