import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Аннотация @Validate
@Retention(RetentionPolicy.RUNTIME)  // Доступна во время выполнения
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})  // Может быть применена к типам и аннотациям
public @interface Validate {
    Class<?>[] value();  // Обязательное свойство value, которое является массивом классов
}