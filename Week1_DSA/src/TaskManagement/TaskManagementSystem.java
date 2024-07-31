package TaskManagement;
public class TaskManagementSystem {
    private TaskNode head;
    public TaskManagementSystem() {
        this.head = null;
    }
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public Task searchTaskById(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }
    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
    public void deleteTaskById(String taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " has been removed.");
            return;
        }
        TaskNode current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task with ID " + taskId + " has been removed.");
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }
}
