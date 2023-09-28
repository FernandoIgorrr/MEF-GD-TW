package com.msf.Map;

import com.msf.Map.Abstract.Pair;

public class SubMap {
    
    Integer Num;

    private Integer pixelMinX;
    private Integer pixelMinY;
    private Integer pixelMaxX;
    private Integer pixelMaxY;

    SubMap( Integer Num,
            Integer pixelMinX,
            Integer pixelMinY,
            Integer pixelMaxX,
            Integer pixelMaxY)
    {
        this.Num = Num;
        this.pixelMinX = pixelMinX;
        this.pixelMinY = pixelMinY;
        this.pixelMaxX = pixelMaxX;
        this.pixelMaxY = pixelMaxY;
    }

    public boolean itsInside(Coordinates coordinates){
        if(coordinates.getX() > this.pixelMaxX || coordinates.getX() < this.pixelMinX){
            return false;
        }
        if(coordinates.getY() > this.pixelMaxY || coordinates.getY() < this.pixelMinY){
            return false;
        }
        return true;
    }

    public Coordinates getCenter(){

        Integer centerX = (pixelMinX + pixelMaxX) / 2;
        Integer centerY = (pixelMinY + pixelMaxY) / 2;

        return new Coordinates(centerX,centerY);
    }

    public Integer getNum() {
        return Num;
    }

    public Integer getPixelMinX() {
        return pixelMinX;
    }
    public Integer getPixelMinY() {
        return pixelMinY;
    }
    public Integer getPixelMaxX() {
        return pixelMaxX;
    }
    public Integer getPixelMaxY() {
        return pixelMaxY;
    }

    @Override
    public String toString() {
        return "SubMap Num=" + Num + "\n \t[pixelMinX=" + pixelMinX + ", \n\tpixelMinY=" + pixelMinY + ", \n\tpixelMaxX="
                + pixelMaxX + ", \n\tpixelMaxY=" + pixelMaxY + "]\n***";
    }
}
