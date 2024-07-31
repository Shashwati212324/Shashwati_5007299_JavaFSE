package TaskManagement;

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(new Task("T001", "Design Database", "In Progress"));
        tms.addTask(new Task("T002", "Develop API", "Not Started"));
        tms.addTask(new Task("T003", "Test Application", "Completed"));

        System.out.println("Task List:");
        tms.traverseTasks();

        System.out.println("\nSearching for task with ID T002:");
        Task task = tms.searchTaskById("T002");
        if (task != null) {
            System.out.println("Found: " + task);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting task with ID T001:");
        tms.deleteTaskById("T001");
        System.out.println("\nTask List after deletion:");
        tms.traverseTasks();
    }
}
