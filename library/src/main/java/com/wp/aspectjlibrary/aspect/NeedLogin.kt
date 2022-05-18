package com.wp.aspectjlibrary.aspect

/**
 * Created by wp on 2019/12/6.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class NeedLogin {
}