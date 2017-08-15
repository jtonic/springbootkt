package jtonic.tmp.springbootkt.advice

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

/**
 * Created by Antonel Ernest Pazargic on 15/08/2017.
 * @author Antonel Ernest Pazargic
 */
@RestControllerAdvice
class ValidationHandingAdvice {

    @ExceptionHandler(ConstraintViolationException::class)
    fun handleValidationExceptions(e: ConstraintViolationException): ResponseEntity<String>  =
        when {
            e.constraintViolations.isNotEmpty() -> {
                val constraintViolation = e.constraintViolations.first()
                ResponseEntity.ok("${constraintViolation.propertyPath} = ${constraintViolation.invalidValue} but ${constraintViolation.message}")
            }
            else -> ResponseEntity.ok().build<String>()
        }

}