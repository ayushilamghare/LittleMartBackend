package in.littlemart.exceptions;

import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;


@Getter
@Setter
public class ExceptionResponse {
    private String errorMessage;
    private LocalDateTime timeStamp;

    public ExceptionResponse(String errorMessage){
        this.errorMessage = errorMessage;
        this.timeStamp = LocalDateTime.now();
    }
}
