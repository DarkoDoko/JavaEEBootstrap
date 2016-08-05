package di;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ConfigurationFactoryTest {

    private ConfigurationFactory cut;

    @Before
    public void initialize(){
        this.cut = ConfigurationFactory.getInstance();
    }

    @Test
    public void productCreation() {
        Configuration product = this.cut.create();
        assertNotNull(product);
    }

}