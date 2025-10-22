public class Human {
    // Data members
    private String name;
    private int age;
    private String gender;
    
    // Basic constructor
    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
}
