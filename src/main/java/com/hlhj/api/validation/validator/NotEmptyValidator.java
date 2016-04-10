package com.hlhj.api.validation.validator;

import com.hlhj.api.util.StringUtil;
import com.hlhj.api.validation.NotEmpty;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 非空注解验证器
 *
 * @author huangdaiyi
 * @since 1.0.0
 */
public class NotEmptyValidator implements ConstraintValidator<NotEmpty, String> {

    @Override
    public void initialize(NotEmpty constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return StringUtil.isNotEmpty(value);
    }
}
