package chat;

import java.util.*;
import java.util.function.Consumer;
public class ChatRoom {
    private List<User> users = new ArrayList<>();
    public class User {
        private String name;
        private Consumer<String> messageHandler;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void joinRoom() {
            users.add(this);
            System.out.println(name + " joined the chat room.");
        }
        public void leaveRoom() {
            users.remove(this);
            System.out.println(name + " left the chat room.");
        }
        public void sendMessage(String message) {
            if (messageHandler != null) {
                messageHandler.accept(message);
            } else {
                System.out.println(name + ": " + message);
            }
        }
        public void setMessageHandler(Consumer<String> handler) {
            this.messageHandler = handler;
        }
    }
    public void broadcastMessage(User sender, String message) {
        users.stream().filter(user -> !user.equals(sender)).forEach(user -> {
            System.out.println(sender.getName() + " to " + user.getName() + ": " + message);
        });
    }
}