import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Task{
    private String taskName;
    private String dueDate;
    private boolean isDone;

    public Task(String taskName,String dueDate){
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.isDone = false;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getDueDate(){
        return dueDate;
    }

    public boolean isDone(){
        return isDone;
    }

    public void marksTaskAsDone(){
        isDone = true;
    }

    @Override
    public String toString(){
        return "Task: " + taskName + ",Due Date: " + dueDate + ", Status: " + (isDone ? "Done" : "Not Done");
    }

}

class TaskManager{
    private ArrayList<Task> tasks;
    private static final String FILE_NAME = "tasks.txt";

    public TaskManager(){
        tasks = new ArrayList<>();
        loadTasksFromFile();
    }

    public void addTask(Task task){
        tasks.add(task);
        saveTasksToFile();
    }

    public void viewTasks(){
        for (Task task : tasks){
            System.out.println(task);
        }
    }

    public void marksTaskAsDone(int taskIndex){
        if (taskIndex >= 0 && taskIndex < tasks.size()){
            Task task = tasks.get(taskIndex);
            task.marksTaskAsDone();
            saveTasksToFile();
        }else{
            System.out.println("Invalid task index");
        }
    }

    public void deleteTask(int taskIndex){
        if (taskIndex >= 0 && taskIndex < tasks.size()){
            tasks.remove(taskIndex);
            saveTasksToFile();
        }else{
             System.out.println("Invalid task index");
        }
    }

     private void loadTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Task task = new Task(parts[0], parts[1]);
                    if (parts[2].equals("Done")) {
                        task.marksTaskAsDone();
                    }
                    tasks.add(task);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks from file: " + e.getMessage());
        }
    }

    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.getTaskName() + "," + task.getDueDate() + "," + (task.isDone() ? "Done" : "Not Done"));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks to file: " + e.getMessage());
        }
    }
}

public class Tasktracker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nTask Tracker Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    Task newTask = new Task(taskName, dueDate);
                    taskManager.addTask(newTask);
                    System.out.println("Task added.");
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter the index of the task to mark as done: ");
                    int taskIndex = scanner.nextInt();
                    taskManager.marksTaskAsDone(taskIndex);
                    break;
                case 4:
                    System.out.print("Enter the index of the task to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting Task Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}





