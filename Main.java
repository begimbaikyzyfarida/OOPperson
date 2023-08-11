public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jandar Taalaibekov", 22, "male");
        Person person2 = new Person("Tunuk Jumabekova", 15, "female");
        Person person3 = new Person("Erkin Toigonbaev", 21, "male");
        Person person4 = new Person("Zalkarbek Mamanov", 16, "male");
        Person person5 = new Person("Alina Ahunova", 21, "female");
        Person[] people = {person1, person2, person3, person4, person5};
        System.out.println("*************************************************************");
        System.out.println(minNumber(people));
        System.out.println("*************************************************************");
        System.out.println(maxNumber(people));
        System.out.println("*************************************************************");
    }
    public static Person minNumber(Person[] arr) {
        Person min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age < min.age) {
                min = arr[i];
            }
        }
        return min;
    }

    public static Person maxNumber(Person[] arr) {
        Person max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age > max.age) {
                max = arr[i];
            }
        }
        return max;
    }
}
