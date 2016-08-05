package di;

public class ConfigurationFactory {

    private static final ConfigurationFactory INSTANCE = new ConfigurationFactory();

    private Configuration product;

    private ConfigurationFactory(){
        try {
            this.product = (Configuration) Class.forName("di.SystemPropertyConfiguration").newInstance();
        } catch (IllegalStateException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            throw new IllegalStateException("Product not find", e);
        }
    }

    public Configuration create() {
        return product;
    }

    public static final ConfigurationFactory getInstance() {
        return INSTANCE;
    }
}
