package Behavioral.Momento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMomento> history;

    public ConfigurationCareTaker() {
        this.history = new ArrayList<>();
    }

    public void addMomento(ConfigurationMomento momento) {
        history.add(momento);
    }

    public ConfigurationMomento undo() {
        if (!history.isEmpty()) {
            return history.removeLast();
        }
        return null;
    }
}
