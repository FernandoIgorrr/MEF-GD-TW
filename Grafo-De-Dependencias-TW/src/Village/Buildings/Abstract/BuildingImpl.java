package Village.Buildings.Abstract;

import java.util.Map;

import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public abstract class BuildingImpl implements Building{

    private         EBuilding   building;
    private         int         level;

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
    public Map<EBuilding,Integer> getDependencies(){
        return null;
    }

}
