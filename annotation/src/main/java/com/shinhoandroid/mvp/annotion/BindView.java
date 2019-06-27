package com.shinhoandroid.mvp.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Liupengfei
 * @describe TODO
 * @date on 2019/6/26 17:30
 */


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface BindView {

    int value();
}
