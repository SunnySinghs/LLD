package Behavioral.State.DocumentWorkFlow;

import Behavioral.State.DocumentWorkFlow.State.DraftState;
import Behavioral.State.DocumentWorkFlow.State.State;

public class DocumentContext {
    private State state;

    public DocumentContext() {
        this.state = new DraftState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    public void review() {
        state.review(this);
    }
}
