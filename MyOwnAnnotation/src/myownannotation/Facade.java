package myownannotation;

public class Facade {

    @MyInject(MyInject.DayTime.MORNING)
    Service service;
}
