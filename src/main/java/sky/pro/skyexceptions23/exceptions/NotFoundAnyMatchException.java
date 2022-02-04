package sky.pro.skyexceptions23.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Employee Not Found")
public class NotFoundAnyMatchException extends Exception{

}
