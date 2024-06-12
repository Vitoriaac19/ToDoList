import ToDoListExercise.ToDoList;

public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Cake", "Bake a cake", false, 2);
        toDoList.addTask("Buy", "Buy bread", false, 4);
        toDoList.addTask("Drink", "Drink water", false, 7);


        toDoList.getAllTasks();
        System.out.println("-----------------");
        toDoList.getIncompleteTasks();
        System.out.println("-----------------");
        toDoList.markTaskComplete("Cake");
        toDoList.getAllTasks();
        toDoList.getCompleteTasks();


    }
}