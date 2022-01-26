public class PrioritySetting {
    private int priority;

    public PrioritySetting(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
    //It maintains Single Responsibility Principle

    public void ChangePriority(int priority) {
        this.priority = priority;
    }
}
