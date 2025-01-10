import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Аннотация @Cache
@Retention(RetentionPolicy.RUNTIME)  // Доступна во время выполнения
@Target(ElementType.TYPE)  // Целью является только тип (класс или интерфейс)
public @interface Cache {
    String[] value() default {};  // Необязательное свойство value типа String[] с пустым массивом по умолчанию
}