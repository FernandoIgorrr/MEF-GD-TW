package com.msf.Map;

import java.util.ArrayList;
import java.util.List;

import com.msf.Map.Abstract.Pair;
import com.msf.Map.Interfaces.MapObject;

public class Map {
    private MapObject[][] mapObjects;
    private List<SubMap> submaps;
    public List<SubMap> getSubmaps() {
        return submaps;
    }

    public Map(){
        
    }

    public Map(MapObject player,Integer enemys,Integer screenWidth,Integer screenHeight){
        this.subMapsGenerator(screenWidth,screenHeight);
        //this.showsubmaps();
    }

    private void mapGenerator(MapObject player,Integer enemys,Integer screenWidth,Integer screenHeight){
        
    }

    private void subMapsGenerator(Integer screenWidth,Integer screenHeight){
        submaps = new ArrayList();
        int c = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                Integer pix  = (j*screenWidth)/3;
                Integer piy  = (i*screenHeight)/3;
                Integer pfx  = pix + screenWidth/3;
                Integer pfy  = piy + screenHeight/3;

                //System.out.println("\n****screenWidth: " + screenWidth + " ****\n");

                submaps.add(new SubMap(c++,pix,piy,pfx,pfy));
            }
        }
    }

    public void showsubmaps(){
        for (SubMap subMap : submaps) {
            System.out.println(subMap);
        }
    }
}
