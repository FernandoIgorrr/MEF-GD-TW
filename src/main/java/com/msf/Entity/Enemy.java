package com.msf.Entity;

import com.msf.Entity.Abstract.EntityImpl;
import com.msf.IA.StateType;
import com.msf.IA.EnemyStates.Patrol;
import com.msf.IA.Interfaces.State;
import com.msf.Map.Coordinates;

public class Enemy extends EntityImpl{

    private double          speedPatrol = 0.01;
    private double          angle       = 0;
    private Integer         radius      = 90;
    private Coordinates     patrolCoord;


    public void setPatrolCoord(Coordinates patrolCoord) {
        this.patrolCoord = patrolCoord;
    }

    private Player          player;
    private State<Enemy>    state;


    public Enemy(Player player, Integer speed){
        super(speed);
        this.player = player;
        state       = new Patrol();
    }

    public Enemy(Player player, Coordinates coordinates, Integer speed) {
        super(coordinates, speed);
        patrolCoord = coordinates;
        this.player = player;
        state       = new Patrol();
    }

    public void update() {
        state.execute(this);
    }

    public void chageState(final State newState){
        state = newState;
    }

    public boolean nearbyPlayer(){
        int distance = calculateDistance(
            getCoordinates().getX(), 
            getCoordinates().getY(), 
            player.getCoordinates().getX(), 
            player.getCoordinates().getY()
        );
        //System.out.println("DISTANCIA: " + distance);
        if(distance > 150){
            return false;
        }
        return true;
    }

    public boolean nearbyPatrol(){
        int distance = calculateDistance(
            getCoordinates().getX(), 
            getCoordinates().getY(), 
            getPatrolCoordinates().getX(), 
            getPatrolCoordinates().getY()
            );
         if(distance > 90){
            return false;
        }
        return true;
    }
    
    private int calculateDistance(int x1,int y1,int x2,int y2){
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void chase(){

        //System.out.println("CHASE_STATE");
        
        //System.out.println("DISTANCIA: " + distance);
      
        double directionX;
        double directionY;

        if(getCoordinates().getX() < player.getCoordinates().getX()){
            directionX = 1;
        }
        else{
            directionX = -1;
        }

        if(getCoordinates().getY() < player.getCoordinates().getY()){
            directionY = 1;
        }
        else{
            directionY = -1;
        }

        int newX = (int)(getCoordinates().getX() + (directionX * this.getSpeed()));
        int newY = (int)(getCoordinates().getY() + (directionY * this.getSpeed()));

        setCoordinates(newX,newY);
    
        //System.out.println("NOVAS COORD: " + getCoordinates());

    }

    public void backToPatrol(){
        System.out.println("BACK_PATROLL_STATE");

        double directionX;
        double directionY;

        if(getCoordinates().getX() < getPatrolCoordinates().getX()){
            directionX = 1;
        }
        else{
            directionX = -1;
        }

        if(getCoordinates().getY() < getPatrolCoordinates().getY()){
            directionY = 1;
        }
        else{
            directionY = -1;
        }

        int newX = (int)(getCoordinates().getX() + (directionX * this.getSpeed()));
        int newY = (int)(getCoordinates().getY() + (directionY * this.getSpeed()));

        setCoordinates(newX,newY);
    }

    public void patrol(){
        //System.out.println("PATROLL_STATE");

        angle += speedPatrol;
        setCoordinates(new Coordinates(
            (Integer)(int)(getPatrolCoordinates().getX() + radius * Math.cos(angle)), 
            (Integer)(int)(getPatrolCoordinates().getY() + radius * Math.sin(angle)))
        );
    }

    private Coordinates getPatrolCoordinates(){
        return patrolCoord;
    }
}
