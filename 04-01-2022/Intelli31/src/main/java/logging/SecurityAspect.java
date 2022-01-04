package logging;

import model.Comment;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;


import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
public class SecurityAspect {

    private Logger logger =
            Logger.getLogger(SecurityAspect.class.getName());
    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");
        Comment comment = new Comment();
        comment.setText("Some other text!");
        Object [] newArguments = {comment};
        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned " + returnedByMethod);
        return "FAILED";

    }
}
