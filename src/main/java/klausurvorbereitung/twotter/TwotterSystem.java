package klausurvorbereitung.twotter;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwotterSystem {
    private final Map<User, List<Message>> userMessages = new HashMap<>();

    public void addMessage(User user, Message message) {
        userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getAllMessages(){
        return userMessages.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }


    public List<Message> getAllMessagerFromUser(User user) {
        return userMessages.getOrDefault(user, new ArrayList<>());
    }

    public List<Message> getAllMessagesFromDate(String date){
        return userMessages.values().stream()
                .flatMap(List::stream)
                .filter(m -> m.getCreationDate().equals(date))
                .collect(Collectors.toList());
    }
}
