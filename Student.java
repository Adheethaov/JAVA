//java program
//date :23/07/2018
//to write a class student with instances name, rollno , marks of 2 subjects and to find total marks
//to find for 5 students
//concept of array objects


import java.util.*;
class studentDemo
{
	String name;
	int rollno;
	int mark1,mark2;
	void total()
	{
		int totalmark;
		totalmark=mark1+mark2;
		System.out.println("The total mark for student " + name + "is" + totalmark);
	}
}

public class Student
{
public static void main(String args[])
{
	studentDemo[] mystudent=new studentDemo[5];
	int i;
	Scanner c=new Scanner(System.in);
	
	/*for(i=0;i<5;i++)
	{
		//studentDemo[] mystudent=new studentDemo[5];
		System.out.println("Enter the name: ");
		mystudent[i].name=c.next();
		System.out.println("Enter the rollno:");
		mystudent[i].rollno=c.nextInt();
		System.out.println("Enter the mark for Subject 1:");
		mystudent[i].mark1=c.nextInt();
		System.out.println("Enter the mark for Subject 2:");
		mystudent[i].mark2=c.nextInt();
	}*/
	for(i=0;i<3;i++)
	{
	    mystudent[i]=new studentDemo();
	}
	for(i=0;i<3;i++)
	{
        System.out.println("Enter the name: ");
		mystudent[i].name=c.next();
		System.out.println("Enter the rollno:");
		mystudent[i].rollno=c.nextInt();
		System.out.println("Enter the mark for Subject 1:");
		mystudent[i].mark1=c.nextInt();
		System.out.println("Enter the mark for Subject 2:");
		mystudent[i].mark2=c.nextInt();
	}
	for(i=0;i<3;i++)
	{
		//mystudent[i]=new studentDemo();
		mystudent[i].total();
	}
}
}