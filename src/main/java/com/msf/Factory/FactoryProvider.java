package Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType){
        if(("building").equalsIgnoreCase(factoryType)){
            return new BuildingFactory();
        }
        if(("node").equalsIgnoreCase(factoryType)){
            return new NodeFactory();
        }
        return null;
    }
}
