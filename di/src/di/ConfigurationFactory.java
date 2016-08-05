package di;

public class ConfigurationFactory {

    private static final ConfigurationFactory INSTANCE = new ConfigurationFactory();

    private Configuration product;

    private ConfigurationFactory() {
        this.product = new SystemPropertyConfiguration();
    }

    public Configuration create() {
        return product;
    }
}
