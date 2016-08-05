package myownannotation;

import java.lang.reflect.Field;

public class MyOwnAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("myownannotation.Facade");
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            MyInject myInject = field.getAnnotation(MyInject.class);
            if(myInject != null){
                System.out.printf("Field %s is annotated with %s", field, myInject);

                Object facade = clazz.newInstance();

                Class<?> serviceType = field.getType();
                String simpleName = serviceType.getSimpleName();
                String className = simpleName + "Impl";
                String packageName = serviceType.getPackage().getName();
                String fullName = packageName + "." + className;

                Object service = Class.forName(fullName).newInstance();
                field.setAccessible(true);
                field.set(facade, service);

                System.out.println("--------");
                System.out.println("Facade: " + facade);

            } else {
//                System.out.printf("Field %s is not annotated", field);
            }
        }
    }
}
