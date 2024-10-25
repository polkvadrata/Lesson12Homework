package app;

public class Employee {

    private String name;
    private String jobTitle;
    private String email;
    private long tel;

    public int getAge() {
        return age;
    }

    public long getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName() {
        return name;
    }

    private int age;

    public Employee(String name, String jobTitle, String email, long tel, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

}
