package practical;

import java.util.Scanner;

class Employee {
    int age;
    String name,dept;
    float sal;

}

class Practical1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();

        Employee emp[] = new Employee[k];

        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data :");

            System.out.print("Enter employee Name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee Age :");
            emp[i].age = sc.nextInt();
            System.out.print("Enter employee salary :");
            emp[i].sal = sc.nextFloat();
            System.out.print("Enter Employee department :");
            emp[i].dept=sc.next();

        }

        System.out.println("\n\n============ All employee details are :============\n");

        for (int i = 0; i < k; i++) {
           System.out.println("Detail of "+(i+1)+" Employee "+emp[i].name+" "+emp[i].age+" "+emp[i].dept+" "+emp[i].sal);
        }
    }

}
