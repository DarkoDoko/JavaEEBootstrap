package myownannotation;

public class Facade {

    @MyInject(MyInject.DayTime.MORNING)
    private Service service;

    String somethingElse;

    @Override
    public String toString() {
        return "Facade{" +
                "service=" + service +
                ", somethingElse='" + somethingElse + '\'' +
                '}';
    }
}
