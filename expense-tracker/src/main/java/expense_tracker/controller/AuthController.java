package expense_tracker.controller;

import expense_tracker.dto.RegisterRequest;
import expense_tracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value="/register", produces="text/plain")
    public String register(@Valid @RequestBody RegisterRequest request) {
        System.out.println("REGISTER API CALLED");
        return userService.register(request);
    }
}