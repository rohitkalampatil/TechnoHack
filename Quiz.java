import java.util.Scanner;

public class Quiz
{
    Scanner sc=new Scanner(System.in);


    public void menu()
    {
        int ch;
        System.out.println("Enter your choice: ");

        System.out.println("1.Start Exam");
        System.out.println("2.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                start_exam();
                menu();
                break;
            case 2:
                System.exit(0);
                break;
            default :
                System.out.println("Invalid choice!!!");
        }
    }

    public void start_exam()
    {
        long start_time=System.currentTimeMillis();
        long end_time=start_time+30;
        int score=0;
        int ans;
        System.out.println("Start Exam!!!");
        while(System.currentTimeMillis()<end_time)
        {
            System.out.println("You have 5 quetions and time limit is 5 minutes");
            System.out.println("Each quetion for 5 marks and negative marking is there...");
            System.out.println("Q1.Which component is used to compile, debug and execute the java programs?");
            System.out.println("1)JRE"+"\t"+"2)JIT"+"\t"+"3)JDK"+"\t"+"4)JVM");
            System.out.println("Enter your ans: ");
            ans=sc.nextInt();
            System.out.println("----your Answer is saved----");
            if(ans==3)
            {
                score=score+5;
            }
            else
            {
                score--;
            }


            System.out.println("Q2.Which one of the following is not a Java feature?");
            System.out.println("1)Object-oriented"+"\t"+"2)Use of pointers"+"\t"+"3)Portable"+"\t"+"4)Dynamic and Extensible");
            System.out.println("Enter your ans: ");
            ans=sc.nextInt();
            System.out.println("----your Answer is saved----");
            if(ans==2)
            {
                score=score+5;
            }
            else
            {
                score--;
            }


            System.out.println("Q3.What is the extension of java code files?");
            System.out.println("1).js"+"\t"+"2).txt"+"\t"+"3).class"+"\t"+"4).java");
            System.out.println("Enter your ans: ");
            ans=sc.nextInt();
            System.out.println("----your Answer is saved----");
            if(ans==4)
            {
                score=score+5;
            }
            else
            {
                score--;
            }


            System.out.println("Q4.Which of the following is not an OOPS concept in Java?");
            System.out.println("1)Polymorphism"+"\t"+"2)Inheritance"+"\t"+"3)Compilation"+"\t"+"4)Encapsulation");
            System.out.println("Enter your ans: ");
            ans=sc.nextInt();
            System.out.println("----your Answer is saved----");
            if(ans==3)
            {
                score=score+5;
            }
            else
            {
                score--;
            }

            System.out.println("");

            System.out.println("Q5.Which of these keywords is used to define interfaces in Java?");
            System.out.println("1)intf"+"\t"+"2)Intf"+"\t"+"3)interface"+"\t"+"4)Interface");
            System.out.println("Enter your ans: ");
            ans=sc.nextInt();
            System.out.println("----your Answer is saved----");
            if(ans==3)
            {
                score=score+5;
            }
            else
            {
                score--;
            }
            break;
        }
        System.out.println("you have finished the Exam!!!");
        System.out.println("Congratulations!!!");
        System.out.println("*****your Score is "+score+"/50"+"*****");
    }

    public static void main(String args[])
    {
        Quiz e1=new Quiz();
        e1.menu();
    }
}
