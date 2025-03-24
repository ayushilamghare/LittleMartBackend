package in.littlemart.exceptions.handler;


import in.littlemart.exceptions.ExceptionResponse;
import in.littlemart.exceptions.LittleMartException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//Any Exception if occurs, then take advice from this class
public class GlobalExceptionHandler {


    @ExceptionHandler(value = LittleMartException.class)
    public ResponseEntity<ExceptionResponse> handleLittleMartException(LittleMartException e){
        System.out.println("LittleMartException handled.");

        ExceptionResponse exceptionResponse = new ExceptionResponse(e.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
