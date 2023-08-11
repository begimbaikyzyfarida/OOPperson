public class Person {
    String fullname;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.fullname = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "fullName='" + fullname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
