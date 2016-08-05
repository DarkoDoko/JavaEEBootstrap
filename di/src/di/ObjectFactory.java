package di;

public class ObjectFactory {

    private static final ObjectFactory INSTANCE = new ObjectFactory();

    private Object product;

    private ObjectFactory(){
        try {
            this.product = Class.forName("di.SystemPropertyConfiguration").newInstance();
        } catch (IllegalStateException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            throw new IllegalStateException("Product not find", e);
        }
    }

    public Object create() {
        return product;
    }

    public static final ObjectFactory getInstance() {
        return INSTANCE;
    }
}
