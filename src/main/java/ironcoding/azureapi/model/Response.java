package ironcoding.azureapi.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Response {
    private String name;
    private Integer age;
    private String message;
    private LocalDateTime dateTime;
}
