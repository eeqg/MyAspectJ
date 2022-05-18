package com.wp.aspectjlibrary.aspect

import android.util.Log

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before

/**
 * 处理切面的类
 *
 *
 * Created by wp on 2019/10/7.
 */
@Aspect
class ClickAspect {
    private val TAG = ClickAspect::class.java.simpleName

    private var enableDoubleClick = false
    private var lastClickTime: Long = 0

    @Before("execution(@com.pl.handbag.common.aspect.FastClick  * *(..))")
    @Throws(Throwable::class)
    fun enableFastClick(joinPoint: JoinPoint) {
        Log.d(TAG, "-----enableFastClick")
        enableDoubleClick = true
    }

    /**
     * 防止重复点击事件
     */
    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    @Throws(Throwable::class)
    fun onClickHook(joinPoint: ProceedingJoinPoint) {
        // Log.d(TAG, "-----enableDoubleClick: " + enableDoubleClick);
        if (enableDoubleClick || System.currentTimeMillis() - lastClickTime >= FILTER_TIME) {
            joinPoint.proceed()
            lastClickTime = System.currentTimeMillis()
            enableDoubleClick = false
        } else {
            //hook click.
            Log.d(TAG, "-----onClickHook")
        }
    }

    companion object {
        private const val FILTER_TIME = 400L
    }
}
