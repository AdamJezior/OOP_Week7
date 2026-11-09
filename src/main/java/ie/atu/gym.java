package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gym {
    private String memberId;
    private int age;
    private String name;
    private final List<gym> gyms = new ArrayList<>();

    gym(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Name");
        this.name=input.nextLine();
        System.out.println("Enter Member ID");
        this.memberId = input.nextLine();
        System.out.println("Enter Age");
        this.age = input.nextInt();

        gyms.add(this);
    }

    public String getId(){
        System.out.println(memberId);
        return memberId;
    }
    public int getAge(){
        System.out.println(age);
        return age;
    }
    public String getName(){
        System.out.println(name);
        return name;
    }
    public void displayDetails(){
        System.out.println("member Id: "+memberId);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }

    @Override
    public String toString() {
        return "member{" +
                "memberId='" + memberId + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gyms=" + gyms +
                '}';
    }
}
