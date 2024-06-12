package ToDoListExercise;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {
    private String name;
    private Queue<ToDoItem> tasks = new PriorityQueue<>();

    public void addTask(String name, String description, boolean isComplete, int priorityLevel) {
        tasks.add(new ToDoItem(name, description, isComplete, priorityLevel));
        //tasks.offer
    }

    public void removeTask(String itemName) {
        tasks.removeIf(toDo -> toDo.name.equals(itemName));
        //tasks.poll
    }

    public void getNextTask() {
        tasks.peek();
    }

    public void getAllTasks() {
        for (ToDoItem todo : tasks) {
            System.out.println(todo);
        }
    }

    public void getIncompleteTasks() {
        for (ToDoItem todo : tasks) {
            if (!todo.isComplete()) {
                System.out.println(todo.getName());
            }
        }
    }

    public void getCompleteTasks() {
        for (ToDoItem todo : tasks) {
            if (todo.isComplete()) {
                System.out.println(todo.getName());
            }
        }
    }

    public void markTaskComplete(String task) {
        for (ToDoItem todo : tasks) {
            if (todo.name.equals(task)) {
                todo.setComplete(true);
            }

        }
    }

    public void markTaskIncomplete(String task) {
        for (ToDoItem todo : tasks) {
            if (todo.name.equals(task)) {
                todo.setComplete(false);
            }
        }
    }


    public static class ToDoItem implements Comparable<ToDoItem> {
        private final String name;
        private final String description;
        private final int priorityLevel;
        private boolean isComplete;

        public ToDoItem(String name, String description, boolean isComplete, int priorityLevel) {
            this.name = name;
            this.description = description;
            this.isComplete = isComplete;
            this.priorityLevel = priorityLevel;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public boolean isComplete() {
            return isComplete;
        }

        public void setComplete(boolean complete) {
            isComplete = complete;
        }

        public int getPriorityLevel() {
            return priorityLevel;
        }

        @Override
        public int compareTo(ToDoItem task) {
            if (this.getPriorityLevel() < task.getPriorityLevel()) {
                return -1;
            }
            if (this.getPriorityLevel() == task.getPriorityLevel()) {
                return 0;
            }
            return 1;


        }

        @Override
        public String toString() {
            return "ToDoItem{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", isComplete=" + isComplete +
                    ", priorityLevel=" + priorityLevel +
                    '}';
        }
    }
}
