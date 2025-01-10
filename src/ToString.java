import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Аннотация @ToString
@Retention(RetentionPolicy.RUNTIME)  // Доступна во время выполнения
@Target({ElementType.FIELD, ElementType.TYPE})  // Может быть применена к типам и полям
public @interface ToString {
    String value() default "YES";  // Необязательное свойство, по умолчанию "YES"
}