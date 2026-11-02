package ie.atu;

public class gym {
    private String memberId;
    private int age;
    private String name;

    gym(String memberId, int age, String name){
        this.memberId = memberId;
        this.age = age;
        this.name=name;
    }

    public void getId(){
        System.out.println(memberId);
    }
    public void getAge(){
        System.out.println(age);
    }
    public void getName(){
        System.out.println(name);
    }
    public void displayDetails(){
        System.out.println("member Id: "+memberId);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
