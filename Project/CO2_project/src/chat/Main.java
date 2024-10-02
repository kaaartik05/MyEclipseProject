package chat;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ChatRoom.User user1 = chatRoom.new User("Alice");
        ChatRoom.User user2 = chatRoom.new User("Bob");
        ChatRoom.User user3 = chatRoom.new User("Charlie");
        user1.joinRoom();
        user2.joinRoom();
        user3.joinRoom();
        user1.setMessageHandler(message -> chatRoom.broadcastMessage(user1, message));
        user2.setMessageHandler(message -> chatRoom.broadcastMessage(user2, message));
        user3.setMessageHandler(message -> chatRoom.broadcastMessage(user3, message));
        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hey Alice!");
        user3.sendMessage("Hello Alice and Bob!");
        user1.leaveRoom();
        user2.leaveRoom();
        user3.leaveRoom();
    }
}
