package com.msf;

import javax.swing.JFrame;

import com.msf.Factory.AbstractFactory;
import com.msf.Factory.FactoryProvider;
import com.msf.Game.GamePanel;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class App {
    public static void main(String[] args){

    //    AbstractFactory<Building> abs = FactoryProvider.getFactory("building");

    //     //EBuilding.SMITHY.
       
    //    Building building = abs.build(EBuilding.VILLAGE_HEADQUARTERS);

    //    System.out.println(building);

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("unidade 1 - IA para jogos");
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
