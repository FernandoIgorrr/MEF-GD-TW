package Village.Buildings.Abstract;

import java.util.Map;

import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public abstract class BuildingImpl implements Building{

    private         EBuilding   building;
    private         Integer         level;

    public BuildingImpl(EBuilding building) {
        this.building   = building;
        this.level      = 1;
    }

    @Override
    public void upLevel() {
        this.level++;

        if(this.level > building.getMaxLevel()){
            this.level = building.getMaxLevel();
        }
        else if(this.level < 1){
            this.level = 1;
        }
    }

    @Override
    public EBuilding getBuilding(){
        return this.building;
    }
    
    @Override
    public String getBuildingType(){
        return this.building.toString();
    }

    @Override
    public Integer getLevel(){
        return this.level;
    }


    public Building clone(){
        return null;
    }

    @Override
    public String toString(){
        return  "\n\t***"+this.getBuilding()+"***"
                +"\nNAME:"+this.getBuilding().getName()
                +"\nMAX LEVEL:  "+this.getBuilding().getMaxLevel()+"\n";

    }

    @Override
    public boolean equals(Object obj){
        if(obj.getClass() != getClass()){
            return false;
        }
        BuildingImpl building = (BuildingImpl) obj;  
        
        if(building.getBuilding().equals(getBuilding())){
            if(building.getLevel() == getLevel()){
                return true;
            }    
            return false;
        }
        return false;
    }
}
