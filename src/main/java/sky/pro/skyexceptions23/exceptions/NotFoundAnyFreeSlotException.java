package sky.pro.skyexceptions23.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Out of Spot for employee")
public class NotFoundAnyFreeSlotException extends Throwable {
}
