package myownannotation;

public class Facade {

    @MyInject(MyInject.DayTime.MORNING)
    private Service service;

    String somethingElse;

    public void invokeService(){
        service.serve();
    }

    @Override
    public String toString() {
        return "Facade{" +
                "service=" + service +
                ", somethingElse='" + somethingElse + '\'' +
                '}';
    }
}
