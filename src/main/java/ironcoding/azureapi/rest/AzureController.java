package ironcoding.azureapi.rest;

import ironcoding.azureapi.model.Request;
import ironcoding.azureapi.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("azure-api")
public class AzureController {

    @GetMapping("/hello")
    public Response getGreeting(@RequestBody Request request) {
        return Response.builder()
                .name(request.getName())
                .age(request.getAge())
                .message("Hello from Spring boot - Controller for Azure-Api")
                .dateTime(LocalDateTime.now())
                .build();
    }

}
