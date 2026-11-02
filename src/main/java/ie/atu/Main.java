package ie.atu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        gym one= new gym("000",0,"test");
        for(int x=0; x<2;x++) {
            System.out.println("1.Add Member\t2.Display All Members\t3.Search by ID\n4.Remove Member\t5. Exit");
            Scanner menu= new Scanner(System.in);
            if(menu.nextInt()==1){
                gym.addGym();
            }
            else if(menu.nextInt()==2){
                one.listMembers();
            }
            else if(menu.nextInt()==3){
                Scanner inputID = new Scanner(System.in);

                one.searchByID(inputID.nextLine());
            }
            else if(menu.nextInt()==4){
                x=1;
            }
            else if(menu.nextInt()==5){
                x=5;
            }
            x--;
        }
    }
}