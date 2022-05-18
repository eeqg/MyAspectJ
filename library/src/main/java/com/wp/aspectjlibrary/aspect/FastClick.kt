package com.wp.aspectjlibrary.aspect

/**
 * 自定义注解接口
 *
 * Created by wp on 2019/10/7.
 */
@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
annotation class FastClick
