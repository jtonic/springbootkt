package jtonic.tmp.springbootkt.config

import org.springframework.aop.Advisor
import org.springframework.aop.aspectj.AspectJExpressionPointcut
import org.springframework.aop.support.DefaultPointcutAdvisor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.validation.beanvalidation.MethodValidationInterceptor


@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
class ValidationConfig {

    @Bean
    fun methodValidationInterceptor() =
            MethodValidationInterceptor()

    @Bean
    fun methodValidationAdvisor(): Advisor {
        val pointcut = AspectJExpressionPointcut()
        pointcut.expression = "within(@org.springframework.validation.annotation.Validated *)"
        val advisor = DefaultPointcutAdvisor(pointcut, methodValidationInterceptor())
        advisor.order = 10
        return advisor
    }
}
