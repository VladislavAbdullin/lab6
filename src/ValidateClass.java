// Пример аннотации, которую можно указать в свойстве value аннотации @Validate
@interface Proverka {}

@Validate(value = {Proverka.class})  // Применяем аннотацию к классу
public class ValidateClass {

    private String name;
}