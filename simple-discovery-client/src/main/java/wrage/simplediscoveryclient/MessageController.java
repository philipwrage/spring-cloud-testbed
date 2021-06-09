package wrage.simplediscoveryclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    @Value( "${message:Howdy}" )
    private String message;

    @GetMapping(path = {"/message"})
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok( message );
    }
}
