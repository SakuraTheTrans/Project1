import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();
    static void add(){
        System.out.println("Enter a description of the new task.");
        tasks.add(input.nextLine());
    }

    static void remove(){
        System.out.println("Enter the index of the task to remove.");
        tasks.remove(input.nextInt());
    }

    static void update(){
        System.out.println("Enter the index of the task to update.");
        int selectedTask = input.nextInt();
        input.nextLine();
        System.out.println("Enter the new description of the task.");
        tasks.set(selectedTask, input.nextLine());
    }

    static void list(){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        int userInput = 0;
        while(userInput != 5){
            System.out.println("Please choose an option:\n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.)");
            userInput = input.nextInt();
            input.nextLine();
            if (userInput == 1){
                add();
            }
            if (userInput == 2){
                remove();
            }
            if (userInput == 3){
                update();
            }
            if (userInput == 4){
                list();
            }
            if (userInput == 0){
                break;
            }
        }
    }
}