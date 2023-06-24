package com.group.dashboard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MailList {
    static Scanner scanf = new Scanner(System.in);
    static Map<String,DiscussionDashboard> groups = new HashMap<>();
    static Map<String,Student> students = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("click enter to start....");
        while(true){
        scanf.nextLine();
        System.out.println("1. Add New Student");
        System.out.println("2. View Added Students");
        System.out.println("3. Add New Group");
        System.out.println("4. View Added Groups");
        System.out.println("5. Register Student to a Group");
        System.out.println("6. Send Message");
        System.out.println("7. End Program");
        int option = scanf.nextInt();
        if (option == 7)
            break;
        switch (option) {
            case 1:
                System.out.println("Add New Student: ");
                scanf.nextLine();
                String student = scanf.nextLine();
                students.put(student.toLowerCase(),new Student(student));
                System.out.println(student+" has been added. click enter to continue....");
                break;
            case 2:
                System.out.println(".......Added Students........... ");
                int num =1;
                for (String key: students.keySet()) {
                    System.out.println(num+". "+key);
                    num++;
                }
                System.out.println("click enter to continue....");
                scanf.nextLine();
                break;
            case 3:
                System.out.println("Add New group: ");
                scanf.nextLine();
                String group = scanf.nextLine();
                groups.put(group.toLowerCase()+".com",new DiscussionDashboard());
                System.out.println(group+" has been added. click enter to continue....");
                break;
            case 4:
                System.out.println(".......Added Groups........... ");
                int num2 =1;
                for (String key: groups.keySet()) {
                    System.out.println(num2+". "+key);
                    num2++;
                }
                System.out.println("click enter to continue....");
                scanf.nextLine();
                break;
            case 5:
                System.out.println("Student: ");
                scanf.nextLine();
                String student1 = scanf.nextLine();
                System.out.println("Group: ");
                String group1 = scanf.nextLine();
                groups.get(group1.toLowerCase()+".com").registerObserver(students.get(student1.toLowerCase()));
                System.out.println(student1+" has been registered to "+group1+". click enter to continue....");
                break;
            case 6:
                System.out.println("Enter mail adress");
                scanf.nextLine();
                String mail = scanf.nextLine();

                System.out.println("Enter Message to send");
                String msg = scanf.nextLine();

                String[] mailParts = mail.split("\\@");
                if(mailParts.length == 1){
                    groups.get(mail).postMessage(msg);
                }
                else if(mailParts.length == 2){
                    students.get(mailParts[0]).update(msg);
                }
                System.out.println("click enter to continue....");
                break;
            default:
                System.out.println("Wrong entry, click enter to try again");
                break;
        }
    }
        
    }
}
