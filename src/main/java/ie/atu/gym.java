package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gym {
    private String memberId;
    private int age;
    private String name;
    private final List<gym> members = new ArrayList<>();

    public gym(String memberId, int age, String name) {
        this.memberId = memberId;
        this.age = age;
        this.name = name;
    }

    public void addGym(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Name");
        this.name=input.nextLine();
        System.out.println("Enter Member ID");
        this.memberId = input.nextLine();
        System.out.println("Enter Age");
        this.age = input.nextInt();

        members.add(this);
    }

    public void displayGym(){
        if(members.isEmpty()){
            System.out.println("No members found");
        }
        else {
            for(gym m:members){
                System.out.println("Details: "+m);
            }
        }
    }

    public void getId(){

        Scanner id= new Scanner(System.in);
        System.out.println("Enter ID:\n");
        String ids = id.nextLine();
        if(members.contains(ids)){
            System.out.println("Member found\n");
            members.get();
        }
        else{
            System.out.println("Member not found\n");
        }
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
                '}';
    }
}
