package Factory;

public interface AbstractFactory<T>{
    T build(String name);
}
