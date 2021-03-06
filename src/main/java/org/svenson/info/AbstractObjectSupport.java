package org.svenson.info;

import java.beans.Introspector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public abstract class AbstractObjectSupport implements ObjectSupport
{


    protected static String propertyName(String name, int prefixLen)
    {
        return Introspector.decapitalize(name.substring(prefixLen));
    }

}
