package com.ally;
import java.util.Scanner;


public class Student {
    private String stdName, regNo;
    private int yob;
    private String[] courses = {"BIT-1201", "BIT-1202", "BIT-1203", "BIT-1204", "BIT-1205", "BIT-1206"};
    int t=courses.length;
    private int[] marks = new int[t];
    private int sum;
    Scanner scan = new Scanner(System.in);
    
    Student() {
        System.out.println("Enter a student's name: ");
        this.stdName=(scan.nextLine()).toUpperCase();
        System.out.println("Enter "+stdName+"'s registration number: ");
        this.regNo=(scan.nextLine()).toUpperCase();
        System.out.println("Enter "+stdName+"'s year of birth: ");
        while(true){
            int test=scan.nextInt();
            if(test>1889 && test<2019){
                this.yob=test;
                break;
            }else
                System.out.println("Invalid year of birth!");
        }
    }
    Student(String name, int yob){
        stdName=name.toUpperCase();
        System.out.println("Enter "+stdName+"'s registration number: ");
        regNo=scan.next();
    }
    Student(String name, String regNo){
        this.stdName = name.toUpperCase();
        this.regNo=regNo.toUpperCase();
        System.out.println("Enter "+stdName+"'s year of birth: ");
        this.yob=scan.nextInt();
        
    }
    Student(String name, int yob, String regNo) {
        this.stdName=name.toUpperCase();
        this.regNo=regNo.toUpperCase();
        this.yob=yob;
    }
    
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName.toUpperCase();
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo.toUpperCase();
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void setMarks(){
        System.out.println();
        for(int i=0;i<t;i++){
            System.out.print("Enter "+stdName+"'s marks in "+courses[i]+": ");
            int test=scan.nextInt();
            if(test>=0 && test<=100){
                marks[i]=test;
                sum+=marks[i];
            }else{
                System.out.println("Enter a score between 0 and 100!\n");
                i--;
            }
        }
    }
    public double getAve(){
        double ave=Math.round((sum/t)*100.0)/100.0;
        return ave;
    }
    public void printResults() {
        System.out.println("\nCourses\t\tMarks");
        for(int i=0;i<t;i++){
            System.out.println(courses[i]+"\t"+marks[i]);
        }
        System.out.println(stdName+"'s average is "+getAve());
    }
    public void printStdInfo(){
        System.out.printf("Full name: %s\nReg No: %s\nYear of birth: %d%n", stdName, regNo, yob);
    }
}
