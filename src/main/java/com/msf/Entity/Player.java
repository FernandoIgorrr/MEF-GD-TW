package com.msf.Entity;

import java.util.List;

import javax.swing.RowFilter.Entry;

import com.msf.Entity.Abstract.EntityImpl;
import com.msf.Map.Coordinates;
import com.msf.Village.Village;

public class Player extends EntityImpl{

    private String nick;
    private static Player instance;

    private Player(Coordinates coordinates) {
        super(coordinates, 5);
    }

    public static Player getInstance(Coordinates coordinates) {
        if (instance == null) {
            instance = new Player(coordinates);
        }
        return instance;
    }

   
}

