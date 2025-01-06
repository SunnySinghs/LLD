package Behavioral.State.DocumentWorkFlow.State;

import Behavioral.State.DocumentWorkFlow.DocumentContext;

public class DraftState implements State{

    @Override
    public void publish(DocumentContext context) {
        System.out.println("Publishing document from Draft to Moderation.");
        context.setState(new ModerationState());
    }

    @Override
    public void review(DocumentContext context) {
        System.out.println("Cannot review a document in Draft state.");
    }
}
