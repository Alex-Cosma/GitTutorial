public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        // this is wrong
        task.setName("properName");
        System.out.println(task);
    }
}
