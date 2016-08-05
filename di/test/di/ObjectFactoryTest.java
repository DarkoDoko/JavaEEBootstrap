package di;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ObjectFactoryTest {

    private ObjectFactory cut;

    @Before
    public void initialize(){
        this.cut = ObjectFactory.getInstance();
    }

    @Test
    public void productCreation() {
        Configuration product = (Configuration) this.cut.create();
        assertNotNull(product);
    }

}