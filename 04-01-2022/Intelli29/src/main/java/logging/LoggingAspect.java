package logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import javax.print.attribute.standard.JobImpressions;
import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint jointPoint) throws Throwable {

        String methodName = jointPoint.getSignature().getName();

        Object [] arguments = jointPoint.getArgs();

        logger.info("Method "+methodName+" with paramaters "+ Arrays.asList(arguments)+" will execute");

        Object returnedByMethod = jointPoint.proceed();

        logger.info("Method executed and returned "+returnedByMethod);

        return returnedByMethod;

    }
}
