package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        gym members =new gym("0",0,"test");

        for(int x=0; x<2;x++) {
            System.out.println("1.Add Member\t2.Display All Members\t3.Search by ID\n4.Remove Member\t5. Exit");
            Scanner menu= new Scanner(System.in);
            int i= menu.nextInt();
            if(i==1){
                members.addGym();
            }

            else if(i==2){
               members.displayGym();
            }
            else if(i==3){
                members.getId();
            }
            else if(i==4){
                members.removeMember();
            }
            else if(i==5){
                x=5;
                System.out.println("goodbye");
            }
            x--;
        }
    }
}