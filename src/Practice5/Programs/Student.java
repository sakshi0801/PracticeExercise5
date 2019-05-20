/**
 * Created by Sakshi
 * date- 17/05/19
 * This program contains a Student class with id, name and age as its member variables
 */

package Programs;

public class Student {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int id;
    private String name;
    private int age;
}
