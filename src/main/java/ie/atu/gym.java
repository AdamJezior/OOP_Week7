package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        if(this.age<=0) {
            System.out.println("member age cannot be less than 1");
            return;
        }
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
        if(Objects.equals(getMemberId(), ids)) {
                    System.out.println("Member found\n");
                    displayDetails();
        }
        else{
            System.out.println("Member not found\n");
        }
    }
    public void removeMember(){
        Scanner id= new Scanner(System.in);
        System.out.println("Enter ID:\n");
        String ids = id.nextLine();
        if(Objects.equals(getMemberId(), ids)) {
            members.remove(ids);
        }
        else{
            System.out.println("Member not found\n");
        }
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getMemberId() {
        return memberId;
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
