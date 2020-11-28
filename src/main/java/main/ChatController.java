package main;

import main.model.User;
import main.model.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ChatController
{

    private final UserRepository userRepository;

    public ChatController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/init")
    public HashMap<String, Boolean> init()
    {
        HashMap<String, Boolean> response = new HashMap<>();

        Map<String, Boolean> result = new HashMap<>();
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        Optional<User> userOpt = userRepository.findBySessionId(sessionId);

        response.put("result", userOpt.isPresent());
        return response;
    }

    @PostMapping("/auth")
    public HashMap<String, Boolean> auth(@RequestParam String name)
    {
        HashMap<String, Boolean> response = new HashMap<>();
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        User user = new User();
        user.setName(name);
        user.setSessionId(sessionId);
        userRepository.save(user);
        response.put("result", true);
        return response;
    }

    @PostMapping("/message")
    public Boolean sendMessage(@RequestParam String message)
    {
        return true;
    }

    @GetMapping("/message")
    public List<String> getMessagesList()
    {
        return null;
    }

    @GetMapping("/user")
    public HashMap<Integer, String> getUsersList()
    {
        return null;
    }
}
