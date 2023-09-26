package com.msf.Map;

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

    public Integer getNum() {
        return Num;
    }
}
