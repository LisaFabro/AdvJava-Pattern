public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void stampUser(){
        System.out.println("User's name: " + getName() + " User's age: " + getAge());
    }
}
