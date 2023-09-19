package Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factoryType){
        if(("building").equalsIgnoreCase(factoryType)){
            return new BuildingFactory();
        }
        return null;
    }
}
