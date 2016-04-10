package com.hlhj.api.validation.validator;

import com.hlhj.api.validation.MinLength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 最小长度注解验证器
 *
 * @author huangdaiyi
 * @since 1.0.0
 */
public class MinLengthValidator implements ConstraintValidator<MinLength, String> {

    private int length;

    @Override
    public void initialize(MinLength constraintAnnotation) {
        length = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() >= length;
    }
}
