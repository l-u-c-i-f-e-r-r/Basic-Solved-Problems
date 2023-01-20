import java.util.*;
class Empoyee{
    String Emp_name,Emp_address,Emp_email,Emp_number,Emp_id;

    double salary;
    Scanner sc=new Scanner(System.in);
    void Employee(){
        System.out.println("Enter your name:");
        Emp_name=sc.next();
        System.out.println("Enter Address: ");
        Emp_address=sc.next();
        System.out.println("Enter Email:");
        Emp_email=sc.next();
        System.out.println("Eter number: ");
        Emp_number=sc.next();
        System.out.println("Enter id:");
        Emp_id=sc.next();
    }
    void display(){
        System.out.println("Name: "+Emp_name);
        System.out.println("Address: "+Emp_address);
        System.out.println("Id: "+Emp_id);
        System.out.println("Number: "+Emp_number);
        System.out.println("Email: "+Emp_email);
    }
}
    class Teaching extends Empoyee{
        double GP,NP,CF,PF;
        GP=20000;
        CF=GP*0.12;
        PF=GP*0.01;
        void np(){
            NP=GP+CF+PF;
            System.out.println("The salary ="+NP);
        }
    }
    class nonTeaching extends Empoyee{
        double GP,NP,CF,PF;
        GP=10000;
        CF=GP*0.12;
        PF=GP*0.01;
        void netPay(){
            NP=GP+CF+PF;
            System.out.println("The salary ="+NP);
        }
    }
    public class Inheri{
        public static void main(String args[]){
            nonTeaching ob=new nonTeaching();
        }
    }

