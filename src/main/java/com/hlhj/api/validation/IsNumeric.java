package com.hlhj.api.validation;

import com.hlhj.api.validation.validator.IsNumericValidator;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

/**
 * 数字注解
 *
 * @author huangdaiyi
 * @since 1.0.0
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsNumericValidator.class)
public @interface IsNumeric {

    String message() default "is_numeric";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
