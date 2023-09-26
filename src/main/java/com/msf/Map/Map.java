package com.msf.Map;

import java.util.ArrayList;
import java.util.List;

import com.msf.Map.Abstract.Pair;
import com.msf.Map.Interfaces.MapObject;

public class Map {
    private MapObject[][] mapObjects;
    private List<SubMap> submaps;
    public Map(){
        
    }

    public Map(MapObject player,Integer enemys,Integer screenWidth,Integer screenHeight){

    }

    private void mapGenerator(MapObject player,Integer enemys,Integer screenWidth,Integer screenHeight){
        
    }

    private void subMapsGenerator(MapObject player,Integer screenWidth,Integer screenHeight){
        submaps = new ArrayList();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Integer pix  = (j/3)*screenWidth;
                Integer piy  = (i/3)*screenHeight;
                Integer pfx  = pix + (1/3)*screenWidth;
                Integer pfy  = piy + (1/3)*screenHeight;

                submaps.add(new SubMap(i+j,pix,piy,pfx,pfy));
            }
        }
    }
}
