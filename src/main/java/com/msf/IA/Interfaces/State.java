package com.msf.IA.Interfaces;

import com.msf.Entity.Interfaces.Entity;
import com.msf.IA.StateType;

public interface State<T> {

    public void execute(T t);

    public StateType getState();
}
