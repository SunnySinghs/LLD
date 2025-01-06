package Behavioral.State.DocumentWorkFlow;

public class Main {
    public static void main(String[] args) {
        DocumentContext document = new DocumentContext();

        System.out.println("Current State: Draft");
        document.review(); // Cannot review in Draft
        document.publish(); // Transition to Moderation

        System.out.println("\nCurrent State: Moderation");
        document.review(); // Review in Moderation
        document.publish(); // Transition to Published

        System.out.println("\nCurrent State: Published");
        document.review(); // Cannot review in Published
        document.publish(); // Already Published

    }
}
