package com.msf.Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.msf.Entity.Player;
import com.msf.Entity.Status;
import com.msf.Entity.Interfaces.PowerUp;
import com.msf.Entity.Powerups.plusLife;
import com.msf.Game.Key.KeyHandler;
import com.msf.IA.StateType;
import com.msf.IA.EnemyStates.Patrol;
import com.msf.Entity.Enemy;
import com.msf.Map.Coordinates;
import com.msf.Map.Map;
import com.msf.Map.SubMap;

public class GamePanel extends JPanel implements Runnable{

    //Screen settings
    final Integer originalTileSiza = 12; //16x16 tile
    final Integer scale = 3;

    final Integer tileSize = originalTileSiza * scale; // 36x36 tiles size

    final Integer maxScreenCol = 42;
    final Integer maxScreenRow = 24;

    final Integer screenWidth   = tileSize * maxScreenCol; //1280 pixels 
    final Integer screenHeight  = tileSize * maxScreenRow; // 720 ṕixels

    //background settings
    Image backgroundImage;
    String backgroundImagePath = "assets/background.png";

    //Keys settings
    KeyHandler keyHandler = new KeyHandler();

    //Thread game to 
    Thread gameThread;

    //Player
    Player player = Player.getInstance(new Coordinates(screenWidth/2 - tileSize/2, screenHeight/2 - tileSize/2));
    
    //Enemys
    Deque<Enemy> enemies = new ArrayDeque<>();

    //Power ups
    Deque<PowerUp> powerups = new ArrayDeque<>();

     
    Random random = new Random();
    
    //Map
    Map gameMap = new Map(player,7,screenWidth,screenHeight);

    //frames por second
    Integer FPS = 60;

    public GamePanel(){
       
        Status s = new Status(130);

        addEnemiesToSubMap();
        addPowerUpsToSubMap();
      
        try{
            backgroundImage = ImageIO.read(new File("assets/background.png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        //this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);

    }

    private void addEnemiesToSubMap(){
        enemies.push(new Enemy(player, 2));
        enemies.push(new Enemy(player, 3));
        enemies.push(new Enemy(player, 4));
        enemies.push(new Enemy(player, 1));
        enemies.push(new Enemy(player, 3));
        enemies.push(new Enemy(player, 4));
        enemies.push(new Enemy(player, 2));
        enemies.push(new Enemy(player, 1));

        for(SubMap subMap : gameMap.getSubmaps()){

            if(subMap.getNum() == 4){
            
            }
            else{
                Enemy top  = enemies.pop();
                top.setCoordinates(subMap.getCenter());
                top.setPatrolCoord(subMap.getCenter());
                enemies.addLast(top);
            }
        }
        //enemies.pop();
    }

    private void addPowerUpsToSubMap(){
        
        for (int i = 0; i < 8; i++) {
            powerups.push(new plusLife());
        }

        for(SubMap subMap : gameMap.getSubmaps()){

            if(subMap.getNum() == 4){
            
            }
            else{
                // pl top  = powerups.pop();
                // top.setCoordinates(subMap.getCenter());
                // powerups.addLast(top);
            }
        }
    }

    private void checkEnimies(){
        for (Enemy enemy : enemies) {
            System.out.println("********* " + enemy.getCoordinates());
        }
    }

    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        Graphics2D gMap         = (Graphics2D)g;
        // Graphics2D gPlayer   = (Graphics2D)g;
        // Graphics2D gPenemies = (Graphics2D)g;
        
        gMap.setColor(Color.BLACK);
        for (SubMap subMap : gameMap.getSubmaps()) {
            gMap.fillRect(subMap.getPixelMinX(),subMap.getPixelMinY(),subMap.getPixelMaxX() - subMap.getPixelMinX(),1);
            gMap.fillRect(subMap.getPixelMinX(),subMap.getPixelMinY(),1,subMap.getPixelMaxY() - subMap.getPixelMinY());
        }

        gMap.setColor(Color.white);
        gMap.fillRect(this.player.getCoordinates().getX(),this.player.getCoordinates().getY(), tileSize, tileSize);

        for (Enemy enemy : enemies) {
            enemy.update();

            int red     = random.nextInt(256);   
            int green   = random.nextInt(256);
            int blue    = random.nextInt(256); 

            Color randomColor = new Color(red, green, blue);

            gMap.setColor(randomColor);
            gMap.fillOval(enemy.getCoordinates().getX(),enemy.getCoordinates().getY(), tileSize, tileSize);
        }

        gMap.setColor(Color.yellow);
        // for(plusLife powerUp : powerups){
        //     gMap.fillRect(powerUp.getCoordinates().getX(),powerUp.getCoordinates().getY(), tileSize/2, tileSize/2);
        // }

        
        gMap.dispose();
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawnInteval = 1000000000/FPS; // 0.01666666 seconds
        double delta = 0;
        double lastTime = System.nanoTime();
        double currentTime;
        long timer = 0;
        Integer drawCount = 0;

        while(gameThread != null){
            
            currentTime = System.nanoTime();

            delta += (currentTime-lastTime) / drawnInteval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1){
                
                // System.out.println("The game looping is running!");
                // 1° UPDATE: update information such as character positions 
                upDate();
                //System.out.println("\nX: "+player.getCoordinates().getX()+" | Y: "+player.getCoordinates().getY());
                // 2º DRAW: draw the screen with the update information
                repaint();
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000){
               // System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }

    public void upDate(){
        if(keyHandler.upPressed){
            player.getCoordinates().setY(player.getCoordinates().getY() - player.getSpeed());
        }
        else if(keyHandler.downPressed){
            player.getCoordinates().setY(player.getCoordinates().getY() + player.getSpeed());
        }
        else if(keyHandler.leftPressed){
            player.getCoordinates().setX(player.getCoordinates().getX() - player.getSpeed());
        }
        else if(keyHandler.rightPressed){
            player.getCoordinates().setX(player.getCoordinates().getX() + player.getSpeed());
        }
    }
}
