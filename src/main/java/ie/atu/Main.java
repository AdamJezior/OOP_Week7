package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<gym> members = new ArrayList<gym>();
        for(int x=0; x<2;x++) {
            System.out.println("1.Add Member\t2.Display All Members\t3.Search by ID\n4.Remove Member\t5. Exit");
            Scanner menu= new Scanner(System.in);
            int i= menu.nextInt();
            if(i==1){
                members.add(new gym());
            }

            else if(i==2){
                if(members.isEmpty()){
                    System.out.println("No members found");
                }
                else {
                    for(gym m:members){
                        System.out.println("Details: "+m);
                    }
                }

            }
            else if(i==3){
                Scanner id= new Scanner(System.in);
                System.out.println("Enter ID:\n");
                String ids = id.nextLine();
                if(members.contains(ids)){
                    System.out.println("Member found\n");
                }
                else{
                    System.out.println("Member not found\n");
                }

            }
            else if(i==4){

            }
            else if(i==5){
                x=5;
                System.out.println("goodbye");
            }
            x--;
        }
    }
}