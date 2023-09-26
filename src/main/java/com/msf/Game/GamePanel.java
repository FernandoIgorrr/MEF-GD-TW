package com.msf.Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.msf.Entity.Player;
import com.msf.Game.Key.KeyHandler;
import com.msf.Map.Coordinates;
import com.msf.Map.Map;
import com.msf.Map.Abstract.Pair;

public class GamePanel extends JPanel implements Runnable{

    //Screen settings
    final Integer originalTileSiza = 16; //16x16 tile
    final Integer scale = 3;

    final Integer tileSize = originalTileSiza * scale; // 48x48 tiles size

    final Integer maxScreenCol = 32;
    final Integer maxScreenRow = 18;

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
    Player player = new Player(new Coordinates(screenWidth/2,screenHeight/2),5);

    //Map
    Map map = new Map(player,7,screenWidth,screenHeight);

    

    //frames por second
    Integer FPS = 60;

    public GamePanel(){

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

    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        Graphics2D g2 = (Graphics2D)g;
        

        g2.setColor(Color.white);
        g2.fillRect(this.player.getCoordinates().getX(),this.player.getCoordinates().getY(), tileSize, tileSize);
        g2.dispose();
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
                System.out.println("FPS: " + drawCount);
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
