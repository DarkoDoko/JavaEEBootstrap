package di;

public class Client {

    public static void main(String[] args) {
        Configuration configuration = (Configuration) ObjectFactory.getInstance().create();
    }
}
