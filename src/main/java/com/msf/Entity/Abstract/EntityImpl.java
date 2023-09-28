package com.msf.Entity.Abstract;

import java.util.List;

import com.msf.Entity.Interfaces.Entity;
import com.msf.Game.GamePanel;
import com.msf.Game.Key.KeyHandler;
import com.msf.IA.StateType;
import com.msf.Map.Coordinates;
import com.msf.Village.Village;

public abstract class EntityImpl implements Entity{

    private GamePanel gamePanel;
    KeyHandler keyHandler;

    private Coordinates coordinates;
    private Integer speed;

    private List<Village> villages;

    public EntityImpl(Integer speed){
        this.speed = speed;
    }

    public EntityImpl(Coordinates coordinates, Integer speed){
        this.coordinates = coordinates;
        this.speed = speed;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCoordinates(int x, int y){
        coordinates.setPair(x,y);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
