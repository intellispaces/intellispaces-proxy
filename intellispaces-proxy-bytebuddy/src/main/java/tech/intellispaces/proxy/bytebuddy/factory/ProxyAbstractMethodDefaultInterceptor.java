package tech.intellispaces.proxy.bytebuddy.factory;

import tech.intellispaces.general.exception.UnexpectedExceptions;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.reflect.Method;

public class ProxyAbstractMethodDefaultInterceptor {

  ProxyAbstractMethodDefaultInterceptor() {}

  @RuntimeType
  public Object intercept(@Origin Method method) {
    throw UnexpectedExceptions.withMessage("Interceptor of abstract proxy method '{0}' is not defined. " +
            "Class {1}", method.getName(), method.getDeclaringClass().getCanonicalName());
  }
}
