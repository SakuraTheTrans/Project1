import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        int selectedTask = 0;
        int userInput = 0;
        while(userInput != 5){
            System.out.println("Please choose an option:\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.)");
            userInput = input.nextInt();
            input.nextLine();
            if (userInput == 1){
                System.out.println("Enter a description of the new task.");
                tasks.add(input.nextLine());
            }
            if (userInput == 2){
                System.out.println("Enter the index of the task to remove.");
                tasks.remove(input.nextInt());
            }
            if (userInput == 3){
                System.out.println("Enter the index of the task to update.");
                selectedTask = input.nextInt();
                input.nextLine();
                System.out.println("Enter the new description of the task.");
                tasks.set(selectedTask, input.nextLine());
            }
            if (userInput == 4){
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + ". " + tasks.get(i));
                }
            }
            if (userInput == 0){
                break;
            }
        }
    }
}