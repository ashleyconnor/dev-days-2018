package devdays.movie_api.controllers

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.*

@RestControllerAdvice
class ExceptionController {

    private val logger = LoggerFactory.getLogger(ExceptionController::class.java)

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException::class)
    fun handleNoSuchElementException(nse:NoSuchElementException):Map<String, String> {
        logger.error("404 entity not found")
        return Collections.singletonMap("error", "not_found")
    }
}