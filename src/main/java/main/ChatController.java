package main;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ChatController
{
    @GetMapping("/init")
    public Boolean init()
    {
        //TODO: check sessionId. If found => true, if not => false
        return true;
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
