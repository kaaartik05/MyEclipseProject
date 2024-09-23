package factory;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<String> viewingHistory;

    public User(String username) {
        this.username = username;
        this.viewingHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addViewingHistory(String genre) {
        viewingHistory.add(genre);
    }

    public List<String> getViewingHistory() {
        return viewingHistory;
    }
}
