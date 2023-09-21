package Map;

public abstract class Pair<X,Y>  {

    private X value1;
    private Y value2;

    public Pair(X value1, Y value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public X getKey() {
        return value1;
    }

    public Y getValue() {
        return value2;
    }
}