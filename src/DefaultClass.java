
@Default(value = String.class)  // Применяем аннотацию к классу с указанием типа String
public class DefaultClass {

    @Default(value = Integer.class)  // Применяем аннотацию к полю с указанием типа Integer
    private int number;
}