package Behavioral.State.DocumentWorkFlow.State;

import Behavioral.State.DocumentWorkFlow.DocumentContext;

public class ModerationState implements State{

    @Override
    public void publish(DocumentContext context) {
        System.out.println("Publishing document from Moderation to Published.");
        context.setState(new PublishedState());
    }

    @Override
    public void review(DocumentContext context) {
        System.out.println("Reviewing document in Moderation state.");
    }
}
