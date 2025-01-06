package Behavioral.State.DocumentWorkFlow.State;

import Behavioral.State.DocumentWorkFlow.DocumentContext;

public interface State {
    public void publish(DocumentContext context);
    public void review(DocumentContext context);
}
