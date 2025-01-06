package Behavioral.State.DocumentWorkFlow.State;

import Behavioral.State.DocumentWorkFlow.DocumentContext;

public class PublishedState implements State{
    @Override
    public void publish(DocumentContext context) {
        System.out.println("Document is already Published. No further publishing allowed.");
    }

    @Override
    public void review(DocumentContext context) {
        System.out.println("Cannot review a document in Published state.");
    }
}
