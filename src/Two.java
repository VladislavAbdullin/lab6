import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Аннотация @Two
@Retention(RetentionPolicy.RUNTIME)  // Доступна во время выполнения
@Target(ElementType.TYPE)  // Может быть применена только к типу (классу)
public @interface Two {
    String first();  // Обязательное свойство first типа String
    int second();    // Обязательное свойство second типа int
}