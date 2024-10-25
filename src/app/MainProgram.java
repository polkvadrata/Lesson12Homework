package app;

public class MainProgram {

    public static void main(String[] args) {

        Car car = new Car();
        Employee employee = new Employee("George", "Boss", "bigBoss@mail.com", 80935345839L, 55);

        car.start();

        System.out.println(employee.getName());
    }

}
