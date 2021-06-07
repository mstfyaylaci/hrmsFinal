package kodlamaio.hrms.core.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import kodlamaio.hrms.core.utilities.results.ErrorDataResult;

@RestControllerAdvice
public class ApiExceptionHandler {

	 @ExceptionHandler(MethodArgumentNotValidException.class)
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		
		  Map<String, String> validationErrors = new HashMap<String, String>();
		  
		  for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
	            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
	        }
		  
		  ErrorDataResult<Object> errors = new ErrorDataResult<Object>(
	                validationErrors, "HATA.");

	        return errors;
	}
}
