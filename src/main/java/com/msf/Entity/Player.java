package com.msf.Entity;

import java.util.List;

import javax.swing.RowFilter.Entry;

import com.msf.Entity.Abstract.EntityImpl;
import com.msf.Map.Coordinates;
import com.msf.Village.Village;

public class Player extends EntityImpl{



    public Player(Coordinates coordinates, Integer speed) {
        super(coordinates, speed);
    }

    private String nick;
   
}

