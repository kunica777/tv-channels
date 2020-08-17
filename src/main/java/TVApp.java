import Components.TV;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TVApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TV tv = context.getBean("tvComponent", TV.class);

        loadMenu(tv);

        context.close();
    }

   public static void loadMenu(TV tv){
        boolean exit=false;
        while(exit==false) {
            Scanner sc = new Scanner(System.in);
            System.out.println("***********************************" +
                    "\nChoose option from the menu:" +
                    "\n1-view all channels" +
                    "\n2-switch to channel" +
                    "\n3-exit" +
                    "\n***********************************");
            String userSelection = sc.next();
            switch(userSelection){
                case "1": tv.loadAllChannels(); break;
                case "2": tv.playSpecificChannel(pickChannel()); break;
                case "3": exit=true; break;
                default:
                    System.out.println("Invalid input"); break;
            }
        }
   }

   public static int pickChannel(){
        boolean exit = false;
        while(!exit){
            Scanner sc = new Scanner(System.in);
            System.out.println("What channel you want to play: ");
            if(sc.hasNextInt()){
                int userSelection = sc.nextInt();
                return userSelection;
            }else{
                System.out.print("Press numeric key. ");
            } sc.next();
        }return -1;}
}
