package za.co.mafsoft.sns.endpoint.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @PostMapping("/receive")
    public ResponseEntity<Void> receive(@RequestBody String text){
        System.out.println(text);
        return ResponseEntity.ok().build();
    }
}
