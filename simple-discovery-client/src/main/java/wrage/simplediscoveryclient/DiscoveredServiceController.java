package wrage.simplediscoveryclient;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DiscoveredServiceController {
    private final DiscoveryClient discoveryClient;

    public DiscoveredServiceController( DiscoveryClient discoveryClient ) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping( path = { "/services" } )
    public ResponseEntity<List<String>> getDiscoveredServices() {
        return ResponseEntity.ok( discoveryClient.getServices() );
    }

    @GetMapping( path = { "/services/{applicationName}" } )
    public ResponseEntity<List<ServiceInstance>> getServiceInstancesByApplicationName( @PathVariable( "applicationName" ) String applicationName ) {
        return ResponseEntity.ok( discoveryClient.getInstances( applicationName ) );
    }
}
