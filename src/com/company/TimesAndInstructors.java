package com.company;
import java.util.Scanner;
public class TimesAndInstructors {

    //https://www.youtube.com/watch?v=dQw4w9WgXcQ;
    public static void main(String[] args)throws Exception
    {
        String name;
        boolean i=false;
        String[][] courses = new String[5][3];
        courses[0][0]= "CSC 1302";
        courses[1][0]="MATH 1502";
        courses[2][0]="GSU 1101";
        courses[3][0]= "PHYS 1112";
        courses[4][0]= "MATH 1502";

        courses[0][1]= "Thursday at 3:30 P.M.";
        courses[1][1]="Tuesday at 1:30 P.M.";
        courses[2][1]="Wednesday at 2:00 P.M.";
        courses[3][1]= "Thursday at 1:00 P.M.";
        courses[4][1]= "Monday at 2:00 P.M.";

        courses[0][2]= "Never";
        courses[1][2]="Gonna";
        courses[2][2]="Give";
        courses[3][2]= "You";
        courses[4][2]= "Up";

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter name of your course to display the meeting time:");
        name = input.nextLine();

        //courses[rows][columns];
            for(int x=0; x<=4; x++)
            {
                if(name.equals(courses[x][0]))
                {
                    System.out.println("There is a meeting on " + courses[x][1] + " by " + courses[x][2]);
                }
            }
            for(int x=0; x<=4; x++)
            {
                if(name.equals(courses[x][0]))
                {
                    i=true;
                    break;
                }
            }
            if(!i)
                System.out.println("Incorrect class name ");
        }

    }