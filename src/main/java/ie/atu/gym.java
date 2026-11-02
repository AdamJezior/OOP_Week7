package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gym {
    private String memberId;
    private int age;
    private String name;
    private final List<gym> gyms = new ArrayList<>();

    gym(String memberId, int age, String name){
        this.memberId = memberId;
        this.age = age;
        this.name=name;
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
    public static void addGym(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Member ID");
        String Id=input.nextLine();
        System.out.println("Enter Age");
        int Age=input.nextInt();
        System.out.println("Enter Name");
        String Name=input.nextLine();
        new gym(Id,Age,Name);
    }

    public boolean searchByID(String id){
        for(gym gym:gyms){
            if (gym.getId() == id) {
                gym.displayDetails();
                return true;
            }
        }
        System.out.println("Invalid ID");
        return false;
    }
    public void listMembers(){
        if(gyms.size()==0){
            System.out.println("No members found");
            return;
        }
        else {
            for (gym gym : gyms) {
                System.out.println(gym.name);
            }
        }
    }
}
