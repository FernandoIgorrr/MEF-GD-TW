package com.msf.Graph;

import java.util.Iterator;
import java.util.Set;

import com.msf.Factory.AbstractFactory;
import com.msf.Factory.FactoryProvider;
import com.msf.Village.Buildings.Market;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class BuildingGraph{
    public Set<NodeBuilding> roots;
    public Set<NodeBuilding> leafs;

    AbstractFactory abstractFactory;

    public BuildingGraph(){

        // CONJUNTO DE DEPENDENCIAS SEM O LEVEL


        abstractFactory = FactoryProvider.getFactory("NodeBuilding");

        NodeBuilding VILLAGE_HEADQUARTERS   = (NodeBuilding)abstractFactory.build(EBuilding.VILLAGE_HEADQUARTERS);
        NodeBuilding BARRACKS               = (NodeBuilding)abstractFactory.build(EBuilding.BARRACKS);
        NodeBuilding STABLE                 = (NodeBuilding)abstractFactory.build(EBuilding.STABLE);
        NodeBuilding WORKSHOP               = (NodeBuilding)abstractFactory.build(EBuilding.WORKSHOP);
        NodeBuilding ACADEMY                = (NodeBuilding)abstractFactory.build(EBuilding.ACADEMY);
        NodeBuilding SMITHY                 = (NodeBuilding)abstractFactory.build(EBuilding.SMITHY);
        NodeBuilding RALLY_POINT            = (NodeBuilding)abstractFactory.build(EBuilding.RALLY_POINT);
        NodeBuilding STATUE                 = (NodeBuilding)abstractFactory.build(EBuilding.STATUE);
        NodeBuilding MARKET                 = (NodeBuilding)abstractFactory.build(EBuilding.MARKET);
        NodeBuilding TIMBER_CAMP            = (NodeBuilding)abstractFactory.build(EBuilding.TIMBER_CAMP);
        NodeBuilding CLAY_PIT               = (NodeBuilding)abstractFactory.build(EBuilding.CLAY_PIT);
        NodeBuilding IRON_MINE              = (NodeBuilding)abstractFactory.build(EBuilding.IRON_MINE);
        NodeBuilding FARM                   = (NodeBuilding)abstractFactory.build(EBuilding.FARM);
        NodeBuilding WARE_HOUSE             = (NodeBuilding)abstractFactory.build(EBuilding.WARE_HOUSE);
        NodeBuilding HIDING_PLACE           = (NodeBuilding)abstractFactory.build(EBuilding.HIDING_PLACE);
        NodeBuilding WALL                   = (NodeBuilding)abstractFactory.build(EBuilding.WALL);

        // CONJUNTO DE DEPENDENCIAS COM O LEVEL


        ACADEMY.addDependecie(SMITHY, 20);
        ACADEMY.addDependecie(VILLAGE_HEADQUARTERS, 20);
        ACADEMY.addDependecie(MARKET, 10);

        MARKET.addDependecie(VILLAGE_HEADQUARTERS,3);
        MARKET.addDependecie(WARE_HOUSE,2);

        BARRACKS.addDependecie(VILLAGE_HEADQUARTERS, 3);

        STABLE.addDependecie(VILLAGE_HEADQUARTERS, 10);
        STABLE.addDependecie(BARRACKS, 5);
        STABLE.addDependecie(SMITHY, 5);

        WORKSHOP.addDependecie(VILLAGE_HEADQUARTERS, 10);
        WORKSHOP.addDependecie(SMITHY, 10);

        SMITHY.addDependecie(VILLAGE_HEADQUARTERS, 5);
        SMITHY.addDependecie(BARRACKS, 1);

        WALL.addDependecie(BARRACKS, 1);

        RALLY_POINT.addDependecie(VILLAGE_HEADQUARTERS, 1);
        STATUE.addDependecie(VILLAGE_HEADQUARTERS, 1);            
        TIMBER_CAMP.addDependecie(VILLAGE_HEADQUARTERS, 1);         
        CLAY_PIT.addDependecie(VILLAGE_HEADQUARTERS, 1);            
        IRON_MINE.addDependecie(VILLAGE_HEADQUARTERS, 1);            
        FARM.addDependecie(VILLAGE_HEADQUARTERS, 1);                 
        WARE_HOUSE.addDependecie(VILLAGE_HEADQUARTERS, 1);           
        HIDING_PLACE.addDependecie(VILLAGE_HEADQUARTERS, 1);
        
        // CONJUNTO DE DEPENDENCIAS SEM O LEVEL

        ACADEMY.addDependecie(SMITHY);
        ACADEMY.addDependecie(VILLAGE_HEADQUARTERS);
        ACADEMY.addDependecie(MARKET);

        MARKET.addDependecie(VILLAGE_HEADQUARTERS);
        MARKET.addDependecie(WARE_HOUSE);

        BARRACKS.addDependecie(VILLAGE_HEADQUARTERS);

        STABLE.addDependecie(VILLAGE_HEADQUARTERS);
        STABLE.addDependecie(BARRACKS);
        STABLE.addDependecie(SMITHY);

        WORKSHOP.addDependecie(VILLAGE_HEADQUARTERS);
        WORKSHOP.addDependecie(SMITHY);

        SMITHY.addDependecie(VILLAGE_HEADQUARTERS);
        SMITHY.addDependecie(BARRACKS);

        WALL.addDependecie(BARRACKS);

        RALLY_POINT.addDependecie(VILLAGE_HEADQUARTERS);
        STATUE.addDependecie(VILLAGE_HEADQUARTERS);            
        TIMBER_CAMP.addDependecie(VILLAGE_HEADQUARTERS);         
        CLAY_PIT.addDependecie(VILLAGE_HEADQUARTERS);            
        IRON_MINE.addDependecie(VILLAGE_HEADQUARTERS);            
        FARM.addDependecie(VILLAGE_HEADQUARTERS);                 
        WARE_HOUSE.addDependecie(VILLAGE_HEADQUARTERS);           
        HIDING_PLACE.addDependecie(VILLAGE_HEADQUARTERS);
        
        //ADCIONANDO AS FOLHAS


        this.leafs.add(ACADEMY);
        this.leafs.add(STABLE);
        this.leafs.add(WORKSHOP);
        this.leafs.add(WALL);
        this.leafs.add(RALLY_POINT);
        this.leafs.add(STATUE);
        this.leafs.add(TIMBER_CAMP);
        this.leafs.add(CLAY_PIT);
        this.leafs.add(IRON_MINE);
        this.leafs.add(FARM);
        this.leafs.add(WARE_HOUSE);
        this.leafs.add(HIDING_PLACE);

        //ADCIONANDO AS RAIZES

        this.roots.add(VILLAGE_HEADQUARTERS);
    }
}