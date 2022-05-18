package com.wp.aspectjlibrary.aspect

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

/**
 * Created by wp on 2019/12/6.
 */
@Aspect
class LoginAspect {
    /**
     * 切点
     */
    @Pointcut("execution(@com.wp.aspectjlibrary.aspect.NeedLogin * *(..))")
    fun pointCutLogin() {
//        LogUtils.d("-----pointCutLogin()}")
    }

    @Around("pointCutLogin()")
    @Throws(Throwable::class)
    fun aroundLogin(proceedingJoinPoint: ProceedingJoinPoint) {
//        LogUtils.d("-----aroundLogin()--isLogin: ${MainHelper.instance.isLogin()}")
//        if (MainHelper.instance.isLogin()) {
//            proceedingJoinPoint.proceed()
//        } else {
//            MainHelper.instance.requestLogin(APP.INSTANCE)
//        }
    }
}