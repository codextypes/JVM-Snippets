package xyz.joshaustin.snippets;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Risk {
    String danger();
    int level() default 0;
}
