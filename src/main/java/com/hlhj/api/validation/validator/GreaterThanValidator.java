package com.hlhj.api.validation.validator;

import com.hlhj.api.validation.GreaterThan;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 大于值注解验证器
 *
 * @author huangdaiyi
 * @since 1.0.0
 */
public class GreaterThanValidator implements ConstraintValidator<GreaterThan, Integer> {

    private Integer value;

    @Override
    public void initialize(GreaterThan constraintAnnotation) {
        value = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value > this.value;
    }
}
