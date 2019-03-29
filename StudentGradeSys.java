
package com.ally;
import java.util.Scanner;
public class StudentGradeSys {
   
    public static void main(String[] args) {
        int num=1;
        Student [] oop2stds = new Student[num];
        Scanner scan = new Scanner(System.in);
        
        int i=0;
        while(true){
            if(i>=num)
                break;
            oop2stds[i]=new Student();
            oop2stds[i].setMarks();
            System.out.println();
           
       
        System.out.println();
        while(true){
            System.out.println("Pick a number between 1 and "+num+" to view the corresponding student's results or type '0' to add another student.");
            int number = scan.nextInt();
            if(number==0)
                break;
            else if(number>0 && number<=num){
                int index = number-1;
                oop2stds[index].printStdInfo();
                oop2stds[index].printResults();
            }
            System.out.println();
            System.out.println("The following students are registered:");
            for(int n=0;n<num;n++){
                System.out.println("("+(n+1)+") "+oop2stds[n].getStdName());
            }
            i++;
        }
        }
    }    
}

    